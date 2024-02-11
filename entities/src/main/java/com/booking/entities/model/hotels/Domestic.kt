package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Domestic(
    val image: String,
    val index: Int
):Parcelable