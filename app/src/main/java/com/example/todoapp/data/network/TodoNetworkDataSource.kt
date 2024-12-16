package com.example.todoapp.data.network

import com.example.todoapp.data.network.model.NetworkTask

interface TodoNetworkDataSource {

    suspend fun loadTasks(): List<NetworkTask>

    suspend fun saveTasks(tasks: List<NetworkTask>)
}