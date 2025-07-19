package com.segnities007.local

import org.koin.core.scope.Scope

expect fun Scope.createRoomDatabase(): Database
