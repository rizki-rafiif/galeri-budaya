package com.rizkirafiif.galeribudaya.ui.home.kategori

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.Data.Communicator
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentMakananBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.rizkirafiif.galeribudaya.ui.detail.DetailFragment
import com.rizkirafiif.galeribudaya.ui.home.adapter.MakananAdapter
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch


class MakananFragment : Fragment() {
    private var _binding: FragmentMakananBinding?= null
    private val binding get() = _binding!!
    private lateinit var adapter: MakananAdapter
    private lateinit var databaseHelper: DatabaseHelper
    private lateinit var comm: Communicator
    private lateinit var fragmentActivity: FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMakananBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvMakanan.layoutManager = LinearLayoutManager(this.context)
        binding.rvMakanan.setHasFixedSize(true)
        adapter = MakananAdapter(this.requireContext())
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

        //comm = requireActivity() as Communicator

    }

    //@OptIn(DelicateCoroutinesApi::class)
    private fun loadData(){

        val cursor = databaseHelper.queryMakanan()
        var budaya = helper.mapCursorToArrayList(cursor)
        if (budaya.size > 0){
            adapter.listMakanan = budaya
        } else {
            adapter.listMakanan = ArrayList()
            Snackbar.make(binding.rvMakanan, "Tidak ada data saat ini", Snackbar.LENGTH_SHORT).show()
        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}