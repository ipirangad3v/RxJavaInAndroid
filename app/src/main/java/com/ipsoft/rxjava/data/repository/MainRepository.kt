package com.ipsoft.rxjava.data.repository

import com.ipsoft.rxjava.data.api.ApiHelper
import com.ipsoft.rxjava.data.model.User
import io.reactivex.Single

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

class MainRepository(
    private val apiHelper: ApiHelper
) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}