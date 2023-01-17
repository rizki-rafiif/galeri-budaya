package com.rizkirafiif.galeribudaya.ui.home.kategori

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.rizkirafiif.galeribudaya.databinding.FragmentMakananBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.home.adapter.MakananAdapter


class MakananFragment : Fragment() {
    private var _binding: FragmentMakananBinding?= null
    private val binding get() = _binding!!
    private lateinit var adapter: MakananAdapter
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMakananBinding.inflate(inflater, container, false)
        return binding.root
    }


    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvMakanan.layoutManager = LinearLayoutManager(this.context)
        binding.rvMakanan.setHasFixedSize(true)
        adapter = MakananAdapter(childFragmentManager)
        binding.rvMakanan.adapter = adapter

        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            val cursor = databaseHelper.queryMakanan()
            var budaya = helper.mapCursorToArrayList(cursor)
            if (budaya.size > 0){
                adapter.listMakanan = budaya
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}