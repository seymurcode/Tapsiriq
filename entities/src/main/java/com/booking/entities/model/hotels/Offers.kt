package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Offers(
    val availableCount: Int,
    val hotels: List<Hotel>,
    val totalCount: Int
):Parcelable