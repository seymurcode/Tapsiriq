package com.booking.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/booking/data/repository/HotelsRepository;", "Lcom/booking/data/repository/HotelsRepositoryInterface;", "hotelsService", "Lcom/booking/network/api/HotelsService;", "(Lcom/booking/network/api/HotelsService;)V", "getHotels", "Lcom/booking/entities/model/hotels/HotelsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class HotelsRepository implements com.booking.data.repository.HotelsRepositoryInterface {
    @org.jetbrains.annotations.NotNull
    private final com.booking.network.api.HotelsService hotelsService = null;
    
    @javax.inject.Inject
    public HotelsRepository(@org.jetbrains.annotations.NotNull
    com.booking.network.api.HotelsService hotelsService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getHotels(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.booking.entities.model.hotels.HotelsResponse> $completion) {
        return null;
    }
}