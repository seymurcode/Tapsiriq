package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Type(
    val characteristicCode: String,
    val id: String, 
    val name: String,
    val typeCode: String
):Parcelable