package devmemo.iichirokawashima.devmemo.entity

import java.util.*

data class Tags(
    val titile: String,
    val isCompleted: Boolean,
    val completedAt: Date?,
    val tagsIDs: List<Int>,
    val createdAt: Date,
    val updatedAt: Date
)
