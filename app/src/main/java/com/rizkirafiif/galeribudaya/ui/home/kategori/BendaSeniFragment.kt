package com.rizkirafiif.galeribudaya.ui.home.kategori

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentBendaSeniBinding
import com.rizkirafiif.galeribudaya.databinding.FragmentMakananBinding


class BendaSeniFragment : Fragment(R.layout.fragment_benda_seni) {
    private var _binding: FragmentBendaSeniBinding?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBendaSeniBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}