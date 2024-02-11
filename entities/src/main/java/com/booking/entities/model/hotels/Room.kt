package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Room(
    val alerts: List<String>,
    val description: String, 
    val facilities: List<String>,
    val images: List<Image>,
    val information: List<String>,
    val offers: List<Offer>,
    val reference: String,
    val type: Type
):Parcelable