plugins {
    kotlin("multiplatform") version v.kotlinLatest
}

group = "com.accorddesk"
version = v.version
apply(from = "buildExt.gradle.kts")
val env: String by extra
val artifactName: String by extra
val archivesBaseName: String by extra
val repo: String by extra
val repoHttps: String by extra


repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap/")
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    jcenter()
    mavenCentral()
}

// common custom self-defined helper functions in: buildSrc/src/main/kotlin/c/commons.kt
println("\n====================================================================================================")
println("Project: ${project.rootProject.group}:${artifactName}:${project.rootProject.version}" + c.lastThreeDirsOf(projectDir))
println("target env: ${env}")
println("====================================================================================================")

apply(from = "buildfiles/buildLifecycleHooks.gradle.kts")
apply(from = "buildfiles/buildCheckForUpdates.gradle.kts")

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
                implementation("org.jetbrains:kotlin-react:${v.Latest.Release.kotlinReact.version}")
                implementation("org.jetbrains:kotlin-react-dom:${v.Latest.Release.kotlinReact.version}")
                implementation(npm("react", "^${v.Latest.NPM.react.version}"))
                implementation(npm("react-dom", "^${v.Latest.NPM.react.version}"))
            
                //Kotlin Styled (chapter 3)
                implementation("org.jetbrains:kotlin-styled:${v.Latest.Release.kotlinStyled.version}")
                implementation(npm("styled-components", "^${v.Latest.NPM.styledComponents.version}"))
                implementation(npm("inline-style-prefixer", "~${v.Latest.NPM.inlineStylePrefixer.version}"))
                //Share Buttons (chapter 7)
                implementation(npm("react-share", "~${v.Latest.NPM.reactShare.version}"))
            
                //Coroutines (chapter 8)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${v.Latest.Release.kotlinxCoroutines.version}")
            }
        }
    }
}
