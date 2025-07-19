package com.segnities007.repository

import com.segnities007.model.Storage

interface StorageRepository {
    suspend fun upsertStorage(storage: Storage)
    suspend fun deleteStorage(storage: Storage)
    suspend fun getStorageById(id: Int): Storage?
    suspend fun getStorages(): List<Storage>
}