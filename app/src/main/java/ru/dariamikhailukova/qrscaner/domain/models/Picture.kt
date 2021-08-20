package ru.dariamikhailukova.qrscaner.domain.models

import ru.dariamikhailukova.qrscaner.data.models.PictureEntity
import java.io.Serializable

data class Picture (
    val url: String,
    val name: String
): Serializable {
    companion object {
        fun fromSource(src: PictureEntity) = Picture(
            src.url,
            src.name
        )
    }
}