package ru.dariamikhailukova.qrscaner.domain.models

import java.io.Serializable

data class Code (
    val id: Int = 0,
    val type: Int,
    val data: String
): Serializable
