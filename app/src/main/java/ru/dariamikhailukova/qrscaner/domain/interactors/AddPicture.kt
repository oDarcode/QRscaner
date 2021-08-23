package ru.dariamikhailukova.qrscaner.domain.interactors

import ru.dariamikhailukova.qrscaner.domain.models.Picture
import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class AddPicture(private val pictureRepository: PictureRepository) {
    suspend operator fun invoke(picture: Picture) =
        pictureRepository.add(picture)
}