package com.myapp.cryptocurrencytracker.crypto.presentation.coin_list

import com.myapp.cryptocurrencytracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}