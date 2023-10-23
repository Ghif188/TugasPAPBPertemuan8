package com.example.tugaspertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.tugaspertemuan8.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            viewPager.adapter = TabAdapter(this@MainActivity)
            TabLayoutMediator(tabLayout,viewPager) { tab, position ->
                tab.text = when (position) {
                    0 -> "Register"
                    1 -> "Login"
                    else -> ""
                }
            }.attach()
        }
    }
}