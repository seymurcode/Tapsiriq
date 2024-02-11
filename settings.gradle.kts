pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AZRetrofitCase"
include(":app")
//include(":features:account")
include(":entities")
include(":domain")
include(":data")
include(":network")
include(":common")
include(":features:flights")
include(":features:searchdetail")
include(":features:hotels")
