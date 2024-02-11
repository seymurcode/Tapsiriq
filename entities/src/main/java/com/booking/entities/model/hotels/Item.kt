package com.booking.entities.model.hotels

data class Item(
    val code: String,
    val count: Int,
    val name: String,
    val position: Int,
    val type: String,
    val value: Boolean
)