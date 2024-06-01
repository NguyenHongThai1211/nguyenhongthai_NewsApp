package com.example.myapplication.Fragment

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.SecondActivity
import com.example.myapplication.ThirdAcitivity
import com.example.myapplication.Thong_tin
import kotlinx.android.synthetic.main.fragment_settings.*

@Suppress("UNREACHABLE_CODE")
class SettingsFragment : Fragment() {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)
        val sharedPreferences = requireActivity().getSharedPreferences("Mode", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val  switch = view!!.findViewById<Switch>(R.id.switch1)
        val thoat = view!!.findViewById<CardView>(R.id.thoat)
        val web = view!!.findViewById<CardView>(R.id.lienket)
        val thongtin = view!!.findViewById<CardView>(R.id.thongtin)
        val nightMode = sharedPreferences.getBoolean("night",false)

        if (nightMode){
            switch.isChecked = true
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        switch.setOnCheckedChangeListener { buttonView, isChecked ->

            if (!isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                editor.putBoolean("night", false)
                editor.apply()

            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                editor.putBoolean("night",true)
                editor.apply()
            }
        }
        thoat.setOnClickListener {
            val dialog = AlertDialog.Builder(requireActivity())
            dialog.apply{
                setTitle("Thông báo")
                setMessage("Thoát không?")
                setNegativeButton("no"){ dialogInterface: DialogInterface, i: Int ->
                    dialogInterface.dismiss()
                }
                setPositiveButton("yes"){dialogInterface: DialogInterface,i: Int ->
                    activity?.finish()
                }
            }
            dialog.show()
        }
        web.setOnClickListener{
            val intent = Intent(it.context, ThirdAcitivity::class.java)
            it.context.startActivity(intent)
        }
        thongtin.setOnClickListener{
            val intent = Intent(it.context, Thong_tin::class.java)
            it.context.startActivity(intent)
        }
    return view
    }
}
