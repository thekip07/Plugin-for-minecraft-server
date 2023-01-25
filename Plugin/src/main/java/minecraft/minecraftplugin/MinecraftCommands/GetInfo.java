package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class GetInfo implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        sender.sendMessage(
                ChatColor.LIGHT_PURPLE + "                    [--INFO--]\n" + " \n"
                + ChatColor.YELLOW +
                        "привет, ты попал на сервер для выживания!\n" +
                        "тут нету особенных плагинов которые портят\n" +
                        "все ванильное выживание. Только хардкор!\n" +
                        ChatColor.RED + " \n" +
                        "разработчик плагина/сервера: (Thekip07)\n" +
                        " \n" + ChatColor.GREEN +
                        "discord: https://discord.gg/bE76eCcYtE\n" +
                        "omlet: https://omlet.gg/profile/thekip07"
        );

        return true;
    }
}
