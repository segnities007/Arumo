package com.segnities007.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)val id: Int = 0,
    val name: String = "",
    val amount: Int = 0,
    val count: Int = 0,
    val category: ConsumableCategory = ConsumableCategory.UNCATEGORIZED,
    val createAt: Instant = Clock.System.now(),
    val updateAt: Instant = Clock.System.now(),
)
