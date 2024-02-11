package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Guest(
    val adults: Int,
    val children: Int
):Parcelable