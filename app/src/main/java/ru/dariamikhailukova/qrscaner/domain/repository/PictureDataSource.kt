package ru.dariamikhailukova.qrscaner.domain.repository

import ru.dariamikhailukova.qrscaner.domain.models.Picture

interface PictureDataSource {
    suspend fun readAll(): List<Picture>
    suspend fun add(picture: Picture)
    suspend fun delete(picture: Picture)
    suspend fun deleteAll()
}