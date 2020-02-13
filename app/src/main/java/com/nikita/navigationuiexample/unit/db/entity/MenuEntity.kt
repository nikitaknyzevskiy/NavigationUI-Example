package com.nikita.navigationuiexample.unit.db.entity

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MenuEntity(
    @PrimaryKey
    @NonNull
    val name: String,

    val function: String,

    val param: String
) {

    val type: MenuType
        get() {
        return when (function) {
            "text" -> {
                MenuType.TEXT
            }
            "image" -> {
                MenuType.IMAGE
            }
            else -> {
                MenuType.URL
            }
        }
    }

}

enum class MenuType {
    TEXT,
    IMAGE,
    URL
}