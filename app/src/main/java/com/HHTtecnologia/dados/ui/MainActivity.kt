package com.HHTtecnologia.dados.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.HHTtecnologia.dados.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private fun setupViewPager(viewPager: ViewPager) {
//        val adapter = ViewPagerAdapter(supportFragmentManager)
//        callsFragment = CallsFragment()
//        chatFragment = ChatFragment()
//        contactsFragment = ContactsFragment()
//        adapter.addFragment(callsFragment)
//        adapter.addFragment(chatFragment)
//        adapter.addFragment(contactsFragment)
//        viewPager.adapter = adapter
//    }


}