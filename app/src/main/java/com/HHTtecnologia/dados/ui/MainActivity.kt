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
    private lateinit var rollerAdapter: RollerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        viewPager2 = viewBinding.viewPager
        rollerAdapter = RollerAdapter(this)
        viewPager2.adapter = rollerAdapter

        viewBinding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.dice -> loadFragment(index)
                R.id.history -> supportFragmentManager.beginTransaction()
                    .replace(R.id.container, HistoryFragment())
                    .commit()
                else -> Unit
            }
            true
        }

//        val btNext = viewBinding.btNext
//        val btPrevious = viewBinding.btPrevious
//
//        btPrevious.isEnabled = false
//
//        btNext.setOnClickListener {
//            index++
//            loadFragment(index)
//            btPrevious.isEnabled = true
//            if (DiceType.values().size - 1 == index)
//                btNext.isEnabled = false
//        }
//
//        btPrevious.setOnClickListener {
//            index--
//            loadFragment(index)
//            btNext.isEnabled = true
//            if (0 == index)
//                btPrevious.isEnabled = false
//        }
    }


    private fun loadFragment(index: Int) {
        val fragment = RollerFragment.newInstance(index)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()
    }


}