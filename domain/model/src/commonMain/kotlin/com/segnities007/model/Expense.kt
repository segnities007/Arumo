package com.segnities007.model

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

data class Expense(
    val id: String = "",
    val hostId: String = "",
    val name: String = "",
    val amount: Int = 0,
    val categories: Map<ConsumableCategory, Int> = emptyMap(),
    val createAt: Instant = Clock.System.now(),
    val updateAt: Instant = Clock.System.now(),
)