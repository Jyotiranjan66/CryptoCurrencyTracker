package com.myapp.cryptocurrencytracker.crypto.presentation.coin_list

import com.myapp.cryptocurrencytracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}