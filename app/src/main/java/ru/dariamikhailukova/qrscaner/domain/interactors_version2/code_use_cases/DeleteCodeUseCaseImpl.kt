package ru.dariamikhailukova.qrscaner.domain.interactors_version2.code_use_cases

import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.repository.CodeRepository

class DeleteCodeUseCaseImpl(private val codeRepository: CodeRepository): DeleteCodeUseCase {
    override suspend fun invoke(code: Code) =
        codeRepository.delete(code)
}