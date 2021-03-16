package com.ipsoft.rxjava.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ipsoft.rxjava.data.api.ApiHelper
import com.ipsoft.rxjava.data.repository.MainRepository
import com.ipsoft.rxjava.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

class ViewModelFactory(
    private val apiHelper: ApiHelper
): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("unknown class name")
    }
}