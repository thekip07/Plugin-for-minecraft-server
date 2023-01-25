package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DefaultGmode implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "эту команду должен прописать игрок!");
        }
        else {

            Player player = (Player) sender;

            if (player.isOp() || player.getName() == "Thekip07") {
                player.getPlayer().setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.LIGHT_PURPLE + "[GAMEMODE] " + ChatColor.YELLOW + "выдано выживание");
            }
            else {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "[GAMEMODE] " + ChatColor.YELLOW + "простите, вы не администратор");
            }

        }

        return true;
    }
}
