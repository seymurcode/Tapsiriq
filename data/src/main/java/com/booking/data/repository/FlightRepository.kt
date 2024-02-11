package com.booking.data.repository

import com.booking.entities.model.SearchResponse
import com.booking.network.api.ApiService
import javax.inject.Inject


interface FlightRepositoryInterface {
    suspend fun getFlights() : SearchResponse?
}

class FlightRepository @Inject constructor(private val apiService : ApiService) : FlightRepositoryInterface {
    override suspend fun getFlights(): SearchResponse? {
        return apiService.getFlights()
    }
}