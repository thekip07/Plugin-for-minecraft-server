package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class GetDiscord implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage(ChatColor.LIGHT_PURPLE + "[DISCORD] " + ChatColor.YELLOW + "https://discord.gg/bE76eCcYtE");
        return true;
    }
}
