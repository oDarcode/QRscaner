package ru.dariamikhailukova.qrscaner.domain.interactors

import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.repository.CodeRepository

class DeleteCodes(private val codeRepository: CodeRepository) {
    suspend operator fun invoke() =
        codeRepository.deleteAll()
}