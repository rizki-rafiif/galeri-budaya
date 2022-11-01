package com.rizkirafiif.galeribudaya.ui.browse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentBrowseBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentHomeBinding

class BrowseFragment : Fragment(R.layout.fragment_browse) {
    private lateinit var binding: FragmentBrowseBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBrowseBinding.bind(view)


    }
}