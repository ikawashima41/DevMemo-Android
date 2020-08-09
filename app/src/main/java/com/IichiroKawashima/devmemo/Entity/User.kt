package com.IichiroKawashima.devmemo.Entity

import java.util.*

data class User(
    val email: String,
    val iconUrl: String,
    val createdAt: Date,
    val updatedAt: Date
)
