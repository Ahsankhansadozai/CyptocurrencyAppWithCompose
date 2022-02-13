package com.example.bitcoinappmvvm.domain.use_case.get_coins

import com.example.bitcoinappmvvm.common.Resource
import com.example.bitcoinappmvvm.data.remote.dto.toCoin
import com.example.bitcoinappmvvm.domain.model.Coin
import com.example.bitcoinappmvvm.domain.repositoy.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(
                Resource.Error<List<Coin>>(
                    e.localizedMessage ?: "Couldn't reach server. Check internet Connection"
                )
            )
        }
    }
}