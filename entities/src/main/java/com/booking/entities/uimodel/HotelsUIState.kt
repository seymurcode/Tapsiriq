package com.booking.entities.uimodel

data class HotlesUIState (
    val header: HotelsHeaderUiModel,
    val hotels: List<HotelListUIModel>
)
data class HotelsHeaderUiModel(
    val  sorting: String,
    val filters: String)
data class HotelListUIModel(
    var enuid : String,
    var name : String,
    var rating : String,
    val rating_type : String,
    val room_type : String,
    val address : String,
    val include_type : String,
    val center_distance : String,
    val discount : String,
    val price_without_discount : String,
    val price : String,
    val day_count : String,
    val image_link : String,
    )