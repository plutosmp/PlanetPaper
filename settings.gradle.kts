pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "planetpaper"
for (name in listOf("PlanetPaper-API", "PlanetPaper-Server")) {
    val projName = name.toLowerCase(java.util.Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}