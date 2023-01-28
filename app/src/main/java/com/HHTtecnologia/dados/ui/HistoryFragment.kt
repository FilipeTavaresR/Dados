package com.HHTtecnologia.dados.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.HHTtecnologia.dados.databinding.FragmentHistoryBinding
import com.vansuita.viewbinding.ViewBindingMethod
import com.vansuita.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HistoryFragment : Fragment() {

    private val binding: FragmentHistoryBinding by viewBinding(ViewBindingMethod.INFLATE)
    private val viewModel by viewModel<RollerViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    companion object {
        fun newInstance(index: Int): HistoryFragment {
            val bundle = Bundle()
            bundle.putString("History", "empty")
            val frag = HistoryFragment()
            frag.arguments = bundle
            return frag
        }
    }
}