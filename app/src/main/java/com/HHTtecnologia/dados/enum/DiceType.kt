package com.HHTtecnologia.dados.enum

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.HHTtecnologia.dados.R
import kotlinx.parcelize.Parcelize

@Parcelize
enum class DiceType(val sides: Int, @DrawableRes val imgRes: Int) : Parcelable {

    D4(4, R.drawable.ic_dice_d4),
    D6(6, R.drawable.ic_dice_d6),
    D10(10, R.drawable.ic_dice_d4),
    D12(12, R.drawable.ic_dice_d4),
    D20(20, R.drawable.ic_dice_d4)

}