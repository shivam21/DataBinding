package com.bhusridevelopers.databindingsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    val TAG: String = MyViewModel::class.java.simpleName
    private val liveStatus = MutableLiveData<Int>(0)
    val liveData: LiveData<Int> = liveStatus
    fun onLike() {
        liveStatus.value = (liveData.value ?: 0) + 1
    }
}