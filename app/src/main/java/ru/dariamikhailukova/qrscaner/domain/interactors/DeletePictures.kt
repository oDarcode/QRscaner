package ru.dariamikhailukova.qrscaner.domain.interactors

import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class DeletePictures(private val pictureRepository: PictureRepository) {
    suspend operator fun invoke() =
        pictureRepository.deleteAll()
}