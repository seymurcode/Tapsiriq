package com.booking.domain.usecases

import com.booking.common.flowstate.Resource
import com.booking.data.repository.FlightRepositoryInterface
import com.booking.data.repository.HotelsRepositoryInterface
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

import javax.inject.Inject

class HotelListUseCase @Inject constructor(
    private val repository : HotelsRepositoryInterface) {
    suspend fun getList() = flow {
        emit(Resource.Loading())
        repository.getHotels()?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Empty message error"))
    }.catch { exception->
        emit(Resource.Error(exception.localizedMessage))
    }
}