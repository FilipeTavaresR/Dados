package com.HHTtecnologia.dados.entity

import com.HHTtecnologia.dados.enum.DiceType

data class RollerResult(

    val diceType: DiceType,
    val result: Int
)
