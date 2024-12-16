package com.example.todoapp.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NetworkTask(
    val id: String,
    val title: String,
    @SerialName("short_description")
    val shortDescription: String,
    val priority: Int? = null,
    val status: TaskStatus = TaskStatus.ACTIVE
)

enum class TaskStatus {
    ACTIVE,
    COMPLETE
}
