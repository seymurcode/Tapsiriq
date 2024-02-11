package com.booking.domain.mapper

import com.booking.entities.model.Data
import com.booking.entities.uimodel.FlightListUIModel
import com.booking.entities.uimodel.FlightSearchUIState
import com.booking.entities.uimodel.SearchHeaderUiModel
import javax.inject.Inject

class SearchResponseToUIStateMapper @Inject constructor() : BaseMapper<Data, FlightSearchUIState> {
    override fun map(input: Data): FlightSearchUIState {
        return FlightSearchUIState(
            header = input.getSearchHeader(),
            flights = input.getFlights()
        )
    }

    private fun Data.getSearchHeader() : SearchHeaderUiModel {
        return SearchHeaderUiModel(
            origin = search_parameters?.origin?.city_name ?: "",
            destination = search_parameters?.destination?.city_name ?: "")
    }

    private fun Data.getFlights() : List<FlightListUIModel> {
        return flights?.departure?.map {
            FlightListUIModel(
                it.enuid ?: "",
                airlineName = it.segments?.firstOrNull()?.marketing_airline ?: "",
                airlineIcon = "",
                price = 0.0)
        } ?: listOf()
    }
}