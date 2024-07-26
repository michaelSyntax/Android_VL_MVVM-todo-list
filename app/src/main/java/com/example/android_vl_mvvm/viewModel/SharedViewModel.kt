package com.example.android_vl_mvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_vl_mvvm.model.Repository
import com.example.android_vl_mvvm.model.TodoList
import com.example.android_vl_mvvm.model.TodoListItem

class SharedViewModel: ViewModel() {
    private val repository = Repository()

    private val _listOfToDos = MutableLiveData<List<TodoList>>(repository.todoList)
    val todoList: LiveData<List<TodoList>> = _listOfToDos

    private val _selectedToDoList = MutableLiveData<TodoList>()
    val selectedToDoList: LiveData<TodoList>
        get() = _selectedToDoList

    fun addItemToList(item: TodoListItem) {
        _selectedToDoList.value?.items?.add(item)
    }

    fun checkItem(item: TodoListItem) {
        _selectedToDoList.value?.items?.first { it == item }?.isChecked = true
    }
}