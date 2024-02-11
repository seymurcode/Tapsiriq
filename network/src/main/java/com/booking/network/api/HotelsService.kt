package com.booking.network.api

import com.booking.entities.model.hotels.HotelsResponse
import retrofit2.http.GET

interface HotelsService {
    @GET("hotels")
    suspend fun getHotels() : HotelsResponse?
}