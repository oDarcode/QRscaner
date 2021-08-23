package ru.dariamikhailukova.qrscaner.domain.interactors_version2.code_use_cases

import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.repository.CodeRepository

class AddCodeUseCaseImpl(private val codeRepository: CodeRepository): AddCodeUseCase {
    override suspend fun invoke(code: Code) =
        codeRepository.add(code)
}