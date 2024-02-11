package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class SortingMethod(
    val default: Boolean,
    val description: String,
    val text: String,
    val value: Int
):Parcelable