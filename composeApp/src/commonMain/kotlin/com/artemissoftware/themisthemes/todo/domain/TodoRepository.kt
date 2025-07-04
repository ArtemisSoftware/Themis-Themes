package com.artemissoftware.themisthemes.todo.domain

interface TodoRepository {
    suspend fun getTodos(): List<String>
}