package com.example.bitcoinappmvvm.domain.repositoy

import com.example.bitcoinappmvvm.data.remote.dto.CoinDetailDto
import com.example.bitcoinappmvvm.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}