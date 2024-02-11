package com.booking.entities.model.hotels

data class RoomClass(
    val code: String,
    val description: String,
    val offer: Boolean,
    val `package`: Boolean,
    val promotion: Boolean,
    val refundable: Boolean
)