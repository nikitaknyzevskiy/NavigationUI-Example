/*
 * Copyright (c) 2020.
 * Nkita Knyazevkiy
 * UA
 */

package com.nikita.navigationuiexample.unit.tool

import com.nikita.navigationuiexample.unit.rest.ApiFactory

object ApiTools {

    private val apiFactory: ApiFactory = ApiFactory()

    private const val apiUrl = "https://www.dropbox.com/s/dl/fk3d5kg6cptkpr6/"

    fun <T> api(service: Class<T>): T {
        return apiFactory
            .buildRetrofit(apiUrl)
            .create(service)
    }
}