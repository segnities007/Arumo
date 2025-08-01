package com.segnities007.model.mvi

sealed interface Mvi {
    sealed interface State<out T> {
        data object Loading : State<Nothing>

        data class Success<T>(
            val data: T,
        ) : State<T>

        data class Error(
            val message: String,
        ) : State<Nothing>
    }

    interface Intent

    interface Effect
}
