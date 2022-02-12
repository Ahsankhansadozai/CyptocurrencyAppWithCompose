package com.example.bitcoinappmvvm.domain.model

import com.example.bitcoinappmvvm.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tag: List<String>,
    val teamMember: List<TeamMember>
)
