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
        browser {
            webpackTask {
                cssSupport.enabled = true
            }
            runTask {
                cssSupport.enabled = true
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            
                //React, React DOM + Wrappers (chapter 3)
                implementation("org.jetbrains:kotlin-react:${v.Latest.Release.kotlinReact.version}")
                implementation("org.jetbrains:kotlin-react-dom:${v.Latest.Release.kotlinReact.version}")
                // implementation("org.jetbrains:kotlin-react-router-dom:${v.Latest.Release.kotlinReact.version}")
                implementation(npm("react", "^${v.Latest.NPM.react.version}"))
                implementation(npm("react-dom", "^${v.Latest.NPM.react.version}"))

                //Kotlin Styled (chapter 3)
                implementation("org.jetbrains:kotlin-styled:${v.Latest.Release.kotlinStyled.version}")
                implementation(npm("styled-components", "^${v.Latest.NPM.styledComponents.version}"))
                implementation(npm("inline-style-prefixer", "~${v.Latest.NPM.inlineStylePrefixer.version}"))

                implementation(npm("react-player", "^${v.Latest.NPM.reactPlayer.version}"))
                //Share Buttons (chapter 7)
                implementation(npm("react-share", "~${v.Latest.NPM.reactShare.version}"))
            
                //Coroutines (chapter 8)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${v.Latest.Release.kotlinxCoroutines.version}")

                // Layout
//                implementation(npm("css-loader", "^${v.Latest.NPM.cssLoader.version}"))
//                implementation(npm("style-loader", "^${v.Latest.NPM.styleLoader.version}"))
                implementation(npm("prop-types", "^15.7.2"))
                implementation(npm("react-grid-layout", "^${v.Latest.NPM.reactGridLayout.version}", generateExternals = true))

                // blueprintjs
                implementation("org.jetbrains:kotlin-react-redux:7.2.1-pre.133-kotlin-1.4.21")
                implementation(npm("react-redux", "^7.2.0"))
                implementation(npm("redux", "^4.0.5"))
                implementation(npm("core-js", "^3.8.1"))  // seems to be required by "kotlin-extensions" JS lib
                implementation(npm("@blueprintjs/core", "^3.36.0"))
                implementation(npm("@blueprintjs/select", "^3.15.0"))
                implementation(npm("@blueprintjs/icons", "^3.23.0"))
            }
        }
    }
}
