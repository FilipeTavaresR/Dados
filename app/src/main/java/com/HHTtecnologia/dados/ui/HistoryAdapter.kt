package com.HHTtecnologia.dados.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.HHTtecnologia.dados.databinding.HistoryListBinding
import com.HHTtecnologia.dados.entity.RollerResult

class HistoryAdapter : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    private var rollerResult: List<RollerResult> = emptyList()

    fun updateList(rollerResult: List<RollerResult>) {
        this.rollerResult = rollerResult
    }

    inner class ViewHolder(val binding: HistoryListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(rollerResult: RollerResult) {
            binding.tvHistoryDice.text = rollerResult.diceType.name
            binding.tvHistoryResult.text = rollerResult.result.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            HistoryListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(rollerResult[position])
    }

    override fun getItemCount() = rollerResult.size

}
