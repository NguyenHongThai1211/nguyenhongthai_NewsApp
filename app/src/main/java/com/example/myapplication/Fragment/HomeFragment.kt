package com.example.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.FragmentDetails.ViewAdapter
import com.example.myapplication.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val adapter = ViewAdapter(childFragmentManager, lifecycle)
        val  viewpager = view!!.findViewById<ViewPager2>(R.id.pagerTest)
        val  tabd = view!!.findViewById<TabLayout>(R.id.tabdemo)
        viewpager.adapter = adapter
        TabLayoutMediator(tabd, viewpager) { tab, pos ->
            when (pos){
                0 ->{tab.text="Sắc đẹp"}
                1 ->{tab.text="Sức khoẻ"}
                2 ->{tab.text="Thế giới"}
                3 ->{tab.text="Thể thao"}
                4 ->{tab.text="Thời sự"}
            }
        }.attach()
            return view
        }
}
