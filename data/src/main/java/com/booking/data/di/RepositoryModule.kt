package com.booking.data.di

import com.booking.data.repository.FirebaseAuthRepository
import com.booking.data.repository.FirebaseAuthRepositoryInterface
import com.booking.data.repository.FlightRepository
import com.booking.data.repository.FlightRepositoryInterface
import com.booking.data.repository.HotelsRepository
import com.booking.data.repository.HotelsRepositoryInterface

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun providerSearchRepository(repository: FlightRepository) : FlightRepositoryInterface

    @Binds
    @Singleton
    abstract fun providerHotelsRepository(repository: HotelsRepository) : HotelsRepositoryInterface


/*    @Singleton
    @Provides
    fun provideFirestore() : FirebaseFirestore {
        return Firebase.firestore
    }

    @Singleton
    @Provides
    fun provideAuthFirestore() : FirebaseAuth {
        return Firebase.auth
    }*/


    @Binds
    @Singleton
    abstract fun bindFirebaseAuthRepository(im : FirebaseAuthRepository) : FirebaseAuthRepositoryInterface

}