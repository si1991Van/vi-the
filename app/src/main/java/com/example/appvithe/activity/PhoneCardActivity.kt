package com.example.appvithe.activity

import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.appvithe.BaseActivity
import com.example.appvithe.R
import com.example.appvithe.adapter.SectionsPagerNewsAdapter

class PhoneCardActivity : BaseActivity() {



    private lateinit var pagerAdapter: SectionsPagerNewsAdapter
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_card)
//        setTitleHeader(getString(R.string.screen_phone_card))
        initPageAdapter()
    }

    private fun initPageAdapter(){
        pagerAdapter = SectionsPagerNewsAdapter(supportFragmentManager)
        viewPager = findViewById(R.id.container)
        viewPager.adapter = pagerAdapter
    }
}
