package com.booking.flights.searchlist

import androidx.lifecycle.MutableLiveData
import com.booking.common.base.BaseViewModel
import com.booking.common.flowstate.Resource
import com.booking.common.flowstate.State
import com.booking.domain.mapper.SearchResponseToUIStateMapper
import com.booking.domain.usecases.SearchListUseCase
import com.booking.entities.uimodel.FlightSearchUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@HiltViewModel
class SearchListViewModel @Inject constructor(
    val searchUseCase : SearchListUseCase,
    private val mapper: SearchResponseToUIStateMapper
) : BaseViewModel() {
    val data = MutableLiveData<FlightSearchUIState?>()

     suspend fun getFlights() {
        searchUseCase.getList().collectLatest {
            when(it) {
                is Resource.Error -> state.emit(State.error(it.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                    it.data?.data?.let {
                        val mappedData = mapper.map(it)
                        data.postValue(mappedData)
                    }
                }
            }
        }
    }
}