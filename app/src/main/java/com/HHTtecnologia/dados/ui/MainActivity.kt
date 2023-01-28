package com.HHTtecnologia.dados.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.HHTtecnologia.dados.R
import com.HHTtecnologia.dados.databinding.ActivityMainBinding
import com.vansuita.viewbinding.ViewBindingMethod
import com.vansuita.viewbinding.viewBinding


class MainActivity : AppCompatActivity() {

    private val viewBinding by viewBinding<ActivityMainBinding>(ViewBindingMethod.INFLATE)
    private var index: Int = 0
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewPager2 = viewBinding.viewPager
        viewPager2.adapter = RollerAdapter(this)

        viewBinding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.dice -> loadFragment()
                R.id.history -> loadHistoryFragment()
                else -> Unit
            }
            true
        }
    }

    private fun loadFragment() {
        viewPager2.adapter = RollerAdapter(this)
        viewBinding.viewPager.currentItem = index
    }

    private fun loadHistoryFragment() {
        viewPager2.adapter = HistoryAdapter(this)
        viewBinding.viewPager.currentItem = 0
    }


}