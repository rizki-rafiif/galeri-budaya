package com.rizkirafiif.galeribudaya.ui.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rizkirafiif.galeribudaya.R
import com.rizkirafiif.galeribudaya.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}