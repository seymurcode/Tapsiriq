package com.sirketismi.flights.searchlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sirketismi.data.repository.FlightRepositoryInterface
import com.sirketismi.entities.model.SearchResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchListViewModel @Inject constructor(val repositoryInterface: FlightRepositoryInterface) : ViewModel() {
    val data = MutableLiveData<SearchResponse?>()
    fun getFlights() {
        viewModelScope.launch {
            repositoryInterface.getFlights()?.let {
                data.postValue(it)
            }
        }
    }
}