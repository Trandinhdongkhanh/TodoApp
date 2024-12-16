package com.example.todoapp.di

import com.example.todoapp.data.local.TodoDatabase
import com.example.todoapp.data.local.dao.TaskDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {
    @Provides
    fun provideTaskDao(database: TodoDatabase): TaskDao = database.taskDao()
}