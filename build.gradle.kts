buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.3")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.0-beta02")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
