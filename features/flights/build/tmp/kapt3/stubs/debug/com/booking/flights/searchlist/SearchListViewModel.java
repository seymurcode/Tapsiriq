package com.booking.flights.searchlist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/booking/flights/searchlist/SearchListViewModel;", "Lcom/booking/common/base/BaseViewModel;", "searchUseCase", "Lcom/booking/domain/usecases/SearchListUseCase;", "mapper", "Lcom/booking/domain/mapper/SearchResponseToUIStateMapper;", "(Lcom/booking/domain/usecases/SearchListUseCase;Lcom/booking/domain/mapper/SearchResponseToUIStateMapper;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/booking/entities/uimodel/FlightSearchUIState;", "getData", "()Landroidx/lifecycle/MutableLiveData;", "getSearchUseCase", "()Lcom/booking/domain/usecases/SearchListUseCase;", "getFlights", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flights_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SearchListViewModel extends com.booking.common.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.booking.domain.usecases.SearchListUseCase searchUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.booking.domain.mapper.SearchResponseToUIStateMapper mapper = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.booking.entities.uimodel.FlightSearchUIState> data = null;
    
    @javax.inject.Inject
    public SearchListViewModel(@org.jetbrains.annotations.NotNull
    com.booking.domain.usecases.SearchListUseCase searchUseCase, @org.jetbrains.annotations.NotNull
    com.booking.domain.mapper.SearchResponseToUIStateMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.booking.domain.usecases.SearchListUseCase getSearchUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.booking.entities.uimodel.FlightSearchUIState> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFlights(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}