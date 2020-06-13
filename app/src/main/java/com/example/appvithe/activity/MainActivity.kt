package com.example.appvithe.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.appvithe.BaseActivity
import com.example.appvithe.R
import com.example.appvithe.tab.TabHistoryFragment
import com.example.appvithe.tab.TabHomeFragment
import com.example.appvithe.tab.TabNewPageFragment
import com.example.appvithe.tab.TabProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity() {

    private lateinit var navigation : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation = findViewById(R.id.navigation)
        initView()
    }

    private fun initView(){
        navigation.setOnNavigationItemSelectedListener { item ->

            var selectedFragment: Fragment? = null
            when(item.itemId){
                R.id.actionHome -> {
                    selectedFragment = TabHomeFragment.newInstance()
                }
                R.id.actionNewsPager -> {
                    selectedFragment = TabNewPageFragment.newInstance()
                }
                R.id.actionHistory -> {
                    selectedFragment = TabHistoryFragment.newInstance()
                }
                R.id.actionUser -> {
                    selectedFragment = TabProfileFragment.newInstance()
                }

            }

            selectedFragment?.let {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, selectedFragment)
                    .commitAllowingStateLoss()

            }
            true
        }
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, TabHomeFragment.newInstance())
        transaction.commit()
    }
}
