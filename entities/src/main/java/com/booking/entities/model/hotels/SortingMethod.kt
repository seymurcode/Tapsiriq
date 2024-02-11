package com.booking.entities.model.hotels

data class SortingMethod(
    val default: Boolean,
    val description: String,
    val text: String,
    val value: Int
)