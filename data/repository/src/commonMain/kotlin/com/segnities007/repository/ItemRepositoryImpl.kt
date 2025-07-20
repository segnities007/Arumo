package com.segnities007.repository

import com.segnities007.dto.ItemDao
import com.segnities007.model.Item
import kotlinx.coroutines.flow.Flow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class ItemRepositoryImpl: ItemRepository, KoinComponent {
    private val itemDao: ItemDao by inject()

    override suspend fun upsertItem(item: Item) {
        itemDao.upsert(item)
    }

    override suspend fun deleteItem(item: Item) {
        itemDao.delete(item)
    }

    override suspend fun getItemById(id: Int): Flow<Item?> {
        return itemDao.getItemById(id)
    }

    override suspend fun getItems(): Flow<List<Item>> {
        return itemDao.getAllItems()
    }
}