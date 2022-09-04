package com.patricktorres27.printooth.data

import android.graphics.Bitmap
import com.patricktorres27.printooth.utilities.ImageUtils

class DefaultPrintingImagesHelper:PrintingImagesHelper{
    override fun getBitmapAsByteArray(bitmap: Bitmap): ByteArray {
        return ImageUtils.decodeBitmap(bitmap)!!
    }

}