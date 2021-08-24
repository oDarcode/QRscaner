package ru.dariamikhailukova.barcodeapi

import androidx.camera.core.ImageProxy

interface Scanner {

    fun readBarcode(imageProxy: ImageProxy)
}