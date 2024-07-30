package com.example.jettodoapp

import androidx.room.*
import kotlinx.coroutines.flow.Flow

// Daoということを伝える
@Dao
interface TaskDao {
    // 非同期ワンショットクエリ
    // 一回だけクエリが実行され、データベースのスナップショットを返す
    @Insert
    suspend fun insertTask(task:Task)

    // オブザーバブルクエリ
    // テーブルに変更があるたびに新しいデータを取得しにいくクエリ
    @Query("SELECT * FROM Task")
    fun loadAllTasks(): Flow<List<Task>>

    @Update
    suspend fun updateTask(task:Task)

    @Delete
    suspend fun deleteTask(task:Task)
}