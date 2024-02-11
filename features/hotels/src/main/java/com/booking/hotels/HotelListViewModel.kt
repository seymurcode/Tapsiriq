package com.booking.hotels

import androidx.lifecycle.MutableLiveData
import com.booking.common.base.BaseViewModel
import com.booking.common.flowstate.Resource
import com.booking.common.flowstate.State
import com.booking.domain.mapper.HotelsResponseToUIStateMapper
import com.booking.domain.mapper.SearchResponseToUIStateMapper
import com.booking.domain.usecases.HotelListUseCase
import com.booking.domain.usecases.SearchListUseCase
import com.booking.entities.uimodel.HotlesUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import javax.inject.Inject

@HiltViewModel
class HotelListViewModel @Inject constructor(
    val searchUseCase : HotelListUseCase,
    private val mapper: HotelsResponseToUIStateMapper
) : BaseViewModel() {
    val data = MutableLiveData<HotlesUIState?>()

     suspend fun getHotels() {
        searchUseCase.getList().collectLatest {
            when(it) {
                is Resource.Error -> state.emit(State.error(it.message))
                is Resource.Loading -> state.emit(State.loading())
                is Resource.Success -> {
                    state.emit(State.success())
                    it.data?.result?.let {
                        val mappedData = mapper.map(it)
                        data.postValue(mappedData)
                    }
                }
            }
        }
    }
}