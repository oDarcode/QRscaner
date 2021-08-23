package ru.dariamikhailukova.qrscaner.domain.models

import java.io.Serializable

data class Picture (
    val url: String,
    val name: String
): Serializable