package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize data class Image(
    val name: String,
    val type: String,
    val url: String
):Parcelable