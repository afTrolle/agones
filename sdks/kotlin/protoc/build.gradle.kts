import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

plugins {
    kotlin("jvm")
    id("com.google.protobuf")
}

dependencies {
    implementation(Dependency.jdk)
    implementation(Dependency.coroutines)
    implementation(Dependency.javaxAnnotationApi)

    api(Dependency.protobufJavaLite)
    api(Dependency.grpcKotlinStubLite)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
}

sourceSets {
    val main by getting {
        java {
            srcDirs(
                listOf(
                    "./build/generated/source/proto/main/grpc",
                    "./build/generated/source/proto/main/grpckt",
                    "./build/generated/source/proto/main/java"
                )
            )
        }

        // TODO set sources from env
        resources.srcDirs("src/main/proto")
    }
}

protobuf {
    protoc {
        artifact = Dependency.protoc
    }
    plugins {
        id("grpc") {
            artifact = Dependency.protocGenGrpcJava
        }
        id("grpckt") {
            artifact = Dependency.protocGenGrpcKotlin
        }
    }
    generateProtoTasks {
        all().forEach {
            it.builtins {
                named("java") { option("lite") }
            }
            it.plugins {
                id("grpc") { option("lite") }
                id("grpckt") { option("lite") }
            }
        }
    }
}