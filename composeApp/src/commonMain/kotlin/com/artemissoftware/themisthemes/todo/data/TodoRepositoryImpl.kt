package com.artemissoftware.themisthemes.todo.data

import com.artemissoftware.themisthemes.todo.domain.TodoRepository
import io.ktor.client.HttpClient

class TodoRepositoryImpl(
    private val httpClient: HttpClient
): TodoRepository {

    override suspend fun getTodos(): List<String> {
        return (1..10).map {
            "Todo $it"
        }
    }
}