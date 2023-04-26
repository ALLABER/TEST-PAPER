plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.allaber.paper"
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        applicationId = "com.allaber.paper"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation (Dependencies.core)
    implementation (Dependencies.appcompat)
    implementation (Dependencies.material)
    implementation (Dependencies.constraintLayout)
    testImplementation (Dependencies.junit)
    androidTestImplementation (Dependencies.testJunit)
    androidTestImplementation (Dependencies.testEspresso)
}