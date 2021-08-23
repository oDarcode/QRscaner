package ru.dariamikhailukova.qrscaner.domain.interactors

import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class ReadPictures(private val pictureRepository: PictureRepository) {
    suspend operator fun invoke() =
        pictureRepository.readAll()
}