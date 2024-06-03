package com.example.myapplication.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.ui.fragment.settings.ThirdAcitivity
import com.example.myapplication.ui.fragment.settings.Thong_tin

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
                setPositiveButton("yes"){dialogInterface: DialogInterface,i: Int ->
                    activity?.finish()
                }
                setNegativeButton("no"){ dialogInterface: DialogInterface, i: Int ->
                    dialogInterface.dismiss()
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
