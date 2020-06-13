package com.example.appvithe.tab

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.appvithe.BaseFragment
import com.example.appvithe.R
import com.example.appvithe.activity.ChatActivity
import com.example.appvithe.activity.NapTienActivity
import com.example.appvithe.activity.PhoneCardActivity

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
            startActivity(Intent(context, NapTienActivity::class.java))
        }
        lnPhone.setOnClickListener {
            startActivity(Intent(context, PhoneCardActivity::class.java))
        }
        lnChat.setOnClickListener {
            startActivity(Intent(context, ChatActivity::class.java))
        }
    }



}