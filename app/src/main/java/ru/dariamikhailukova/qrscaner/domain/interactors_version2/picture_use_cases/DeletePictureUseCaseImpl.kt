package ru.dariamikhailukova.qrscaner.domain.interactors_version2.picture_use_cases

import ru.dariamikhailukova.qrscaner.domain.models.Picture
import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class DeletePictureUseCaseImpl(private val pictureRepository: PictureRepository): DeletePictureUseCase {
    override suspend fun invoke(picture: Picture) =
        pictureRepository.delete(picture)
}