package com.rizkirafiif.galeribudaya.ui.home.kategori

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentMakananBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.home.adapter.MakananAdapter
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MakananFragment : Fragment(R.layout.fragment_makanan) {
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

    //val makananArgs : MakananFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvMakanan.layoutManager = LinearLayoutManager(this.context)
        binding.rvMakanan.setHasFixedSize(true)
        adapter = MakananAdapter(this.context)
        binding.rvMakanan.adapter = adapter

        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()
        if (savedInstanceState == null){
            loadData()
        } else {
            val list = savedInstanceState.getParcelableArrayList<Budaya>("EXTRA_STATE")
            if (list != null){
                adapter.listMakanan = list
            }
        }
    }

    @OptIn(DelicateCoroutinesApi::class)
    private fun loadData(){
        GlobalScope.launch {
            val cursor = databaseHelper.queryMakanan2("makanan")
            var budaya = helper.mapCursorToArrayList(cursor)
            if (budaya.size > 0){
                adapter.listMakanan = budaya
            } else {
                adapter.listMakanan = ArrayList()
                Snackbar.make(binding.rvMakanan, "Tidak ada data saat ini", Snackbar.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}