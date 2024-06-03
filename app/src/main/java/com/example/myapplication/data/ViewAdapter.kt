package com.example.myapplication.data

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.ui.fragment.home.Sac_depFragment
import com.example.myapplication.ui.fragment.home.Suc_khoeFragment
import com.example.myapplication.ui.fragment.home.The_gioiFragment
import com.example.myapplication.ui.fragment.home.ThethaoFragment
import com.example.myapplication.ui.fragment.home.Thoi_suFragmentt

class ViewAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->{
                Sac_depFragment()
            }
            1 ->{
                Suc_khoeFragment()
            }
            2 ->{
                The_gioiFragment()
            }
            3 ->{
                ThethaoFragment()
            }
            else ->{
                Thoi_suFragmentt()
            }
        }
    }
}
