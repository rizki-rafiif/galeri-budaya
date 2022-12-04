package com.rizkirafiif.galeribudaya.ui.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.rizkirafiif.galeribudaya.ui.home.kategori.*

class ViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when(position){
            0 -> fragment = MakananFragment()
            1 -> fragment = PakaianFragment()
            2 -> fragment = TarianFragment()
            3 -> fragment = SenjataFragment()
            4 -> fragment = BendaSeniFragment()
            5 -> fragment = SeniTakBendaFragment()
        }
        return fragment
    }
}