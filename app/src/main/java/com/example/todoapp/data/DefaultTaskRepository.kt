package com.example.todoapp.data

import com.example.todoapp.data.local.dao.TaskDao
import com.example.todoapp.data.model.Task
import com.example.todoapp.data.network.TodoNetworkDataSource
import com.example.todoapp.di.DefaultDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DefaultTaskRepository @Inject constructor(
    private val taskDao: TaskDao,
    private val network: TodoNetworkDataSource,
    @DefaultDispatcher defaultDispatcher: CoroutineDispatcher
) : TaskRepository {
    override fun getTasksStream(): Flow<List<Task>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTasks(forceUpdate: Boolean): List<Task> {
        TODO("Not yet implemented")
    }

    override suspend fun refresh() {
        TODO("Not yet implemented")
    }

    override fun getTaskStream(taskId: String): Flow<Task?> {
        TODO("Not yet implemented")
    }

    override suspend fun getTask(taskId: String, forceUpdate: Boolean): Task? {
        TODO("Not yet implemented")
    }

    override suspend fun refreshTask(taskId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun createTask(title: String, description: String): String {
        TODO("Not yet implemented")
    }

    override suspend fun updateTask(taskId: String, title: String, description: String) {
        TODO("Not yet implemented")
    }

    override suspend fun completeTask(taskId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun activateTask(taskId: String) {
        TODO("Not yet implemented")
    }

    override suspend fun clearCompletedTasks() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAllTasks() {
        TODO("Not yet implemented")
    }

    override suspend fun deleteTask(taskId: String) {
        TODO("Not yet implemented")
    }
}