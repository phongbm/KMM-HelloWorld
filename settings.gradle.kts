pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "HelloWorld"

include(":androidApp")
include(":iosApp")
include(":shared")