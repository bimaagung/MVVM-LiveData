package com.otetcode.mvvmlivedata

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel{ MainViewModel() }
}