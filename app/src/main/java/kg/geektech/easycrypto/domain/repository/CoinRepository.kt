package kg.geektech.easycrypto.domain.repository

import kg.geektech.easycrypto.data.remote.dto.CoinDetailDto
import kg.geektech.easycrypto.data.remote.dto.CoinDto
import kg.geektech.easycrypto.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String) : CoinDetailDto

}