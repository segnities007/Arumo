package com.segnities007.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

@Entity(tableName = "expenses")
data class Expense(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val hostId: String = "",
    val name: String = "",
    val amount: Int = 0,
    val categories: Map<ConsumableCategory, Int> = emptyMap(),
    val createAt: Instant = Clock.System.now(),
    val updateAt: Instant = Clock.System.now(),
)
