/*
 * Copyright (c) 2020.
 * Nkita Knyazevkiy
 * UA
 */

package com.nikita.navigationuiexample.unit.tool

import android.content.Context
import androidx.room.Room
import com.nikita.navigationuiexample.db.MyDatabase

object DBTools {

    private var context: Context? = null

    fun init(context: Context) {
        DBTools.context = context
    }

    private val myDatabase: MyDatabase by lazy {
        if (context == null)
            throw IllegalArgumentException("Please init DBTools")
        Room
            .databaseBuilder<MyDatabase>(
                context!!, MyDatabase::class.java, "null_idea_db")
            .allowMainThreadQueries()
            .build()
    }

}