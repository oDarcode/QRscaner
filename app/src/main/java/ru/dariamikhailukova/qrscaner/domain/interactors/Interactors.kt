package ru.dariamikhailukova.qrscaner.domain.interactors


// как в примере с сайта, без интерфейсов
data class Interactors(
    val addCode: AddCode,
    val addPicture: AddPicture,
    val deleteCode: DeleteCode,
    val deletePicture: DeletePicture,
    val deleteCodes: DeleteCodes,
    val deletePictures: DeletePictures,
    val readPictures: ReadPictures
)