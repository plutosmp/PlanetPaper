pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PlanetPaper"
include("PlanetPaper-API", "PlanetPaper-Server")