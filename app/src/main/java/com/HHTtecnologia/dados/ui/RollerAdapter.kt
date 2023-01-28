package com.HHTtecnologia.dados.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.HHTtecnologia.dados.enum.DiceType

class RollerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return DiceType.values().size
    }

    override fun createFragment(position: Int): Fragment {
        return RollerFragment.newInstance(position)
    }

//    override fun getItemCount(): Int {
//        return DiceType.values().size * Int.MAX_VALUE
//    }
//
//    override fun createFragment(position: Int): Fragment {
//        return RollerFragment.newInstance(position % DiceType.values().size)
//    }

}