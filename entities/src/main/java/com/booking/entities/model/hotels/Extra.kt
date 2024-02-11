package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Extra(
    val image_count: Int,
    val thumbnailImage: String
):Parcelable