package ru.dariamikhailukova.qrscaner.domain.interactors_version2.code_use_cases

import ru.dariamikhailukova.qrscaner.domain.repository.CodeRepository

class DeleteCodesUseCaseImpl(private val codeRepository: CodeRepository): DeleteCodesUseCase {
    override suspend fun invoke() =
        codeRepository.deleteAll()
}