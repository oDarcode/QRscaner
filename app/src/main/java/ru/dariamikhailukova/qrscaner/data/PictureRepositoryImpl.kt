package ru.dariamikhailukova.qrscaner.data

import ru.dariamikhailukova.qrscaner.domain.models.Picture
import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class PictureRepositoryImpl(private val pictureRepository: PictureRepository) {

    suspend fun readPictures() = pictureRepository.readAll()

    suspend fun addPicture(picture: Picture) {
        pictureRepository.add(picture)
    }

    suspend fun deletePicture(picture: Picture) {
        pictureRepository.delete(picture)
    }

    suspend fun deletePictures() {
        pictureRepository.deleteAll()
    }
}