package com.HHTtecnologia.dados.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.HHTtecnologia.dados.databinding.FragmentRollerBinding
import com.HHTtecnologia.dados.entity.Dice
import com.HHTtecnologia.dados.enum.DiceType
import com.vansuita.viewbinding.ViewBindingMethod
import com.vansuita.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class RollerFragment : Fragment() {

    private val binding: FragmentRollerBinding by viewBinding(ViewBindingMethod.INFLATE)
    private val viewModel by viewModel<RollerViewModel>()
    private val dice by lazy {
        Dice(requireArguments().getParcelable<DiceType>("DiceType")!!)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.imRoller.setImageResource(dice.type.imgRes)
        binding.tvRollerName.text = dice.type.name

        binding.btRoll.setOnClickListener {
            viewModel.roll(dice)
        }

        viewModel.resultLiveData.observe(this) {
            binding.tvResult.text = it.toString()
        }
    }
}