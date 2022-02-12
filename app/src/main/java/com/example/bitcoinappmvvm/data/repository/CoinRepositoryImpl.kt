package com.example.bitcoinappmvvm.data.repository

import com.example.bitcoinappmvvm.data.remote.dto.CoinDetailDto
import com.example.bitcoinappmvvm.data.remote.dto.CoinDto
import com.example.bitcoinappmvvm.domain.repositoy.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinPaprikaApi: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return getCoinById(coinId)
    }

}
