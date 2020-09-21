package devmemo.iichirokawashima.devmemo.entity

import java.util.*

data class User(
    val email: String,
    val iconUrl: String,
    val createdAt: Date,
    val updatedAt: Date
)
