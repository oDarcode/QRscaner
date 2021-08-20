package ru.dariamikhailukova.qrscaner.data

import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.models.Picture
import ru.dariamikhailukova.qrscaner.domain.repository.PictureDataSource

class PictureRepository(private val pictureDataSource: PictureDataSource) {

    suspend fun readPictures() = pictureDataSource.readAll()

    suspend fun addPicture(picture: Picture) {
        pictureDataSource.add(picture)
    }

    suspend fun deletePicture(picture: Picture) {
        pictureDataSource.delete(picture)
    }

    suspend fun deletePictures() {
        pictureDataSource.deleteAll()
    }
}