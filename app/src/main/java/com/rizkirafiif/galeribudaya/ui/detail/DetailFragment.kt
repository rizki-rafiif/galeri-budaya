package com.rizkirafiif.galeribudaya.ui.detail

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.viewpager.widget.ViewPager
import com.rizkirafiif.galeribudaya.Data.Budaya
import com.rizkirafiif.galeribudaya.MainActivity
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentDetailBinding
import com.rizkirafiif.galeribudaya.db.DatabaseHelper
import com.rizkirafiif.galeribudaya.helper
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class DetailFragment : Fragment(R.layout.fragment_detail) {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    private lateinit var databaseHelper: DatabaseHelper
    private lateinit var contenDetail: ArrayList<Budaya>
    lateinit var viewPager: ViewPager
    lateinit var detailViewPagerAdapter: DetailViewPagerAdapter

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

        databaseHelper = context?.let { DatabaseHelper.getInstance(it) }!!
        databaseHelper.open()

        val id = requireArguments().getString("position", "1")
        val cursor = databaseHelper.queryById(id)
        var budaya = helper.mapCursorToArrayList(cursor)
        contenDetail = budaya

        //println("datanya " + contenDetail[0].toString())

        val nama = contenDetail[0].nama.toString()
        val jenis = contenDetail[0].jenis.toString()
        val daerah = contenDetail[0].daerah.toString()
        val deskripsi = contenDetail[0].deskripsi.toString()
        val video = contenDetail[0].video.toString()
        val gambar1 = contenDetail[0].gambar1.toString()
        val gambar2 = contenDetail[0].gambar2.toString()
        val gambar3 = contenDetail[0].gambar3.toString()
        val gambar4 = contenDetail[0].gambar4.toString()
        val gambar5 = contenDetail[0].gambar5.toString()

        binding.tvNamaDetail.text = nama
        binding.tvDeskripsiDetail.text = "Jenis: $jenis\n" +
                "Daerah: $daerah\n" +
                "Deskripsi:\n$deskripsi"
        binding.tvLinkGambar.text = "link gambar 1: $gambar1\n" +
                "link gambar 2: $gambar2\n" +
                "link gambar 3: $gambar3\n" +
                "link gambar 4: $gambar4\n" +
                "link gambar 5: $gambar5"
//        Glide.with(requireContext())
//            .load(gambar1)
//            .into(binding.ivDetail)

        val imageList = ArrayList<String>()
        if (nullCheckerImage(gambar1)) imageList.add(gambar1)
        if (nullCheckerImage(gambar2)) imageList.add(gambar2)
        if (nullCheckerImage(gambar3)) imageList.add(gambar3)
        if (nullCheckerImage(gambar4)) imageList.add(gambar3)
        if (nullCheckerImage(gambar5)) imageList.add(gambar5)

        detailViewPagerAdapter = DetailViewPagerAdapter(requireContext(), imageList)
        binding.vpDetail.adapter = detailViewPagerAdapter

        val dotsIndicator = requireActivity().findViewById<WormDotsIndicator>(R.id.dots_indicator)
        dotsIndicator.attachTo(binding.vpDetail)

        binding.ibBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

    fun nullCheckerImage(gambar: String): Boolean {
        return gambar != ""
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}