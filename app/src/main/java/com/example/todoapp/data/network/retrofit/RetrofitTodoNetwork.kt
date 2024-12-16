package com.example.todoapp.data.network.retrofit

import com.example.todoapp.data.network.TodoNetworkDataSource
import com.example.todoapp.data.network.model.NetworkTask
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitTodoNetwork @Inject constructor() : TodoNetworkDataSource {
    override suspend fun loadTasks(): List<NetworkTask> {
        TODO("Not yet implemented")
    }

    override suspend fun saveTasks(tasks: List<NetworkTask>) {
        TODO("Not yet implemented")
    }

}