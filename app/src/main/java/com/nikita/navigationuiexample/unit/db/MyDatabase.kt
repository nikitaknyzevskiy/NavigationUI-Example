package com.nikita.navigationuiexample.unit.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nikita.navigationuiexample.unit.db.entity.MenuEntity

@Database(entities = [MenuEntity::class], version = 1)
abstract class MyDatabase : RoomDatabase() {

}