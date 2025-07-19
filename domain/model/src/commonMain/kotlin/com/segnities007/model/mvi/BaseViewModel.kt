package com.segnities007.model.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel<
    T,
    S : Mvi.State<T>,
    I : Mvi.Intent,
    E : Mvi.Effect,
>(
    initialViewState: S,
) : ViewModel() {
    val coroutineScope = CoroutineScope(Dispatchers.Main)
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
