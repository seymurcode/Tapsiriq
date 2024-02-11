package com.booking.entities.model.hotels

data class RefundableExpireDate(
    val date: String,
    val timezone: String,
    val timezone_type: Int
)