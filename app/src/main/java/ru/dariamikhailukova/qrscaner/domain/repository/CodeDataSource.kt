package ru.dariamikhailukova.qrscaner.domain.repository

import ru.dariamikhailukova.qrscaner.domain.models.Code

interface CodeDataSource {
    suspend fun add(code: Code)
    suspend fun delete(code: Code)
    suspend fun deleteAll()
}