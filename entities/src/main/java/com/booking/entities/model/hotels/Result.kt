package com.booking.entities.model.hotels

data class Result(
    val filters: List<Filter>,
    val funnelId: String,
    val offers: Offers,
    val requestId: String,
    val searchUrl: String,
    val sortingMethods: List<SortingMethod>
)