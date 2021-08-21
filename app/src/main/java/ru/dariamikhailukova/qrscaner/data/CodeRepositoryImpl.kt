package ru.dariamikhailukova.qrscaner.data

import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.repository.CodeRepository


class CodeRepositoryImpl(private val codeRepository: CodeRepository) {

    suspend fun addCode(code: Code){
        codeRepository.add(code)
    }

    suspend fun deleteCode(code: Code){
        codeRepository.delete(code)
    }

    suspend fun deleteCodes(){
        codeRepository.deleteAll()
    }

}