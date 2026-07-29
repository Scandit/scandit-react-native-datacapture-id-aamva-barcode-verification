/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2023- Scandit AG. All rights reserved.
 */

@file:Suppress("PackageName")
package com.scandit.datacapture.reactnative.id_aamva_barcode_verification

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule

class ScanditDataCaptureIdAamvaBarcodeVerificationModule(
    private val reactContext: ReactApplicationContext
) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String = "ScanditDataCaptureIdAamvaBarcodeVerification"
}
