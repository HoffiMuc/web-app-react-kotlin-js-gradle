val artifactName by extra { project.name.toLowerCase() }
val archivesBaseName by extra { project.name.toLowerCase() }
val repo by extra("git@gitlab.com:hoffi_minimal/minimal_purejava.git")
val repoHttps by extra("https://gitlab.com/hoffi_minimal/minimal_purejava.git")

// override on commandline by $ ./gradlew -Penv=yourenvname
val env by extra {
    try { project.property("env") }
    catch(ex: groovy.lang.MissingPropertyException) { "default" }
}
