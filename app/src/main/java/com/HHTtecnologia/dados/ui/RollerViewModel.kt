package com.HHTtecnologia.dados.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.HHTtecnologia.dados.entity.Dice

class RollerViewModel : ViewModel() {


    private val mutableDiceResult = MutableLiveData<Int>()
    val resultLiveData: LiveData<Int> = mutableDiceResult
    

    fun roll(dice: Dice) {
        val sides = dice.type.sides
        mutableDiceResult.value = IntRange(1, sides).random()
    }


}