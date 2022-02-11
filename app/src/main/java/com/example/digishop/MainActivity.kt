package com.example.digishop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.digishop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bottomBar.setOnItemSelectedListener {
            when(it){
                0 -> binding.pager.currentItem = 0
               1 -> binding.pager.currentItem = 1
                2 -> binding.pager.currentItem = 2
            }
        }
       var list = mutableListOf<Fragment>()
//        sdcs s
        list.add(homeFragment())
        list.add(catFragment())
        list.add(proFragment())
        var tab = TapAdapter(this,list)
        binding.pager.adapter = tab
    }
}