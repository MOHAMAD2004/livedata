package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodle:ViewModel() {
    override fun onCleared() {
        super.onCleared()
    }
     var scope=MutableLiveData<Int>()
   fun add(a:Int){
       scope.value=a
       scope.value=(scope.value)?.plus(1)
   }

}