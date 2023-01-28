package com.HHTtecnologia.dados.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.HHTtecnologia.dados.R
import com.HHTtecnologia.dados.databinding.ActivityMainBinding
import com.HHTtecnologia.dados.enum.DiceType
import com.vansuita.viewbinding.ViewBindingMethod
import com.vansuita.viewbinding.viewBinding


class MainActivity : AppCompatActivity() {

    private val viewBinding by viewBinding<ActivityMainBinding>(ViewBindingMethod.INFLATE)
    private var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        loadRollerFragment(RollerFragment::class.java, index)

        viewBinding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.dice -> loadRollerFragment(RollerFragment::class.java, index)
                R.id.history -> loadFragment(HistoryFragment())
                else -> Unit
            }
            true
        }

        var btNext = viewBinding.btNext
        var btPrevious = viewBinding.btPrevious

        btPrevious.isEnabled = false

        btNext.setOnClickListener {
            index++
            loadRollerFragment(RollerFragment::class.java, index)
            btPrevious.isEnabled = true
            if (DiceType.values().size - 1 == index)
                btNext.isEnabled = false
        }

        btPrevious.setOnClickListener {
            index--
            loadRollerFragment(RollerFragment::class.java, index)
            btNext.isEnabled = true
            if (0 == index)
                btPrevious.isEnabled = false
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    private fun <T : Fragment> loadRollerFragment(fragmentClass: Class<T>, index: Int) {
        val bundle = Bundle()
        bundle.putParcelable("DiceType", DiceType.values()[index])
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragmentClass, bundle)
        transaction.commit()
    }

}