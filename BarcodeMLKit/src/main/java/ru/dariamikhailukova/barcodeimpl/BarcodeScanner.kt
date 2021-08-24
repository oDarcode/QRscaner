package ru.dariamikhailukova.barcodeimpl

import android.annotation.SuppressLint
import android.util.Log
import androidx.camera.core.ImageProxy

import com.google.mlkit.vision.barcode.BarcodeScanner
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.common.InputImage
import ru.dariamikhailukova.barcodeapi.Scanner

class BarcodeScanner: Scanner {

    @SuppressLint( "UnsafeOptInUsageError")
    override fun readBarcode(imageProxy: ImageProxy) {

        val barcodeScanner: BarcodeScanner = BarcodeScanning.getClient()

        val inputImage =
            InputImage.fromMediaImage(imageProxy.image!!, imageProxy.imageInfo.rotationDegrees)

        barcodeScanner.process(inputImage)
            .addOnSuccessListener { barcodes ->
                barcodes.forEach {
                    // Позже надо будет нормально обрабаывать считывание кода
                    Log.d("BarcodeAPI", it.rawValue)
                }
            }
            .addOnFailureListener {
                Log.e("BarcodeAPI", it.message!!)
            }.addOnCompleteListener {
                imageProxy.close()
            }
    }
}