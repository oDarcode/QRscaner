package ru.dariamikhailukova.qrscaner.domain.interactors_version2.picture_use_cases

import ru.dariamikhailukova.qrscaner.domain.models.Picture

interface DeletePictureUseCase {
    suspend fun invoke(picture: Picture)
}