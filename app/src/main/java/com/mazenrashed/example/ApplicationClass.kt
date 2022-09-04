package com.mazenrashed.example

import android.app.Application
import com.patricktorres27.printooth.Printooth

class ApplicationClass : Application(){

    override fun onCreate() {
        super.onCreate()
        Printooth.init(this)
    }
}