package com.example.appvithe.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.appvithe.BaseFragment
import com.example.appvithe.R

class TabHomeFragment: BaseFragment() {


    private lateinit var lnNapTien: LinearLayout
    private lateinit var lnChat: LinearLayout
    private lateinit var lnPhone: LinearLayout

    companion object {
        fun newInstance(): TabHomeFragment {
            val fragment = TabHomeFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        lnNapTien = view.findViewById(R.id.lnNapTien)
        lnNapTien = view.findViewById(R.id.lnPhone)
        lnChat = view.findViewById(R.id.lnChat)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lnNapTien.setOnClickListener {

        }
        lnPhone.setOnClickListener {

        }
        lnChat.setOnClickListener {

        }
    }



}