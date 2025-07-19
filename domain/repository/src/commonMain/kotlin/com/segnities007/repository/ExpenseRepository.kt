package com.segnities007.repository

import com.segnities007.model.Expense

interface ExpenseRepository {
    suspend fun upsertExpense(expense: Expense)
    suspend fun deleteExpense(expense: Expense)
    suspend fun getExpenseById(id: Int): Expense?
    suspend fun getExpenses(): List<Expense>
}