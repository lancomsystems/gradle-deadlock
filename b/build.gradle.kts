plugins {
    java
}

group = "org.gradle.sample"

dependencies {
    implementation(platform("org.gradle.sample:version-constraints"))
}
