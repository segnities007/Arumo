package com.segnities007.model.mvi

sealed interface Mvi{
    interface State
    interface Intent
    interface Effect
}