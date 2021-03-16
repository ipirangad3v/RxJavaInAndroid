package com.ipsoft.rxjava.data.api

import com.ipsoft.rxjava.data.model.User
import io.reactivex.Single

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

interface ApiService {
    fun getUsers(): Single<List<User>>
}