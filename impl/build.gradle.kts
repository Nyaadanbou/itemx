plugins {
    id("neko.repositories") version "1.0"
}

dependencies {
    // Module
    compileOnly(project(":api"))

    // Server API
    compileOnly(libs.server.paper)

    // Plugins that provide the custom item feature
//    compileOnly(project(":ibooks")) { isTransitive = false }
//    compileOnly(libs.itemsadder) { isTransitive = false }
//    compileOnly(libs.mythiclib) { isTransitive = false }
//    compileOnly(libs.mmoitems) { isTransitive = false }
//    compileOnly(libs.brewery) { isTransitive = false }
}