package com.booking.entities.model.hotels

data class HotelsResponse(
    val campaign_banners: CampaignBanners,
    val errors: Any,
    val message: Any,
    val responseCode: Int,
    val result: Result
)