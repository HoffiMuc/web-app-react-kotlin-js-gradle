plugins {
    kotlin("multiplatform") version "1.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

kotlin {
    js {
        browser {}
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            
                //React, React DOM + Wrappers (chapter 3)
                implementation("org.jetbrains:kotlin-react:17.0.0-pre.132-kotlin-1.4.21")
                implementation("org.jetbrains:kotlin-react-dom:17.0.0-pre.132-kotlin-1.4.21")
                implementation(npm("react", "17.0.0"))
                implementation(npm("react-dom", "17.0.0"))
            
                //Kotlin Styled (chapter 3)
                implementation("org.jetbrains:kotlin-styled:5.2.0-pre.132-kotlin-1.4.21")
                implementation(npm("styled-components", "~5.2.1"))
                implementation(npm("inline-style-prefixer", "~6.0.0"))
            
                //Video Player (chapter 7)
                implementation(npm("react-player", "~2.6.0"))
            
                //Share Buttons (chapter 7)
                implementation(npm("react-share", "~4.2.1"))
            
                //Coroutines (chapter 8)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
            }
        }
    }
}