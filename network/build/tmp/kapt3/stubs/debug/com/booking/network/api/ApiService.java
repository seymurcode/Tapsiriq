package com.booking.network.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/booking/network/api/ApiService;", "", "getFlights", "Lcom/booking/entities/model/SearchResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.GET(value = "flights")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFlights(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.booking.entities.model.SearchResponse> $completion);
}