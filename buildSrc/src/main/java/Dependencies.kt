object Versions {
    const val androidApplication = "8.2.0"
    const val jetbrainsKotlinAndroid = "1.9.10"
    const val materialComponents = "1.11.0"
    const val hilt = "2.47"
    const val navigation = "2.7.6"
}

object Libs {
    object UI {
        const val material = "com.google.android.material:material:${Versions.materialComponents}"

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
}

object Classpath {
    const val hilt = "com.google.dagger.hilt.android"
}