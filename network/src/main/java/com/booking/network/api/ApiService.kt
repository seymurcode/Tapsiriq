package com.booking.network.api

import com.booking.entities.model.SearchResponse
import retrofit2.http.GET

interface ApiService {
    @GET("flights")
    suspend fun getFlights() : SearchResponse?
}