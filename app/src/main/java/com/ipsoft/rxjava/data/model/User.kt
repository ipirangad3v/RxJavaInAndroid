package com.ipsoft.rxjava.data.model

import com.google.gson.annotations.SerializedName

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

data class User(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("email")
    val email: String = "",
    @SerializedName("avatar")
    val avatar: String = ""
)
