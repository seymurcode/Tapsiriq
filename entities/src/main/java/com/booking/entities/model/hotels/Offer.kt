package com.booking.entities.model.hotels

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Offer(
    val alerts: List<String>,
    val allotment: Int,
    val buttonMessages: List<String>,
    val cancellationRules: List<String>,
    val comment: String, 
    val concept: Concept,
    val discountFrom: Int,
    val discountTags: String, 
    val displayedCurrency: String,
    val freeChildAgeHotelDetail: List<String>,
    val freeChildAgeRange: String, 
    val guest: Guest,
    val hasCancellationRule: Boolean,
    val hash: String,
    val hotelOfferBonusScRate: HotelOfferBonusScRate,
    val information: List<String>,
    val isCheapestOffer: Boolean,
    val isMemberOnlyDeal: Boolean,
    val isPossibleChange: Boolean,
    val isRefundable: Boolean,
    val isSaleable: Boolean,
    val needsCheck: Boolean,
    val needsCheckBeforeBooking: Boolean,
    val offerType: String,
    val payAtHotel: Boolean,
    val price: Int,
    val priceBreakDowns: List<String>,
    val provider: Int,
    val refundableExpireDate: RefundableExpireDate,
    val roomClass: RoomClass,
    val sourceOfferType: String
):Parcelable