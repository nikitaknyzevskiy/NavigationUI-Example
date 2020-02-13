package com.nikita.navigationuiexample

import android.app.Application
import com.nikita.navigationuiexample.unit.tool.DBTools

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DBTools.init(this)
    }

}