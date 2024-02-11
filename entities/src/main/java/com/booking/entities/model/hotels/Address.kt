package com.booking.entities.model.hotels

data class Address(
    val address: String,
    val city: City,
    val country: Country,
    val countryCode: String,
    val town: Town,
    val zipCode: String
)