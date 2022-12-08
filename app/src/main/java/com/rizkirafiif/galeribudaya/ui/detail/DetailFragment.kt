package com.rizkirafiif.galeribudaya.ui.detail

import android.annotation.SuppressLint
import android.database.Cursor
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentDetailBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentTarianBinding
import com.rizkirafiif.galeribudaya.db.DatabaseContract
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.DAERAH
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.DESKRIPSI
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_1
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_2
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_3
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_4
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.GAMBAR_5
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.JENIS
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.NAME
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion.VIDEO
import com.rizkirafiif.galeribudaya.db.DatabaseContract.BudayaColumns.Companion._ID
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper

class DetailFragment : Fragment(R.layout.fragment_detail) {
    private var _binding: FragmentDetailBinding?= null
    private val binding get() = _binding!!
    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    //private val args:DetailFragmentArgs by navArgs()
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = requireArguments().getInt("posisi")
        val cursor = databaseHelper.queryById(id)
        val _id = cursor.getColumnIndexOrThrow(_ID).toInt()
        val nama = cursor.getColumnIndexOrThrow(NAME).toString()
        val jenis = cursor.getColumnIndexOrThrow(JENIS).toString()
        val daerah = cursor.getColumnIndexOrThrow(DAERAH).toString()
        val deskripsi = cursor.getColumnIndexOrThrow(DESKRIPSI).toString()
        val video = cursor.getColumnIndexOrThrow(VIDEO).toString()
        val gambar1 = cursor.getColumnIndexOrThrow(GAMBAR_1).toString()
        val gambar2 = cursor.getColumnIndexOrThrow(GAMBAR_2).toString()
        val gambar3 = cursor.getColumnIndexOrThrow(GAMBAR_3).toString()
        val gambar4 = cursor.getColumnIndexOrThrow(GAMBAR_4).toString()
        val gambar5 = cursor.getColumnIndexOrThrow(GAMBAR_5).toString()

        binding.tvNamaDetail.text = nama
        binding.tvDeskripsiDetail.text = "Jenis: $jenis\n" +
                                         "Daerah: $daerah\n" +
                                         "Deskripsi:\n$deskripsi"
        binding.tvLinkGambar.text = "link gambar 1: $gambar1\n" +
                                    "link gambar 2: $gambar2\n" +
                                    "link gambar 2: $gambar3\n" +
                                    "link gambar 2: $gambar4\n" +
                                    "link gambar 2: $gambar5"
        Glide.with(requireContext())
            .load(gambar1)
            .into(binding.ivDetail)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}