package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CampaignBanners(
    val domestic: List<Domestic>,
    val international: List<String>
):Parcelable