package minecraft.minecraftplugin;

import minecraft.minecraftplugin.MinecraftCommands.*;
import minecraft.minecraftplugin.MinecraftEvents.OnBreakBedrock;
import minecraft.minecraftplugin.MinecraftEvents.OnBreakSpawner;
import minecraft.minecraftplugin.MinecraftEvents.OnPlayerJoin;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftPlugin extends JavaPlugin {

    public FileConfiguration config = getConfig();

    @Override
    public void onEnable() {

        getServer().getLogger().info("плагин запущен");
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnBreakBedrock(), this);
        getServer().getPluginManager().registerEvents(new OnBreakSpawner(), this);

        getServer().getPluginCommand("discord").setExecutor(new GetDiscord());
        getServer().getPluginCommand("1").setExecutor(new Gmode());
        getServer().getPluginCommand("0").setExecutor(new DefaultGmode());
        getServer().getPluginCommand("feed").setExecutor(new FeedPlayer());
        getServer().getPluginCommand("fly").setExecutor(new FlyingCommand());
        getServer().getPluginCommand("info").setExecutor(new GetInfo());
        getServer().getPluginCommand("adminStick").setExecutor(new AdminStick());
        getServer().getPluginCommand("kit").setExecutor(new giveKit());
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("плагин выключен");
    }
}
