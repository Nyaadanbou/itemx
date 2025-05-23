import net.minecrell.pluginyml.paper.PaperPluginDescription

plugins {
    id("neko.repositories") version "1.0"
    id("cc.mewcraft.deploy-conventions")
    alias(libs.plugins.pluginyml.paper)
}

group = "cc.mewcraft.universalitems"
version = "1.0.0"
description = "Centralize the code related to custom plugin items."

project.ext.set("name", "UniversalItems")

dependencies {
    // Server API
    compileOnly(libs.server.paper)

    // Modules to pack in
    implementation(project(":api"))
    implementation(project(":impl"))
}

paper {
    main = "cc.mewcraft.spatula.item.SpatulaItemsPlugin"
    name = project.ext.get("name") as String
    version = "${project.version}"
    description = project.description
    apiVersion = "1.19"
    authors = listOf("Nailm")
    serverDependencies {
        register("helper") {
            required = true
            joinClasspath = true
            load = PaperPluginDescription.RelativeLoadOrder.BEFORE
        }
//        register("Brewery") {
//            required = false
//            joinClasspath = true
//            load = PaperPluginDescription.RelativeLoadOrder.OMIT
//        }
//        register("InteractiveBooks") {
//            required = false
//            joinClasspath = true
//            load = PaperPluginDescription.RelativeLoadOrder.OMIT
//        }
//        register("ItemsAdder") {
//            required = false
//            joinClasspath = true
//            load = PaperPluginDescription.RelativeLoadOrder.OMIT
//        }
//        register("MMOItems") {
//            required = false
//            joinClasspath = true
//            load = PaperPluginDescription.RelativeLoadOrder.OMIT
//        }
    }
}
