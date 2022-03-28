package kg.geektech.easycrypto.presentation.coin_detail

import kg.geektech.easycrypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
