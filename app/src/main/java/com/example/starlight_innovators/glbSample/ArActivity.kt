package com.example.starlight_innovators.glbSample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.starlight_innovators.R
import com.google.ar.sceneform.ux.BaseArFragment

class ArActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar)

        initView()
    }

    private fun initView() {
        val frame: View? = findViewById(R.id.ux_fragment)


    }
}