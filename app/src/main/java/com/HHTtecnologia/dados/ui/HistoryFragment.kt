package com.HHTtecnologia.dados.ui

import androidx.fragment.app.Fragment
import com.HHTtecnologia.dados.R
import com.HHTtecnologia.dados.databinding.FragmentHistoryBinding
import com.vansuita.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HistoryFragment : Fragment(R.layout.fragment_history) {

    private val binding : FragmentHistoryBinding by viewBinding()
    private val viewModel by viewModel<RollerViewModel>()

    override fun onStart() {
        super.onStart()
    }
}