plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.allaber.system"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        minSdk = ConfigData.minSdkVersion
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    api(projects.ui.assets)
    api(projects.ui.localization)
    api(Dependencies.material)
}