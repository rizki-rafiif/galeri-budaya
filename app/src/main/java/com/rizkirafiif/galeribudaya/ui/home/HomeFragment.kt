package com.rizkirafiif.galeribudaya.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding:FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)


    }

}