package ru.dariamikhailukova.qrscaner.domain.mapper

import ru.dariamikhailukova.qrscaner.data.models.CodeEntity
import ru.dariamikhailukova.qrscaner.data.models.PictureEntity
import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.models.Picture

fun CodeEntity.toCode() = Code(
    this.id,
    this.type,
    this.data
)

fun PictureEntity.toPicture()= Picture(
    this.url,
    this.name
)

