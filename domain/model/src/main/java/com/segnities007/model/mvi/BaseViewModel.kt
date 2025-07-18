package com.segnities007.model.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * MVIの基本的なロジックを提供する抽象ViewModel
 * @param S UIの状態 (State)
 * @param I ユーザーの意図 (Intent)
 * @param E 副作用 (Effect)
 */
abstract class BaseViewModel<
    S : Mvi.State,
    I : Mvi.Intent,
    E : Mvi.Effect,
>(
    initialViewState: S,
) : ViewModel() {
    private val _state = MutableStateFlow(initialViewState)
    val state: StateFlow<S> = _state.asStateFlow()

    private val _effect = MutableSharedFlow<E>()
    val effect: SharedFlow<E> = _effect.asSharedFlow()

    protected abstract fun handleIntent(intent: I)

    protected fun handleEffect(effect: E) {
        viewModelScope.launch {
            _effect.emit(effect)
        }
    }
}
