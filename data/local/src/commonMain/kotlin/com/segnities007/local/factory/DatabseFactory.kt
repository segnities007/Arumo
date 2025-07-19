package com.segnities007.local.factory

import com.segnities007.local.db.StorageDatabase
import org.koin.core.scope.Scope

expect fun Scope.createRoomDatabase(): StorageDatabase
