package ru.dariamikhailukova.qrscaner.data

import ru.dariamikhailukova.qrscaner.domain.models.Code
import ru.dariamikhailukova.qrscaner.domain.repository.CodeDataSource


class CodeRepository(private val codeDataSource: CodeDataSource) {

    suspend fun addCode(code: Code){
        codeDataSource.add(code)
    }

    suspend fun deleteCode(code: Code){
        codeDataSource.delete(code)
    }

    suspend fun deleteCodes(){
        codeDataSource.deleteAll()
    }

}