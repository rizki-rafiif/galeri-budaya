package com.rizkirafiif.galeribudaya

import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rizkirafiif.galeribudaya.Data.DataBudaya
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

        // setting bottom menu navigation
        val fragmentHome = HomeFragment()
        val browseFragment = BrowseFragment()
        val aboutFragment = AboutFragment()

        setCurrentFragment(fragmentHome)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_menu_home -> setCurrentFragment(fragmentHome)
                R.id.nav_menu_browse -> setCurrentFragment(browseFragment)
                R.id.nav_menu_about -> setCurrentFragment(aboutFragment)
            }
            true
        }

        // executing the database
        DataBudaya(applicationContext).executeDB()
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container_view, fragment)
            commit()
        }

//    fun closeKeyBoard() {
//        val view = this.currentFocus
//        if (view != null) {
//            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
//            imm.hideSoftInputFromWindow(view.windowToken, 0)
//        }
//    }
}