package com.booking.domain.di

import com.booking.data.repository.FlightRepositoryInterface
import com.booking.domain.usecases.SearchListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseDomain {
    @Provides
    @Singleton
    fun provideSearchUseCase(repositoryInterface: FlightRepositoryInterface) = SearchListUseCase(repositoryInterface)
}