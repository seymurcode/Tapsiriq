package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class RefundableExpireDate(
    val date: String,
    val timezone: String,
    val timezone_type: Int
):Parcelable