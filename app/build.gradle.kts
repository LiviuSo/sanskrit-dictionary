plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin)
    alias(libs.plugins.google.devtools.ksp)
    alias(libs.plugins.kotlin.compose.compiler)
    alias(libs.plugins.hilt)
    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics)
    alias(libs.plugins.firebase.performance)
    alias(libs.plugins.jetbrains.serialization)
}

android {
    namespace = "com.sanskrit.dictionary"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sanskrit.dictionary"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.bundles.compose)
    implementation(libs.jetbrains.coroutines)
    implementation(libs.jetbrains.serialization)
    implementation(libs.jetbrains.reflect)

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.material3)
    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation)
    implementation(libs.androidx.app.compat)
    implementation(libs.androidx.custom.tabs)

    implementation(libs.coil)
    implementation(libs.coil.svg)
    implementation(libs.onetrust)

    // room
    implementation(libs.room.runtime)
    ksp(libs.room.compiler) // If this project uses any Kotlin source, use Kotlin Symbol Processing (KSP)
    implementation(libs.room.ktx) // optional - Kotlin Extensions and Coroutines support for Room
    testImplementation(libs.room.testing) // optional - Test helpers
    implementation(libs.room.paging) // optional - Paging 3 Integration

    implementation(libs.zxing)
    implementation(libs.hilt)
    ksp(libs.hilt.compiler)

    implementation(platform(libs.firebase.bom))
    implementation(libs.bundles.firebase)

    testImplementation(libs.junit)
    testImplementation(libs.mockk)
    testImplementation(libs.jetbrains.coroutines.test)

    androidTestImplementation(libs.test.junit)
    androidTestImplementation(libs.espresso)
    androidTestImplementation(libs.compose.ui.test.junit)
    androidTestImplementation(platform(libs.compose.bom))

    debugImplementation(libs.bundles.ui.test)
    debugImplementation(libs.leakcanary)
}