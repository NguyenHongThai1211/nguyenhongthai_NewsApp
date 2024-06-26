package com.example.myapplication.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)


        val img_second = findViewById<ImageView>(R.id.img_second)
        val tv_title_second = findViewById<TextView>(R.id.tv_title_secondActivity)
        val tv_ing_second = findViewById<TextView>(R.id.tv_ing_secondActivity)

        val intent = intent

        val image = intent?.getIntExtra("image",0)
        val title = intent?.getStringExtra("title")
        val ingredients = intent?.getStringExtra("ingredients")



        if (image != null) {
            img_second.setImageResource(image)
        }

        tv_title_second.text = title
        tv_ing_second.text = ingredients
    }
}