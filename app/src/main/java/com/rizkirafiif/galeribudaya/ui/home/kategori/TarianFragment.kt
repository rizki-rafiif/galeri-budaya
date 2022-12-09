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
import com.rizkirafiif.galeribudaya.databinding.FragmentTarianBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.home.adapter.MakananAdapter
import com.rizkirafiif.galeribudaya.ui.home.adapter.TarianAdapter


class TarianFragment : Fragment(R.layout.fragment_tarian) {
    private var _binding: FragmentTarianBinding?= null
    private val binding get() = _binding!!
    private lateinit var adapter: TarianAdapter
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTarianBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvTarian.layoutManager = LinearLayoutManager(this.context)
        binding.rvTarian.setHasFixedSize(true)
        adapter = TarianAdapter(childFragmentManager)
        binding.rvTarian.adapter = adapter

        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            loadData()
        } else {
            val list = savedInstanceState.getParcelableArrayList<Budaya>("EXTRA_STATE")
            if (list != null){
                adapter.listBud = list
            }
        }
    }

    private fun loadData(){

        val cursor = databaseHelper.queryTarian()
        var budaya = helper.mapCursorToArrayList(cursor)
        if (budaya.size > 0){
            adapter.listBud = budaya
        } else {
            adapter.listBud = ArrayList()
            Snackbar.make(binding.rvTarian, "Tidak ada data saat ini", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}