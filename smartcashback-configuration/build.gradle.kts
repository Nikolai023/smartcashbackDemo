plugins {
    id("org.springframework.boot") version "2.1.6.RELEASE"
}

dependencies {
    implementation(project(":smartcashback-other"))
    api("org.springframework.boot:spring-boot-starter-security")
    testCompile("junit:junit:4.12")
}