package com.segnities007.repository

import com.segnities007.model.Itemg

interface ItemRepository {
    suspend fun upsertItem(item: Item)
    suspend fun deleteItem(item: Item)
    suspend fun getItemById(id: Int): Item?
    suspend fun getItems(): List<Item>
}