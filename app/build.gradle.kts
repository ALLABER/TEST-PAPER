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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(projects.domain)

    implementation (Dependencies.core)
    implementation (Dependencies.appcompat)
    implementation (Dependencies.material)
    implementation (Dependencies.constraintLayout)
    implementation (Dependencies.viewBinding)
    implementation (Dependencies.navigationFragment)
    implementation (Dependencies.navigationUi)
    implementation (Dependencies.viewModel)
    implementation (Dependencies.viewModelKtx)

    testImplementation (Dependencies.junit)
    androidTestImplementation (Dependencies.testJunit)
    androidTestImplementation (Dependencies.testEspresso)
}