package com.example.bitcoinappmvvm.presentation.coin_list

import com.example.bitcoinappmvvm.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
