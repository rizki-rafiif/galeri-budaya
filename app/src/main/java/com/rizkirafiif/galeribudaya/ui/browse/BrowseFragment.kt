package com.rizkirafiif.galeribudaya.ui.browse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
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
    private var _binding: FragmentBrowseBinding?= null
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
        if (savedInstanceState == null){
            loadData()
        } else {
            val list = savedInstanceState.getParcelableArrayList<Budaya>("EXTRA_STATE")
            if (list != null){
                adapter.listBudaya = list
            }
        }
        val dataSearch = requireActivity().findViewById<EditText>(R.id.et_search)
        val data = dataSearch.text.toString()
        val bundle = Bundle()
        bundle.putString("search", data)
        val fragRes = ResultFragment()
        fragRes.arguments = bundle

        binding.etSearch.requestFocus()

        binding.etSearch.setOnEditorActionListener(TextView.OnEditorActionListener { textView, itemId, keyEvent ->
            if (keyEvent != null){
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.fragment_container_view, fragRes)
                    setReorderingAllowed(true)
                    addToBackStack(null)
                }
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun loadData(){

        val cursor = databaseHelper.queryOfDaerah()
        var budaya = helper.mapBrowseCursorToArrayList(cursor)
        if (budaya.size > 0){
            adapter.listBudaya = budaya
        } else {
            adapter.listBudaya = ArrayList()
            Snackbar.make(binding.rvBrowse, "Tidak ada data saat ini", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}