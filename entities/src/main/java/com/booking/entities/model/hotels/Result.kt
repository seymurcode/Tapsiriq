package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Result(
    val filters: List<Filter>,
    val funnelId: String,
    val offers: Offers,
    val requestId: String,
    val searchUrl: String,
    val sortingMethods: List<SortingMethod>
):Parcelable