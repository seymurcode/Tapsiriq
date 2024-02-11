package com.booking.domain.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/booking/domain/usecases/HotelListUseCase;", "", "repository", "Lcom/booking/data/repository/HotelsRepositoryInterface;", "(Lcom/booking/data/repository/HotelsRepositoryInterface;)V", "getList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/booking/common/flowstate/Resource;", "Lcom/booking/entities/model/hotels/HotelsResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class HotelListUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.booking.data.repository.HotelsRepositoryInterface repository = null;
    
    @javax.inject.Inject
    public HotelListUseCase(@org.jetbrains.annotations.NotNull
    com.booking.data.repository.HotelsRepositoryInterface repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.booking.common.flowstate.Resource<com.booking.entities.model.hotels.HotelsResponse>>> $completion) {
        return null;
    }
}