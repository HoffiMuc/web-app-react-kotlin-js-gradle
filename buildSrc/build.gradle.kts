plugins {
    `kotlin-dsl`
}

repositories {
    mavenLocal()
    jcenter()
}

dependencies {
    implementation("org.yaml:snakeyaml:1.27") // https://bitbucket.org/asomov/snakeyaml/wiki/Documentation
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { kotlinOptions { jvmTarget = "11" } }
}

gradle.afterProject { if (state.failure != null) println("Evaluation of $project FAILED") else println("Evaluation of $project succeeded") }
gradle.taskGraph.beforeTask { doFirst { if(!this.state.noSource || this.state.upToDate) { print(">executing ... ") } } }
gradle.taskGraph.afterTask { if(!this.state.skipped) { println("ready<") } }
