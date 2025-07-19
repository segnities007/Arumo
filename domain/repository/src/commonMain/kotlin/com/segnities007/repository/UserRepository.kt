package com.segnities007.repository

import com.segnities007.model.User

interface UserRepository {
    suspend fun upsertUser(user: User)
    suspend fun deleteUser(user: User)
    suspend fun getUserById(id: Int): User?
    suspend fun getUsers(): List<User>
}