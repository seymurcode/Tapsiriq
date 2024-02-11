package com.booking.domain.usecases

import com.booking.common.flowstate.Resource
import com.booking.data.repository.FlightRepositoryInterface
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

import javax.inject.Inject

class SearchListUseCase @Inject constructor(
    private val repository : FlightRepositoryInterface) {
    suspend fun getList() = flow {
        emit(Resource.Loading())
        repository.getFlights()?.let {
            emit(Resource.Success(it))
        } ?: emit(Resource.Error("Empty message error"))
    }.catch { exception->
        emit(Resource.Error(exception.localizedMessage))
    }
}