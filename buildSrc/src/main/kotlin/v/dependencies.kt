package v

const val MAVEN = "https://repo1.maven.org"
const val MAVEN2 = "maven2"
const val SPRING = "https://repo.spring.io"
const val RELEASE = "libs-release"
const val MS = "milestone"
const val SNAPSHOT = "snapshot"
const val GRADLEPLUGINS = "https://plugins.gradle.org"
const val PLUGIN = "plugin"

// singleton definitions
object Latest {
    enum class NPM(val version: String, val repo: String, val path: String, val group: String, val artifact: String) {
        react("17.0.1", "", "", "", ""),
        reactShare("4.3.1", "", "", "", ""),
        styledComponents("5.2.1", "", "", "", ""),
        inlineStylePrefixer("6.0.0", "", "", "", ""),
        reactPlayer("2.7.2", "", "", "", ""),
        reactGridLayout("0.13.5", "", "", "", ""),
        cssLoader("5.0.1", "", "", "", ""),
        styleLoader("2.0.0", "", "", "", ""),
    }
    enum class Release(val version: String, val repo: String, val path: String, val group: String, val artifact: String) {
        kotlin("1.4.21",                      MAVEN, MAVEN2, "org.jetbrains.kotlin",         "kotlin-stdlib-jdk8"),
        kotlinx("0.7.2",                     SPRING, RELEASE, "org.jetbrains.kotlinx",       "kotlinx-html"),
        kotlinxCoroutines("1.4.2",           SPRING, RELEASE, "org.jetbrains.kotlinx",       "kotlinx-coroutines-core"),
        kotlinReact("17.0.0-pre.132-kotlin-1.4.21", SPRING, RELEASE, "org.jetbrains.kotlinx", "kotlin-react"),
        kotlinStyled("5.2.0-pre.132-kotlin-1.4.21", SPRING, RELEASE, "org.jetbrains",        "kotlin-styled"),
        micronautBOM("2.2.1",                 MAVEN, MAVEN2, "io.micronaut",                 "micronaut-bom"),
        micronautPicocliCodegen("4.5.2",      MAVEN, MAVEN2, "info.picocli",                 "picocli-codegen"),
        springBoot("2.4.1",                   MAVEN, MAVEN2, "org.springframework.boot",     "spring-boot-dependencies"),
        springCloud("Hoxton.SR9",             MAVEN, MAVEN2, "org.springframework.cloud",    "spring-cloud-dependencies"),
        springCloudContract("2.2.5.RELEASE",  MAVEN, MAVEN2, "org.springframework.cloud",    "spring-cloud-starter-contract-verifier"),
        resilience4j("1.6.1",                 MAVEN, MAVEN2, "io.github.resilience4j",       "resilience4j-spring-boot2"),
        logback("1.2.3",                      MAVEN, MAVEN2, "ch.qos.logback",               "logback-core"),
        graphqlJava("15.0",                   MAVEN, MAVEN2, "com.graphql-java",             "graphql-java"),
        graphqlSpring("8.0.0",                MAVEN, MAVEN2, "com.graphql-java-kickstart",   "graphql-spring-boot-starter"),
        snakeYaml("1.27",                     MAVEN, MAVEN2, "org.yaml",                     "snakeyaml"),
        jacksonModuleKotlin("2.12.0",         MAVEN, MAVEN2, "com.fasterxml.jackson.module", "jackson-module-kotlin"),
        braveInstrumentation("5.13.2",        MAVEN, MAVEN2, "io.zipkin.brave",              "brave-instrumentation-parent"),
        apachePoi("4.1.2",                    MAVEN, MAVEN2, "org.apache.poi",               "poi"),
        commonsLang3("3.11",                  MAVEN, MAVEN2, "org.apache.commons",           "commons-lang3"),
        commonsText("1.9",                    MAVEN, MAVEN2, "org.apache.commons",           "commons-text"),
        picocli("4.5.2",                      MAVEN, MAVEN2, "info.picocli",                 "picocli"),
        guava("30.1-jre",                     MAVEN, MAVEN2, "com.google.guava",             "guava"),
        junitJupiter("5.7.0",                 MAVEN, MAVEN2, "org.junit.jupiter",            "junit-jupiter"),
        hamcrest("2.2",                       MAVEN, MAVEN2, "org.hamcrest",                 "hamcrest-library"),
        springmockk("3.0.0",                  MAVEN, MAVEN2, "com.ninja-squad",              "springmockk"),
        mockk("1.10.3",                       MAVEN, MAVEN2, "io.mockk",                     "mockk"),
        micronautKotest("2.3.0",              MAVEN, MAVEN2, "io.micronaut.test",            "micronaut-test-kotest"),
        kotest("4.3.2",                       MAVEN, MAVEN2, "io.kotest",                    "kotest-runner-junit5-jvm"),
        jetbrainsExposed("0.28.1",            SPRING, RELEASE, "org.jetbrains.exposed",       "exposed-core"),
        h2Jdbc("1.4.200",                     MAVEN, MAVEN2, "com.h2database",               "h2"),
        postgresJdbc("42.2.18",               MAVEN, MAVEN2, "org.postgresql",               "postgresql"),
        antlr4("4.9",                         MAVEN, MAVEN2, "org.antlr",                    "antlr4")
    }
    enum class Milestone (val version: String, val repo: String, val path: String, val group: String, val artifact: String) {
        springBoot("2.4.0-RC1",               SPRING, MS, "org.springframework.boot", "spring-boot-dependencies"),
        springCloud("2020.0.0-M5",              SPRING, MS, "org.springframework.cloud", "spring-cloud-dependencies"),
        springCloudCircuitbreaker("2.0.0.M1", SPRING, MS, "org.springframework.cloud", "spring-cloud-circuitbreaker-dependencies"),
        springSleuth("3.0.0.M1",              SPRING, MS, "org.springframework.cloud", "spring-cloud-sleuth-dependencies"),
        springCloudContract("3.0.0.M1",       SPRING, MS, "org.springframework.cloud", "spring-cloud-starter-contract-verifier")
    }
    enum class Snapshot(val version: String, val repo: String, val path: String, val group: String, val artifact: String) {
        springBoot("2.3.0.BUILD-SNAPSHOT",    SPRING, SNAPSHOT, "org.springframework.boot", "spring-boot-dependencies"),
        springCloud("",                       SPRING, SNAPSHOT, "org.springframework.cloud", "spring-cloud-dependencies"),
        springCloudCircuitbreaker("1.0.0.BUILD-SNAPSHOT", SPRING, SNAPSHOT, "org.springframework.cloud", "spring-cloud-circuitbreaker-dependencies"),
        springSleuth("3.0.0.M1", "", "", "", ""),
        springCloudContract("3.0.0.M1", "", "", "", "")
    }
    enum class Plugin(val version: String, val repo: String, val path: String, val group: String, val artifact: String) {
        micronautPlugin("1.2.0",              GRADLEPLUGINS, PLUGIN, "", "io.micronaut.application"),
        springBoot("2.4.1",                   GRADLEPLUGINS, PLUGIN, "", "org.springframework.boot"),
        kotlin("1.4.21",                      GRADLEPLUGINS, PLUGIN, "", "org.jetbrains.kotlin.jvm"),
        dependencyManagement("1.0.10.RELEASE", GRADLEPLUGINS, PLUGIN, "", "io.spring.dependency-management"),
        springCloudContract("2.2.5.RELEASE",  GRADLEPLUGINS, PLUGIN, "", "org.springframework.cloud.contract"), 
        propdeps("0.0.9.RELEASE",             "", "", "", ""),
        cfGradle("1.1.3",                     "", "", "", ""),
        docker("6.6.1",                       GRADLEPLUGINS, PLUGIN, "", "com.bmuschko.docker-spring-boot-application"),
        artifactory("4.18.2",                 GRADLEPLUGINS, PLUGIN, "", "com.jfrog.artifactory"), //("latest"),
        jenkins("1.3.6",                      GRADLEPLUGINS, PLUGIN, "", "com.terrafolio.jenkins"),
        gitProperties("2.2.4",                GRADLEPLUGINS, PLUGIN, "", "com.gorylenko.gradle-git-properties"),
        jib("2.7.0",                          GRADLEPLUGINS, PLUGIN, "", "com.google.cloud.tools.jib")
    }
    enum class Groovy(val version: String, val repo: String, val path: String, val group: String, val artifact: String) {
        groovyAll("2.5.11",     MAVEN, MAVEN2, "org.codehaus.groovy",     "groovy-all"), // groovyAll("2.5.11"),
        spock("1.3-groovy-2.5", MAVEN, MAVEN2, "org.spockframework",      "spock-core") // spock("1.3-groovy-2.5")
    }
}

// Extension functions on gradles DependencyHandler class
val kotlinLatest = Latest.Release.kotlin.version
val micronautLatest = Latest.Release.micronautBOM.version
val micronautPicocliCodegenLatest = Latest.Release.micronautPicocliCodegen.version
val springBootLatest = Latest.Release.springBoot.version
val springCloudLatest = Latest.Release.springCloud.version
val springCloudContractLatest = Latest.Release.springCloudContract.version
val resilience4jLatest = Latest.Release.resilience4j.version
val logbackLatest = Latest.Release.logback.version
val graphqlJavaLatest = Latest.Release.graphqlJava.version
val graphqlSpringLatest = Latest.Release.graphqlSpring.version
val snakeYamlLatest = Latest.Release.snakeYaml.version
val jacksonModuleKotlinLatest = Latest.Release.jacksonModuleKotlin.version
val braveInstrumentationLatest = Latest.Release.braveInstrumentation.version
val apachePoiLatest = Latest.Release.apachePoi.version
val commonsLang3Latest = Latest.Release.commonsLang3.version
val commonsTextLatest = Latest.Release.commonsText.version
val picocliLatest = Latest.Release.picocli.version
val guavaLatest = Latest.Release.guava.version
val junitJupiterLatest = Latest.Release.junitJupiter.version
val hamcrestLatest = Latest.Release.hamcrest.version
val springmockkLatest = Latest.Release.springmockk.version
val mockkLatest = Latest.Release.mockk.version
val micronautKotestLatest = Latest.Release.micronautKotest.version
val kotestLatest = Latest.Release.kotest.version
val jetbrainsExposedLatest = Latest.Release.jetbrainsExposed.version
val h2JdbcLatest = Latest.Release.h2Jdbc.version
val postgresJdbcLatest = Latest.Release.postgresJdbc.version
val antlr4Latest = Latest.Release.antlr4.version

val springCloudSnapshot = Latest.Snapshot.springCloud.version
val springCloudCircuitbreakerSnapshot = Latest.Snapshot.springCloudCircuitbreaker.version
val springSleuthSnapshot = Latest.Snapshot.springSleuth.version
val springCloudContractSnapshot = Latest.Snapshot.springCloudContract.version

val micronautPlugin = Latest.Plugin.micronautPlugin.version
val kotlinPlugin = Latest.Plugin.kotlin.version
val dependencyManagementPlugin = Latest.Plugin.dependencyManagement.version
val springCloudContractPlugin = Latest.Plugin.springCloudContract.version
val propdepsPlugin = Latest.Plugin.propdeps.version
val cfGradlePlugin = Latest.Plugin.cfGradle.version
val dockerPlugin = Latest.Plugin.docker.version
val artifactoryPlugin = Latest.Plugin.artifactory.version
val jenkinsPlugin = Latest.Plugin.jenkins.version
val gitPropertiesPlugin = Latest.Plugin.gitProperties.version
val jibPlugin = Latest.Plugin.jib.version

val groovyAllGroovy = Latest.Groovy.groovyAll.version
val spockGroovy = Latest.Groovy.spock.version
