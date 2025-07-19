package com.segnities007.dto

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.segnities007.model.Expense
import com.segnities007.model.Storage
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(expense: Expense)

    @Delete
    suspend fun delete(expense: Expense)

    @Query("SELECT * FROM expenses WHERE id = :id")
    suspend fun getStorageById(id: Int): Expense?

    @Query("SELECT * FROM storages ORDER BY updateAt DESC")
    fun getAllStorages(): Flow<List<Expense>>
}
