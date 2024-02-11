package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class HotelsResponse(
    val campaign_banners: CampaignBanners,
    val errors: String, 
    val message: String, 
    val responseCode: Int,
    val result: Result
):Parcelable