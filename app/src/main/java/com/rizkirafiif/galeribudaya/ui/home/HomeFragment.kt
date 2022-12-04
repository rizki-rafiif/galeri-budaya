package com.rizkirafiif.galeribudaya.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentBendaSeniBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentHomeBinding
import com.rizkirafiif.galeribudaya.ui.home.adapter.ViewPagerAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding?= null
    private val binding get() = _binding!!
    // deklarasi adapter viewpager2
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPagerAdapter = ViewPagerAdapter(this)

        with(binding){
            viewPager.adapter = viewPagerAdapter
            TabLayoutMediator(tlKategori, viewPager){ tab, position ->
                when(position){
                    0 -> tab.text = "Benda Kesenian"
                    1 -> tab.text = "Makanan"
                    2 -> tab.text = "Pakaian"
                    3 -> tab.text = "Tarian"
                    4 -> tab.text = "Senjata"
                }
            }.attach()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}