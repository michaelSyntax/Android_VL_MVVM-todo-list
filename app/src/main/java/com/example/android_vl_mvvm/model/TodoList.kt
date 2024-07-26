package com.example.android_vl_mvvm.model

data class TodoList(
    val name: String,
    val color: String,
    val items: MutableList<TodoListItem>
)
