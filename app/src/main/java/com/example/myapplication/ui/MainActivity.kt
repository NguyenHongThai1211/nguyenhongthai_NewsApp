package com.example.myapplication.ui
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var buttonNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonNavigationView = findViewById(R.id.bottomNavigationView)
        buttonNavigationView.setOnItemSelectedListener {menuItem ->
            when(menuItem.itemId){
                R.id.mihome ->{
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.misetting ->{
                    replaceFragment(SettingsFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.flfragment, fragment).commit()
    }
}









