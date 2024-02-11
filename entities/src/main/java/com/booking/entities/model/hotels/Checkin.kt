package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Checkin(
    val begin_time: String, 
    val end_time: String
):Parcelable