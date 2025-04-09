package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo (
    val id: Int,
    val title: String,
    val createdAt: Date
)



fun getTodos(): List<Todo> {
    return listOf(
        Todo(1, "Buy groceries", Date.from(Instant.now())),
        Todo(2, "Walk the dog", Date.from(Instant.now())),
        Todo(3, "Finish homework", Date.from(Instant.now())),
        Todo(4, "Clean the house", Date.from(Instant.now())),
        Todo(5, "Prepare for meeting so i can use this in UI lmaooooooo askjdfhlaksdf", Date.from(Instant.now()))
    )
}