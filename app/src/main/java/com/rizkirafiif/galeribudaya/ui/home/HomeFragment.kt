package com.rizkirafiif.galeribudaya.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentBendaSeniBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentHomeBinding
import com.rizkirafiif.galeribudaya.ui.detail.DetailFragment
import com.rizkirafiif.galeribudaya.ui.home.adapter.ViewPagerAdapter
import kotlinx.coroutines.DelicateCoroutinesApi

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

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPagerAdapter = ViewPagerAdapter(this)
        with(binding){
            viewPager.isSaveEnabled = false
            viewPager.offscreenPageLimit = 7
            viewPager.adapter = viewPagerAdapter
            TabLayoutMediator(tlKategori, viewPager){ tab, position ->
                when(position){
                    0 -> tab.text = "Makanan"
                    1 -> tab.text = "Pakaian"
                    2 -> tab.text = "Tarian"
                    3 -> tab.text = "Senjata"
                    4 -> tab.text = "Kesenian benda lainnya"
                    5 -> tab.text = "kesenian non-benda lainnya"
                }
            }.attach()
        }
    }

    // https://johncodeos.com/how-to-pass-data-between-fragments-in-android-using-kotlin/
    //@OptIn(DelicateCoroutinesApi::class)
//    fun passDataCom(id:Int){
////        val bundle = Bundle()
////        bundle.putInt("posisi", id)
////        val fragDetail = DetailFragment()
////        fragDetail.arguments = bundle
////
////        requireActivity().supportFragmentManager.commit {
////            replace(R.id.fragment_container_view, fragDetail)
////            setReorderingAllowed(true)
////            addToBackStack(null)
////        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}