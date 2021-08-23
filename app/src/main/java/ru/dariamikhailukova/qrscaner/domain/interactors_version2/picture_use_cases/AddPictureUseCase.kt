package ru.dariamikhailukova.qrscaner.domain.interactors_version2.picture_use_cases

import ru.dariamikhailukova.qrscaner.domain.models.Picture

interface AddPictureUseCase {
    suspend operator fun invoke(picture: Picture)
}