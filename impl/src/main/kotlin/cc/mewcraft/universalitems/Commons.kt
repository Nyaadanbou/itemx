package cc.mewcraft.universalitems

import org.bukkit.Bukkit

internal fun hasPlugin(name: String): Boolean =
    Bukkit.getPluginManager().getPlugin(name) != null