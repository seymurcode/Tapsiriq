package com.booking.entities.model.hotels

data class Room(
    val alerts: List<Any>,
    val description: Any,
    val facilities: List<Any>,
    val images: List<Image>,
    val information: List<Any>,
    val offers: List<Offer>,
    val reference: String,
    val type: Type
)