package com.example.bitcoinappmvvm.data.remote.dto

import com.example.bitcoinappmvvm.domain.model.CoinDetail
import com.google.gson.annotations.SerializedName

data class CoinDetailDto(
    val contract: String,
    val contracts: List<Contract>,
    val description: String,
    @SerializedName("development_status")
    val development_status: String,
    @SerializedName("first_data_at")
    val first_data_at: String,
    @SerializedName("hardware_wallet")
    val hardware_wallet: Boolean,
    @SerializedName("hash_algorithm")
    val hash_algorithm: String,
    val id: String,
    @SerializedName("is_active")
    val is_active: Boolean,

    @SerializedName("is_new")
    val is_new: Boolean,
    @SerializedName("last_data_at")
    val last_data_at: String,
    val links: Links,
    @SerializedName("links_extended")
    val links_extended: List<LinksExtended>,
    val message: String,
    val name: String,
    @SerializedName("open_source")
    val open_source: Boolean,
    val org_structure: String,
    val parent: Parent,
    val platform: String,
    @SerializedName("proof_type")
    val proof_type: String,
    val rank: Int,
    @SerializedName("started_at")
    val started_at: String,
    val symbol: String,
    val tags: List<Tag>,
    val team: List<TeamMember>,
    val type: String,
    val whitepaper: Whitepaper
)


fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = is_active,
        tag = tags.map { it.name },
        teamMember = team
    )
}