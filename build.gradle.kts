plugins {
    kotlin("jvm") version "1.6.20"
    java
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
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // Spigot API
    compileOnly("org.spigotmc:spigot-api:1.18.2-R0.1-SNAPSHOT")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}