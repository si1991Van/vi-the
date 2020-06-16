package com.example.appvithe.adapter



import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.appvithe.tab.PhoneCardItemFragment


class SectionsPagerNewsAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return PhoneCardItemFragment.newInstance()
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {
                return "Bắn TK trả trước"
            }
            1 -> {
                return "Nạp thẻ trả sau"
            }
            2 -> {
                return "Nạp thẻ trả trước"
            }
        }
        return null
    }
}