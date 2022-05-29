package me.lucasaraujo.joinandleave;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinAndLeave extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        getServer().getPluginManager().registerEvents(new PreventBreakingBlocks(), this);
    }
}
