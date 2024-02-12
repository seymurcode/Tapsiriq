object Versions {
    const val androidApplication = "8.2.0"
    const val jetbrainsKotlinAndroid = "1.9.10"
    const val materialComponents = "1.11.0"
    const val hilt = "2.47"
    const val navigation = "2.7.6"

    const val retrofit = "2.9.0"
    const val okhttpLogging = "4.10.0"
    const val okhttp = "5.0.0-alpha.3"
    const val gson = "2.10.1"
    const val googleServices = "4.4.1"
    const val glide = "4.16.0"
    const val appCompat = "1.6.1"
    const val core = "1.12.0"
    const val junit = "4.13.2"
    const val testExt = "1.1.5"
    const val testEspresso = "3.5.1"
    const val constraintlayout = "2.1.4"
}

object Libs {
    object UI {
        const val material = "com.google.android.material:material:${Versions.materialComponents}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.materialComponents}"
    }
    object AndroidDefaultLibs {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val junit = "junit:junit:${Versions.junit}"
        const val testExt = "androidx.test.ext:junit:${Versions.testExt}"
        const val testEspresso = "androidx.test.espresso:espresso-core:${Versions.testEspresso}"
    }
    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    }

    object Api {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Navigation {
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val jetBrainsKotlin = "org.jetbrains.kotlin.android"
    const val hilt = "dagger.hilt.android.plugin"
    const val kotlinKapt = "kotlin-kapt"
    const val parcelize = "kotlin-parcelize"
    const val androidLibrary = "com.android.library"
}

object Classpath {
    const val hilt = "com.google.dagger.hilt.android"
    const val googleServices = "com.google.gms.google-services"
    const val navigation = "androidx.navigation.safeargs"
}

