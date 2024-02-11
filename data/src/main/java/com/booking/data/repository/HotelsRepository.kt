package com.booking.data.repository

import com.booking.entities.model.SearchResponse
import com.booking.entities.model.hotels.HotelsResponse
import com.booking.network.api.ApiService
import com.booking.network.api.HotelsService
import javax.inject.Inject


interface HotelsRepositoryInterface {
    suspend fun getHotels() : HotelsResponse?
}

class HotelsRepository @Inject constructor(private val hotelsService : HotelsService) : HotelsRepositoryInterface {
    override suspend fun getHotels(): HotelsResponse? {
        return hotelsService.getHotels()
    }
}