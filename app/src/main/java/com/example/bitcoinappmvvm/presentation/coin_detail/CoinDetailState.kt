package com.example.bitcoinappmvvm.presentation.coin_detail

import com.example.bitcoinappmvvm.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
