package com.example.todoapp.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class TaskEntity(
    @PrimaryKey val id: String,
    var title: String,
    var description: String,
    @ColumnInfo(name = "is_completed") var isCompleted: Boolean
)
