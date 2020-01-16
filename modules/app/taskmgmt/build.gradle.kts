plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":modules:domain:tasks"))
    implementation(project(":modules:domain:users"))

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.vavr:vavr-kotlin:0.10.2")

    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}
