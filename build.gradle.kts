// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.androidApplication) version Versions.androidApplication apply false
    id(Plugins.jetBrainsKotlin) version Versions.jetbrainsKotlinAndroid apply false
    id(Classpath.hilt) version Versions.hilt apply false
    id("androidx.navigation.safeargs") version "2.7.3" apply false
    id("com.android.library") version "8.2.0" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}