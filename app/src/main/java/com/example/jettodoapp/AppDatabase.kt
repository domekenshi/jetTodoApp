package com.example.jettodoapp

import androidx.room.Database
import androidx.room.RoomDatabase

// @Databaseアノテーションをつけていること
@Database(entities = [Task::class], version = 1)
// RoomDatabaseクラスを継承した抽象クラスであること
abstract class AppDatabase :RoomDatabase(){

    // TaskDaoのインスタンスを返すような抽象クラスを定義する
    abstract fun taskDao():TaskDao

}