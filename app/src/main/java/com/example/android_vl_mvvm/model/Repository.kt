package com.example.android_vl_mvvm.model

class Repository {
    val todoList = listOf<TodoList>(
        TodoList("Work", "#FF0000", loadTodos()),
        TodoList("Home", "#00FF00", loadTodos()),
        TodoList("School", "#0000FF", loadTodos()),
        TodoList("Other", "#FFFF00", loadTodos()),
        TodoList("Shopping", "#FF00FF", loadTodos()),
        TodoList("Groceries", "#00FFFF", loadTodos()),
    )

    private fun loadTodos(count: Int = 100): MutableList<TodoListItem> {
        val products = mutableListOf<TodoListItem>()
        for (i in 1..count) {
            products.add(generateReadableName())
        }
        return products
    }

    private fun generateReadableName(): TodoListItem {
        val consonants = "bcdfghjklmnpqrstvwxyz"
        val vowels = "aeiou"
        val random = kotlin.random.Random.Default
        val name = StringBuilder()
        val charCount = (2..10).random()
        val firstChar = consonants[random.nextInt(consonants.length)].uppercaseChar()

        name.append(firstChar)

        for (i in 1..charCount) {
            val charSet = if (i % 2 == 0) consonants else vowels
            val nextChar = charSet[random.nextInt(charSet.length)]
            name.append(nextChar)
        }

        return TodoListItem(name.toString())
    }
}
