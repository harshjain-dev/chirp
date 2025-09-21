plugins {
    id("chirp.spring-boot-app")
}

group = "com.harshdev"
version = "0.0.1-SNAPSHOT"

dependencies {

    implementation(projects.chat)
    implementation(projects.user)
    implementation(projects.notification)
    implementation(projects.common)

    implementation(libs.spring.boot.starter.data.jpa)
    implementation(libs.postgresql)
}