package com.HHTtecnologia.dados.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.HHTtecnologia.dados.entity.Dice

class RollerViewModel : ViewModel() {


    private val mutableDice = MutableLiveData<Dice>()
    private val mutableDiceResult = MutableLiveData<Int>()
    public val resultLiveData : LiveData<Int> = mutableDiceResult

    fun updateDice(dice : Dice){
        mutableDice.value = dice
    }

    fun roll(){
        val sides = mutableDice.value!!.type.sides
        mutableDiceResult.value = IntRange(1, sides).random()
    }

}