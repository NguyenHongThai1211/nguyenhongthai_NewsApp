package com.example.myapplication.ui.fragment.settings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_third_acitivity.*

class ThirdAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_acitivity)
        web.loadUrl("https://thanhnien.vn/")
    }
}