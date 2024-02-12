// Generated by Dagger (https://dagger.dev).
package com.booking.network.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.booking.network.di.CampaignAnnotation")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DataLayerModule_ProvideCampaignOkHttpsClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideCampaignOkHttpsClient();
  }

  public static DataLayerModule_ProvideCampaignOkHttpsClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideCampaignOkHttpsClient() {
    return Preconditions.checkNotNullFromProvides(DataLayerModule.INSTANCE.provideCampaignOkHttpsClient());
  }

  private static final class InstanceHolder {
    private static final DataLayerModule_ProvideCampaignOkHttpsClientFactory INSTANCE = new DataLayerModule_ProvideCampaignOkHttpsClientFactory();
  }
}