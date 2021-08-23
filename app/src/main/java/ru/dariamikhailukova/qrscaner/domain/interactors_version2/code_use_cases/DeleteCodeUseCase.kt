package ru.dariamikhailukova.qrscaner.domain.interactors_version2.code_use_cases

import ru.dariamikhailukova.qrscaner.domain.models.Code

interface DeleteCodeUseCase {
    suspend fun invoke(code: Code)
}