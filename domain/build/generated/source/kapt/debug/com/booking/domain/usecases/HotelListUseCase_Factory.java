// Generated by Dagger (https://dagger.dev).
package com.booking.domain.usecases;

import com.booking.data.repository.HotelsRepositoryInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HotelListUseCase_Factory implements Factory<HotelListUseCase> {
  private final Provider<HotelsRepositoryInterface> repositoryProvider;

  public HotelListUseCase_Factory(Provider<HotelsRepositoryInterface> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HotelListUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static HotelListUseCase_Factory create(
      Provider<HotelsRepositoryInterface> repositoryProvider) {
    return new HotelListUseCase_Factory(repositoryProvider);
  }

  public static HotelListUseCase newInstance(HotelsRepositoryInterface repository) {
    return new HotelListUseCase(repository);
  }
}