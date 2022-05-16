package com.zestarr.main.main;

import com.onarandombox.MultiverseCore.MultiverseCore;
import com.zestarr.main.main.commands.ImaginationCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("-----------------------------------------------------\n\n"
                + "The Imagination Plugin has been enabled!\n\n"
                + "-----------------------------------------------------");
        getCommand("imagination").setExecutor(new ImaginationCommand());



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
