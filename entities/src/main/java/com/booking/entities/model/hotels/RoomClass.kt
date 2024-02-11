package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class RoomClass(
    val code: String,
    val description: String,
    val offer: Boolean,
    val `package`: Boolean,
    val promotion: Boolean,
    val refundable: Boolean
):Parcelable