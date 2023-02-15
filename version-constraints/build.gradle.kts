plugins {
    `java-platform`
}

group = "org.gradle.sample"

dependencies {
    constraints {
        api("org.gradle.sample:a:1.0.0")
        api("org.gradle.sample:b:1.0.0")
    }
}
