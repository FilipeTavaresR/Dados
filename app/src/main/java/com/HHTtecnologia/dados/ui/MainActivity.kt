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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        loadFragment(RollerFragment::class.java)

        viewBinding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.dice -> loadFragment(RollerFragment::class.java)
                R.id.history -> loadFragment(HistoryFragment::class.java)
                else -> Unit
            }
            true
        }
    }

    private fun <T : Fragment> loadFragment(fragmentClass: Class<T>) {
        val bundle = Bundle()
        bundle.putParcelable("DiceType", DiceType.D4)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragmentClass, bundle)
        transaction.commit()
    }

}