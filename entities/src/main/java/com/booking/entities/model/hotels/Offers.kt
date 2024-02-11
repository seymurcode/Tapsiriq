package com.booking.entities.model.hotels

data class Offers(
    val availableCount: Int,
    val hotels: List<Hotel>,
    val totalCount: Int
)