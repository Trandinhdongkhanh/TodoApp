package com.example.todoapp.di

import com.example.todoapp.data.DefaultTaskRepository
import com.example.todoapp.data.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindsTaskRepository(taskRepository: DefaultTaskRepository): TaskRepository
}