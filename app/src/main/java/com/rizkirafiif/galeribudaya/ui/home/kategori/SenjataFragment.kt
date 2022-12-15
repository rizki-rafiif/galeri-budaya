package com.rizkirafiif.galeribudaya.ui.home.kategori

import android.annotation.SuppressLint
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
import com.rizkirafiif.galeribudaya.databinding.FragmentSenjataBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.home.adapter.SenjataAdapter
import com.rizkirafiif.galeribudaya.ui.home.adapter.TarianAdapter


class SenjataFragment : Fragment(R.layout.fragment_senjata) {
    private var _binding: FragmentSenjataBinding?= null
    private val binding get() = _binding!!
    private lateinit var adapter: SenjataAdapter
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSenjataBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvSenjata.layoutManager = LinearLayoutManager(this.context)
        binding.rvSenjata.setHasFixedSize(true)
        adapter = SenjataAdapter(childFragmentManager)
        binding.rvSenjata.adapter = adapter

        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            val cursor = databaseHelper.querySenjata()
            var budaya = helper.mapCursorToArrayList(cursor)
            if (budaya.size > 0){
                adapter.listBud = budaya
            } else {
                adapter.listBud = ArrayList()
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}