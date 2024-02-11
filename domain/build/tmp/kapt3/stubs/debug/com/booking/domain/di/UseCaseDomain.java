package com.booking.domain.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/booking/domain/di/UseCaseDomain;", "", "()V", "provideSearchUseCase", "Lcom/booking/domain/usecases/SearchListUseCase;", "repositoryInterface", "Lcom/booking/data/repository/FlightRepositoryInterface;", "domain_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UseCaseDomain {
    @org.jetbrains.annotations.NotNull
    public static final com.booking.domain.di.UseCaseDomain INSTANCE = null;
    
    private UseCaseDomain() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.booking.domain.usecases.SearchListUseCase provideSearchUseCase(@org.jetbrains.annotations.NotNull
    com.booking.data.repository.FlightRepositoryInterface repositoryInterface) {
        return null;
    }
}