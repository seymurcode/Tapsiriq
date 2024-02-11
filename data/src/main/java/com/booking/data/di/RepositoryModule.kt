package com.booking.data.di

import com.booking.data.repository.FlightRepository
import com.booking.data.repository.FlightRepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun providerSearchRepository(repository: FlightRepository) : FlightRepositoryInterface
}