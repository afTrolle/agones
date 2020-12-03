object Dependency {

    private const val protobufVersion = "3.13.0"
    private const val grpcKotlinVersion = "0.2.1"
    private const val grpcVersion = "1.32.1"

    const val jdk = "org.jetbrains.kotlin:kotlin-stdlib"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8"

    const val javaxAnnotationApi = "javax.annotation:javax.annotation-api:1.3.2"

    const val protoc = "com.google.protobuf:protoc:$protobufVersion"

    const val protobufJavaLite = "com.google.protobuf:protobuf-javalite:$protobufVersion"
    const val protocGenGrpcJava = "io.grpc:protoc-gen-grpc-java:$grpcVersion"

    const val grpcKotlinStubLite = "io.grpc:grpc-kotlin-stub-lite:$grpcKotlinVersion"
    const val protocGenGrpcKotlin = "io.grpc:protoc-gen-grpc-kotlin:$grpcKotlinVersion:jdk7@jar"
}