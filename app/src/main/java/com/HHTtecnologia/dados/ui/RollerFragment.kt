package com.HHTtecnologia.dados.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.HHTtecnologia.dados.R
import com.HHTtecnologia.dados.databinding.FragmentRollerBinding
import com.HHTtecnologia.dados.entity.Dice
import com.HHTtecnologia.dados.enum.DiceType
import com.vansuita.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RollerFragment : Fragment(R.layout.fragment_roller) {

    private val binding : FragmentRollerBinding  by viewBinding()
    private val viewModel by viewModel<RollerViewModel>()


    override fun onStart() {
        super.onStart()
        binding.btRoll.setOnClickListener{
            viewModel.roll()
        }

        viewModel.updateDice(Dice(DiceType.D6))

        viewModel.resultLiveData.observe(this){
            binding.tvResult.text = it.toString()
        }
    }







}