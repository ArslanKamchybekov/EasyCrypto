package kg.geektech.easycrypto.presentation.coin_list

import kg.geektech.easycrypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
