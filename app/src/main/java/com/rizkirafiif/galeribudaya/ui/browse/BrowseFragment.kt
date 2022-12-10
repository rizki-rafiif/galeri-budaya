package com.rizkirafiif.galeribudaya.ui.browse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
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
            loadData()
        } else {
            val list = savedInstanceState.getParcelableArrayList<Budaya>("EXTRA_STATE")
            if (list != null) {
                adapter.listBudaya = list
            }
        }

        binding.ibSearch.setOnClickListener {
            val dataSearch = binding.etSearch.text.toString()
            val bundle = Bundle()
            bundle.putString("search", dataSearch)
            val fragRes = ResultFragment()
            fragRes.arguments = bundle
            
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view, fragRes)
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }

    }

    private fun loadData() {

        val cursor = databaseHelper.queryOfDaerah()
        var budaya = helper.mapBrowseCursorToArrayList(cursor)
        if (budaya.size > 0) {
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