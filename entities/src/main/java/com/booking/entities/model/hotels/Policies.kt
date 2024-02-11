package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Policies(
    val checkin: Checkin,
    val checkin_min_age: String, 
    val checkout: String, 
    val fees: Fees,
    val instructions: String, 
    val know_before_you_go: String, 
    val special_instructions: String
):Parcelable