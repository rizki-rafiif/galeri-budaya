package com.rizkirafiif.galeribudaya.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rizkirafiif.galeribudaya.ui.home.kategori.*

class ViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = BendaSeniFragment()
            1 -> fragment = MakananFragment()
            2 -> fragment = PakaianFragment()
            3 -> fragment = TarianFragment()
            4 -> fragment = SenjataFragment()
        }
        return fragment
    }
}