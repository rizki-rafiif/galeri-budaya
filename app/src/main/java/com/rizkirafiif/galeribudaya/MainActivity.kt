package com.rizkirafiif.galeribudaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.rizkirafiif.galeribudaya.databinding.ActivityMainBinding
import com.rizkirafiif.galeribudaya.ui.about.AboutFragment
import com.rizkirafiif.galeribudaya.ui.browse.BrowseFragment
import com.rizkirafiif.galeribudaya.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentHome = HomeFragment()
        val browseFragment = BrowseFragment()
        val aboutFragment = AboutFragment()

        setCurrentFragment(fragmentHome)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home_fragment -> setCurrentFragment(fragmentHome)
                R.id.browse_fragment -> setCurrentFragment(browseFragment)
                R.id.about_fragment -> setCurrentFragment(aboutFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_view, fragment)
            commit()
        }
}