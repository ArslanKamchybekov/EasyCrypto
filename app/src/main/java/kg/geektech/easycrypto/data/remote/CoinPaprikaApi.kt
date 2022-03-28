package kg.geektech.easycrypto.data.remote

import kg.geektech.easycrypto.data.remote.dto.CoinDetailDto
import kg.geektech.easycrypto.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto

}