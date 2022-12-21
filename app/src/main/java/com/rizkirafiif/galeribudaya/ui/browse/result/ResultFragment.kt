package com.rizkirafiif.galeribudaya.ui.browse.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentAboutBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentResultBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.browse.daerah.BrowsedAdapter

class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding?= null
    private val binding get() = _binding!!
    private lateinit var adapter: ResultAdapter
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvResult.layoutManager = LinearLayoutManager(this.context)
        binding.rvResult.setHasFixedSize(true)
        adapter = ResultAdapter(childFragmentManager)
        binding.rvResult.adapter = adapter

        val nama = requireArguments().getString("search", "tari")
        binding.tvResultTitle.text = nama
        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            loadData(nama)
        }
        binding.ibBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    private fun loadData(nama : String){

        val cursor = databaseHelper.queryOfSearch(nama)
        var budaya = helper.mapCursorToArrayList(cursor)
        if (budaya.size > 0){
            adapter.listBudaya = budaya
        } else {
            adapter.listBudaya = ArrayList()
            Snackbar.make(binding.rvResult, "Tidak ada data saat ini", Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}