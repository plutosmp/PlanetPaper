pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PlantPaper"
include("PlanetPaper-API", "PlanetPaper-Server")