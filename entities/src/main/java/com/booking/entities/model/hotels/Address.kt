package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Address(
    val address: String,
    val city: City,
    val country: Country,
    val countryCode: String,
    val town: Town,
    val zipCode: String
):Parcelable