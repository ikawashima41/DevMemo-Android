package devmemo.iichirokawashima.devmemo.entity

import java.util.*

data class Memos(
    val title: String,
    val description: String,
    val isCompleted: Boolean,
    val tagsIDs: List<Int>,
    val createdAt: Date,
    var updatedAt: Date
)
