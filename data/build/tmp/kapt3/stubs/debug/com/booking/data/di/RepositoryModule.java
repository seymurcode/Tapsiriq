package com.booking.data.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/booking/data/di/RepositoryModule;", "", "()V", "providerHotelsRepository", "Lcom/booking/data/repository/HotelsRepositoryInterface;", "repository", "Lcom/booking/data/repository/HotelsRepository;", "providerSearchRepository", "Lcom/booking/data/repository/FlightRepositoryInterface;", "Lcom/booking/data/repository/FlightRepository;", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.booking.data.repository.FlightRepositoryInterface providerSearchRepository(@org.jetbrains.annotations.NotNull
    com.booking.data.repository.FlightRepository repository);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.booking.data.repository.HotelsRepositoryInterface providerHotelsRepository(@org.jetbrains.annotations.NotNull
    com.booking.data.repository.HotelsRepository repository);
}