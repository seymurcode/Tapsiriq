package com.booking.entities.model.hotels

data class Policies(
    val checkin: Checkin,
    val checkin_min_age: Any,
    val checkout: Any,
    val fees: Fees,
    val instructions: Any,
    val know_before_you_go: Any,
    val special_instructions: Any
)