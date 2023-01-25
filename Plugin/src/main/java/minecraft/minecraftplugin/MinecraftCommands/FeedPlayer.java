package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FeedPlayer implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "комманду должен прописать игрок!");
        }
        else {
            Player player = (Player) sender;

            if (player.isOp() || player.getName() == "Thekip07") {
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.LIGHT_PURPLE + "[FEED] " + ChatColor.YELLOW + "голод востановлен!");
            }
            else {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "[FEED] " + ChatColor.YELLOW + "простите, вы не администратор");
            }
        }

        return true;
    }
}
