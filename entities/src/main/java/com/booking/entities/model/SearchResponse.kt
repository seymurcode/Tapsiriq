package com.booking.entities.model


import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SearchResponse(
    val `data`: Data?
) : Parcelable