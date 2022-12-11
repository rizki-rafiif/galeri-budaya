package com.rizkirafiif.galeribudaya.ui.home.kategori

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentMakananBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentPakaianBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.home.adapter.PakaianAdapter
import com.rizkirafiif.galeribudaya.ui.home.adapter.SenjataAdapter

class PakaianFragment : Fragment(R.layout.fragment_pakaian) {
    private var _binding: FragmentPakaianBinding?= null
    private val binding get() = _binding!!
    private lateinit var adapter: PakaianAdapter
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPakaianBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvPakaian.layoutManager = LinearLayoutManager(this.context)
        binding.rvPakaian.setHasFixedSize(true)
        adapter = PakaianAdapter(childFragmentManager)
        binding.rvPakaian.adapter = adapter

        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            val cursor = databaseHelper.queryPakaian()
            var budaya = helper.mapCursorToArrayList(cursor)
            if (budaya.size > 0){
                adapter.listBud = budaya
            } else {
                adapter.listBud = ArrayList()
                binding.tvWarningNull.text = "Data masih kosong"
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}