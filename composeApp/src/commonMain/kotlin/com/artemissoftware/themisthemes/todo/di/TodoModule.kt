package com.artemissoftware.themisthemes.todo.di

import com.artemissoftware.themisthemes.di.AuthHttpClient
import com.artemissoftware.themisthemes.todo.data.TodoRepositoryImpl
import com.artemissoftware.themisthemes.todo.domain.TodoRepository
import com.artemissoftware.themisthemes.todo.presentation.TodoViewModel
import io.ktor.client.HttpClient
import org.koin.android.annotation.KoinViewModel
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
class TodoModule {

    @Factory(binds = [TodoRepository::class])
    fun todoRepository(@AuthHttpClient httpClient: HttpClient) = TodoRepositoryImpl(httpClient)

    @KoinViewModel
    fun todoViewModel(todoRepository: TodoRepository) = TodoViewModel(todoRepository)
}