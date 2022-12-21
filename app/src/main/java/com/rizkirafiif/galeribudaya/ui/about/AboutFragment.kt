package com.rizkirafiif.galeribudaya.ui.about

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target.SIZE_ORIGINAL
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.FragmentAboutBinding

class AboutFragment : Fragment(R.layout.fragment_about) {
    private var _binding: FragmentAboutBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvPesanAbout.text = "Aplikasi ini dibuat dengan tujuan membantu melestarikan " +
                "warisan budaya yang ada di indonesia dengan membuat akses lebih terpadu dan mudah, " +
                "yaitu hanya dengan menggunakan aplikasi basis android"
        binding.tvKontakAbout.text = "Silahkan bisa kontak dengan pengembang bila " +
                "memiliki saran, kritik, dan lain-lain melalui email " +
                "\n19104010@ittelkom-pwt.ac.id\natau tekan tombol gmail dibawah"
        // making the image button circle
        Glide.with(requireContext())
            .load(R.drawable.gmail_logo)
            .apply(RequestOptions.overrideOf(260))
            .apply(RequestOptions.circleCropTransform())
            .into(binding.ibGmail)

        binding.ibGmail.setOnClickListener {
            val selectorIntent = Intent(Intent.ACTION_SENDTO)
            selectorIntent.data = Uri.parse("mailto:")

            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("19104010@ittelkom-pwt.ac.id"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "ini adalah subjeknya")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "ini adalah isinya")
            emailIntent.selector = selectorIntent

            requireActivity().startActivity(Intent.createChooser(emailIntent, "Send email"))
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}