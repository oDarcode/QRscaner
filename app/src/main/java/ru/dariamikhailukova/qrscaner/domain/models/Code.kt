package ru.dariamikhailukova.qrscaner.domain.models

import ru.dariamikhailukova.qrscaner.data.models.CodeEntity
import java.io.Serializable

data class Code (
    val id: Int = 0,
    val type: Int,
    val data: String
): Serializable {
    companion object {
        fun fromSource(src: CodeEntity) = Code(
            src.id,
            src.type,
            src.data
        )
    }
}
