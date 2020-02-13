package com.nikita.navigationuiexample.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nikita.navigationuiexample.db.entity.MenuEntity

@Database(entities = [MenuEntity::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

}