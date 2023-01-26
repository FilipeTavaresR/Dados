package com.HHTtecnologia.dados.di

import androidx.appcompat.app.AppCompatActivity
import com.HHTtecnologia.dados.R
import com.HHTtecnologia.dados.ui.RollerViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val module = module {

    single {  androidContext().getSharedPreferences( androidContext().getString(R.string.app_name), AppCompatActivity.MODE_PRIVATE) }

    viewModel {
        RollerViewModel()
    }

}