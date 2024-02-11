package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Concept(
    val code: String,
    val conceptIcon: String,
    val conceptIconColorCode: String,
    val description: String,
    val parentCode: String
):Parcelable