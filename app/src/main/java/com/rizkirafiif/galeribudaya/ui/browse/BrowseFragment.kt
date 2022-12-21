package com.rizkirafiif.galeribudaya.ui.browse

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.MainActivity
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentBrowseBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.browse.result.ResultFragment

class BrowseFragment : Fragment() {
    private var _binding: FragmentBrowseBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: BrowseAdapter
    private lateinit var databaseHelper: DatabaseHelper


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBrowseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvBrowse.layoutManager = LinearLayoutManager(this.context)
        binding.rvBrowse.setHasFixedSize(true)

        adapter = BrowseAdapter(childFragmentManager)
        binding.rvBrowse.adapter = adapter
        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null) {
            val cursor = databaseHelper.queryOfDaerah()
            var budaya = helper.mapBrowseCursorToArrayList(cursor)
            if (budaya.size > 0) {
                adapter.listBudaya = budaya
            } else {
                adapter.listBudaya = ArrayList()
                Snackbar.make(binding.rvBrowse, "Tidak ada data saat ini", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.ibSearch.setOnClickListener {
            val dataSearch = binding.etSearch.text.toString()
            if (dataSearch == ""){
                binding.etSearch.error = "Pastikan kolom tidak kosong"
            }else{
                val bundle = Bundle()
                bundle.putString("search", dataSearch)
                val fragRes = ResultFragment()
                fragRes.arguments = bundle
                // to clear the text
                binding.etSearch.text.clear()
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fragment_container_view, fragRes)
                    setReorderingAllowed(true)
                    addToBackStack(null)
                }
            }
        }

        // to set action enter button on keyboard
        // parameter 1 = textview
        // parameter 2 = id
        // parameter 3 = key event
        binding.etSearch.setOnEditorActionListener(TextView.OnEditorActionListener{_, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                val dataSearch = binding.etSearch.text.toString()
                if (dataSearch == ""){
                    binding.etSearch.error = "Pastikan kolom tidak kosong"
                }else{
                    val bundle = Bundle()
                    bundle.putString("search", dataSearch)
                    val fragRes = ResultFragment()
                    fragRes.arguments = bundle
                    // to clear the text
                    binding.etSearch.text.clear()
                    requireActivity().supportFragmentManager.commit {
                        replace(R.id.fragment_container_view, fragRes)
                        setReorderingAllowed(true)
                        addToBackStack(null)
                    }
                }
                return@OnEditorActionListener true
            }
            false
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}