/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2023- Scandit AG. All rights reserved.
 */

@file:Suppress("PackageName")
package com.scandit.datacapture.reactnative.id_aamva_barcode_verification

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = ScanditDataCaptureIdAamvaBarcodeVerificationModule.NAME)
class ScanditDataCaptureIdAamvaBarcodeVerificationModule(
    reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    companion object {
        const val NAME = "ScanditDataCaptureIdAamvaBarcodeVerification"
    }

    override fun getName(): String = NAME
}
