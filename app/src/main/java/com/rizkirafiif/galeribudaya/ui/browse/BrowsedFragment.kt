package com.rizkirafiif.galeribudaya.ui.browse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.databinding.FragmentBrowsedBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.home.adapter.MakananAdapter


class BrowsedFragment : Fragment() {
    private var _binding: FragmentBrowsedBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: BrowsedAdapter
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBrowsedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvBrowsed.layoutManager = LinearLayoutManager(this.context)
        binding.rvBrowsed.setHasFixedSize(true)
        adapter = BrowsedAdapter(childFragmentManager)
        binding.rvBrowsed.adapter = adapter

        val daerah = requireArguments().getString("daerah", "")
        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            loadData(daerah)
        } else {
            val list = savedInstanceState.getParcelableArrayList<Budaya>("EXTRA_STATE")
            if (list != null){
                adapter.listBudaya = list
            }
        }
    }

    private fun loadData(daerah : String){

        val cursor = databaseHelper.queryDaerah(daerah)
        var budaya = helper.mapCursorToArrayList(cursor)
        if (budaya.size > 0){
            adapter.listBudaya = budaya
        } else {
            adapter.listBudaya = ArrayList()
            Snackbar.make(binding.rvBrowsed, "Tidak ada data saat ini", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}