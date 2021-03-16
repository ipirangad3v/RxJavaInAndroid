package com.ipsoft.rxjava.data.api

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

class ApiHelper(
    private val apiService: ApiService
) {
    fun getUsers() = apiService.getUsers()
}