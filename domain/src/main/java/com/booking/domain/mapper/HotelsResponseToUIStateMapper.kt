package com.booking.domain.mapper

import com.booking.common.util.StringDecode.decodeUnicodeEscape
import com.booking.entities.model.hotels.Result
import com.booking.entities.uimodel.HotelListUIModel
import com.booking.entities.uimodel.HotelsHeaderUiModel
import com.booking.entities.uimodel.HotlesUIState
import org.apache.commons.lang3.StringEscapeUtils
import java.text.Normalizer
import javax.inject.Inject

class HotelsResponseToUIStateMapper @Inject constructor() : BaseMapper<Result, HotlesUIState> {
    override fun map(input: Result): HotlesUIState {
        return HotlesUIState(
            header = input.getHotelsHeader(),
            hotels = input.getHotels()
        )
    }

    private fun Result.getHotelsHeader() : HotelsHeaderUiModel {
        return HotelsHeaderUiModel(
            sorting = sortingMethods.firstOrNull()?.description?: "",
            filters = filters?.firstOrNull()?.name ?: "")
    }

    private fun Result.getHotels() : List<HotelListUIModel> {
        return offers?.hotels?.map {
            val rating_type: String
            rating_type = if(it.details.reviewScore >=9 )
                "Mükemmel"
            else if(it.details.reviewScore >=7)
                "Çok iyi"
            else if(it.details.reviewScore >=5)
                "İyi"
            else if(it.details.reviewScore >=3)
                "Kötü"
            else
                "Çok kötü"

            var discount: String=""
            var price_without_discount :Int=0

            it.rooms?.firstOrNull()?.offers?.firstOrNull()?.discountFrom?.let {dis->
                if(dis>0) {
                    discount=it.rooms?.firstOrNull()?.offers?.firstOrNull()?.discountFrom.toString()+" %";
                    price_without_discount= (it.rooms?.firstOrNull()?.offers?.firstOrNull()?.price)?.plus(
                        (it.rooms?.firstOrNull()?.offers?.firstOrNull()?.discountFrom!!)/100*(it.rooms?.firstOrNull()?.offers?.firstOrNull()?.price!!)
                    ) ?: 0
                }
            }

            HotelListUIModel(
                it.id.toString() ?: "",
                decodeUnicodeEscape(it.details.name) ?: "",
                 it.details.reviewScoreLocalized ?: "",
                 rating_type,
                 it.rooms?.firstOrNull()?.type?.name?: "",
                decodeUnicodeEscape(it.details.address.address) ?: "",
                decodeUnicodeEscape(it.rooms?.firstOrNull()?.offers?.firstOrNull()?.concept?.description) ?: "",

                decodeUnicodeEscape(it.details.cityCenterPointDistanceName + "\'e " + it.details.cityCenterPointDistance.toString() + " km") ?: "",
                discount ?: "",
                price_without_discount.toString() ?: "",
                decodeUnicodeEscape((it.rooms?.firstOrNull()?.offers?.firstOrNull()?.price.toString()?:"")+" "+(it.rooms?.firstOrNull()?.offers?.firstOrNull()?.displayedCurrency?:"")) ?: "",

                 "1 gece toplam",
                (it.details?.extra?.thumbnailImage)?.replace("/0x0","") ?: ""

                )
        } ?: listOf()
    }



}