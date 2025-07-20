package com.segnities007.repository

import com.segnities007.dto.UserDao
import com.segnities007.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class UserRepositoryImpl: UserRepository, KoinComponent {
    private val userDao: UserDao by inject()

    override suspend fun upsertUser(user: User) {
        userDao.upsert(user)
    }

    override suspend fun deleteUser(user: User) {
        userDao.delete(user)
    }

    override suspend fun getUser(): Flow<User> {
        return  userDao.getUser().map { it.first() }
    }
}