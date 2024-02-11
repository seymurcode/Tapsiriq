package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Filter(
    val icon: String,
    val items: List<Item>,
    val max: Max,
    val min: Min,
    val name: String,
    val title: String,
    val type: String
):Parcelable