package com.sirketismi.network.api

import com.sirketismi.entities.model.SearchResponse
import retrofit2.http.GET

interface ApiService {
    @GET("flights")
    suspend fun getFlights() : SearchResponse?
}