package com.example.model

import kotlinx.serialization.Serializable


@Serializable
data class Yandex constructor(
    val id:Int,
    val email:String
)
