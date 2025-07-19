package com.segnities007.common

import com.segnities007.local.db.StorageDatabase
import com.segnities007.local.factory.createRoomDatabase
import org.koin.dsl.module

val storageDatabaseModule =
    module {
        single { createRoomDatabase() }
        single { get<StorageDatabase>().storageDao() }
    }
