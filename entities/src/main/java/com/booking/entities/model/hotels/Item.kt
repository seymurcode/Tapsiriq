package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Item(
    val code: String,
    val count: Int,
    val name: String,
    val position: Int,
    val type: String,
    val value: Boolean
):Parcelable