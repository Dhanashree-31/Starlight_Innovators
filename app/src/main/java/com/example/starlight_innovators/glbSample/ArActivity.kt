package com.example.starlight_innovators.glbSample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.starlight_innovators.R

class ArActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main)

        initView()
    }

    private fun initView() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.containerFragment, MainFragment::class.java, Bundle())
        fragmentTransaction.commit()
    }
}