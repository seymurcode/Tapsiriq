package com.booking.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/booking/data/repository/HotelsRepositoryInterface;", "", "getHotels", "Lcom/booking/entities/model/hotels/HotelsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface HotelsRepositoryInterface {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getHotels(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.booking.entities.model.hotels.HotelsResponse> $completion);
}