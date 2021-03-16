package com.ipsoft.rxjava.data.api

import com.ipsoft.rxjava.data.model.User
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Single

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

class ApiServiceImp : ApiService {
    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}