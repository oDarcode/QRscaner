package ru.dariamikhailukova.qrscaner.domain.interactors_version2.picture_use_cases

import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class DeletePicturesUseCaseImpl(private val pictureRepository: PictureRepository): DeletePicturesUseCase {
    override suspend fun invoke() =
        pictureRepository.deleteAll()
}