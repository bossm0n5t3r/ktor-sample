val ktorVersion: String by project
val kotlinVersion: String by project
val logbackVersion: String by project

plugins {
    application
    kotlin("jvm") version "1.6.10"
    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"
}

group = "com.example"

version = "0.0.1"

application { mainClass.set("com.example.ApplicationKt") }

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("io.ktor:ktor-serialization:$ktorVersion")
    testImplementation("io.ktor:ktor-server-tests:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}
