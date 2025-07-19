package com.segnities007.common

import com.segnities007.local.Database
import com.segnities007.local.createRoomDatabase
import org.koin.dsl.module

val databaseModule =
    module {
        single { createRoomDatabase() }
        single { get<Database>().storageDao() }
    }
