package com.patricktorres27.printooth.data.printable

import com.patricktorres27.printooth.data.printer.Printer

interface Printable {
    fun getPrintableByteArray(printer: Printer): List<ByteArray>
}
