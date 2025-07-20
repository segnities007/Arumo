package com.segnities007.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlin.time.ExperimentalTime

@Entity(tableName = "storages")
data class Storage(
    @PrimaryKey val id: String = "",
    val hostId: String = "",
    val name: String = "",
    val description: String = "",
    val itemIDs: List<Int> = emptyList(),
    val expenseIDs: List<Int> = emptyList(),
    val createAt: Instant = Clock.System.now(),
    val updateAt: Instant = Clock.System.now(),
    val editableUserIds: Map<String, Boolean> = emptyMap(),
)
