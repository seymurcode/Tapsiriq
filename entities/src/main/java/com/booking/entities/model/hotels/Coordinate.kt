package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Coordinate(
    val latitude: Double,
    val longitude: Double
):Parcelable