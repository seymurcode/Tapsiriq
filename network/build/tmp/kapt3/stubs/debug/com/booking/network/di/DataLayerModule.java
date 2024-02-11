package com.booking.network.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0007J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u0010\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/booking/network/di/DataLayerModule;", "", "()V", "provideApiClient", "Lretrofit2/Retrofit;", "gson", "Lcom/google/gson/Gson;", "client", "Lokhttp3/OkHttpClient;", "provideCampaignOkHttpsClient", "provideCampaignService", "Lcom/booking/network/api/CampaignService;", "retrofit", "provideCampignApiClient", "provideGson", "provideHotelsApiClient", "provideHotelsOkHttpsClient", "provideHotelsService", "Lcom/booking/network/api/HotelsService;", "provideOkHttpsClient", "tokenInjector", "Lcom/booking/network/interceptors/TokenInjector;", "providerApiService", "Lcom/booking/network/api/ApiService;", "network_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DataLayerModule {
    @org.jetbrains.annotations.NotNull
    public static final com.booking.network.di.DataLayerModule INSTANCE = null;
    
    private DataLayerModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @FlightAnnotation
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideApiClient(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson, @FlightAnnotation
    @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.booking.network.api.ApiService providerApiService(@FlightAnnotation
    @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @FlightAnnotation
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideOkHttpsClient(@org.jetbrains.annotations.NotNull
    com.booking.network.interceptors.TokenInjector tokenInjector) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @CampaignAnnotation
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideCampignApiClient(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson, @CampaignAnnotation
    @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.booking.network.api.CampaignService provideCampaignService(@CampaignAnnotation
    @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @CampaignAnnotation
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideCampaignOkHttpsClient() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @HotelsAnnotation
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provideHotelsApiClient(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson, @HotelsAnnotation
    @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.booking.network.api.HotelsService provideHotelsService(@HotelsAnnotation
    @org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @HotelsAnnotation
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient provideHotelsOkHttpsClient() {
        return null;
    }
}