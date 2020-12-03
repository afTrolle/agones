plugins {
    kotlin("jvm") version "1.4.10" apply false
    id("com.google.protobuf") version "0.8.13" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}

