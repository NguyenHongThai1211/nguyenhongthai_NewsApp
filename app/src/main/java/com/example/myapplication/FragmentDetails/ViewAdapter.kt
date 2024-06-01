package com.example.myapplication.FragmentDetails

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.*

class ViewAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->{Sac_depFragment()}
            1 ->{Suc_khoeFragment()}
            2 ->{The_gioiFragment()}
            3 ->{ThethaoFragment()}
            else ->{Thoi_suFragmentt()}
        }
    }
}
