plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.allaber.assets"
    compileSdk = ConfigData.compileSdkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}