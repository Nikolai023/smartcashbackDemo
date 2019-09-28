plugins {
    java
}

dependencies {
    api(project(":smartcashback-domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}