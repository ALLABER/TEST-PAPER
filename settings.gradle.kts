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
rootProject.name = "TEST-PAPER"
include(":app")
include(":data")
include(":domain")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":ui:assets")
include(":ui:localization")
include(":ui:system")
