package com.segnities007.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.segnities007.dto.StorageDao
import com.segnities007.model.Storage

private const val version = 1

@Database(entities = [Storage::class], version = version)
@TypeConverters(Converters::class)
abstract class Database : RoomDatabase() {
    abstract fun storageDao(): StorageDao
}