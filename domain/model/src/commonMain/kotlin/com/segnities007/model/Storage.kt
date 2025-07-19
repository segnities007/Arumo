package com.segnities007.model

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlin.time.ExperimentalTime

data class Storage @OptIn(ExperimentalTime::class) constructor(
    val id: String = "",
    val hostId: String = "",
    val name: String = "",
    val description: String = "",
    val itemIDs: List<String> = emptyList(),
    val expenseIDs: List<String> = emptyList(),
    val createAt: Instant = Clock.System.now(),
    val updateAt: Instant = Clock.System.now(),
    val editableUserIds: Map<String, Boolean> = emptyMap()
    )