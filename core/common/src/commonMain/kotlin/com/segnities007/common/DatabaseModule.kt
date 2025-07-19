package com.segnities007.common

import com.segnities007.local.createStorageDatabase
import com.segnities007.local.db.StorageDatabase
import org.koin.dsl.module

val storageDatabaseModule =
    module {
        single { createStorageDatabase() }
        single { get<StorageDatabase>().storageDao() }
    }
