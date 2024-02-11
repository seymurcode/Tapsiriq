package com.booking.entities.model.hotels

data class Hotel(
    val cached: Boolean,
    val details: Details,
    val df: Boolean,
    val fc: Boolean,
    val id: Int,
    val rooms: List<Room>
)