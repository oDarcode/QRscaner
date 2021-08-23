package ru.dariamikhailukova.qrscaner.domain.interactors_version2.picture_use_cases

import ru.dariamikhailukova.qrscaner.domain.repository.PictureRepository

class ReadPicturesUseCaseImpl(private val pictureRepository: PictureRepository): ReadPicturesUseCase {
    override suspend fun invoke() =
        pictureRepository.readAll()
}