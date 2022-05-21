plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("kapt") version "1.6.21"

    id("com.github.johnrengelman.shadow") version "7.1.2"

    java
}

kapt {
    keepJavacAnnotationProcessors = true
}

group = "gg.steve.mc.pv"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    // Spigot api
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")

    // Bungeecord dependencies
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // Spigot API
    compileOnly("org.spigotmc:spigot-api:1.18.1-R0.1-SNAPSHOT")

    // SQL
    runtimeOnly("mysql:mysql-connector-java:8.0.29")

    // Dagger
    implementation("com.google.dagger:dagger:2.42")
    kapt("com.google.dagger:dagger-compiler:2.42")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
