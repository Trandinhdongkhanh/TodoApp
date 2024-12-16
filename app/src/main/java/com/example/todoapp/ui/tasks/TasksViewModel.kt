package com.example.todoapp.ui.tasks

import androidx.lifecycle.ViewModel
import com.example.todoapp.data.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(
    private val taskRepository: TaskRepository
) : ViewModel() {
}