package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Details(
    val address: Address,
    val checkInTime: String,
    val checkOutTime: String,
    val cityCenterPointDistance: Double,
    val cityCenterPointDistanceName: String,
    val coordinate: Coordinate,
    val covidInfo: String, 
    val description: String,
    val domestic: Boolean,
    val extra: Extra,
    val facilitiesGroup: List<String>,
    val generalReviewScoreNote: String,
    val hotelAutocompleteIcon: String,
    val hotelConcept: List<String>,
    val hotelDescriptions: List<String>,
    val hotelInfoDescription: String, 
    val id: String, 
    val imageTypes: List<String>,
    val images: List<String>,
    val locationDistance: String, 
    val name: String,
    val nearByHotels: String, 
    val policies: Policies,
    val reviewInfo: String, 
    val reviewScore: Int,
    val reviewScoreLocalized: String,
    val reviews: String, 
    val reviewsTotalCount: String, 
    val slug: String,
    val starRating: Int,
    val suitabilities: List<String>
):Parcelable