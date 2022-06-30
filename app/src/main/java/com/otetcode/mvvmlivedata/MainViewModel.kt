package com.otetcode.mvvmlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    var data = MutableLiveData<String>()

    fun kirim(){
        data.value = "Data Sederhana"
    }

    fun terima() = data as LiveData<String>


}