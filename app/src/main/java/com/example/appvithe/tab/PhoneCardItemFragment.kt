package com.example.appvithe.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appvithe.BaseFragment
import com.example.appvithe.R

class PhoneCardItemFragment: BaseFragment() {
    companion object {
        fun newInstance(): PhoneCardItemFragment {
            val fragment = PhoneCardItemFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_new_page, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}