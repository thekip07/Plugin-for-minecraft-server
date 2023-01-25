package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class FlyingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "комманду должен прописать игрок!");
        }
        else {
            Player player = (Player) sender;

            if (player.isOp() || player.getName() == "Thekip07") {
                boolean flying = player.isFlying();
                player.setAllowFlight(!flying);
                player.setFlying(!flying);

                if (flying == false) {
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + "[FLY] " + ChatColor.YELLOW + "вы летаете");
                } else {
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + "[FLY] " + ChatColor.YELLOW + "полет окончен!");
                }
            }
            else {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "[FLY] " + ChatColor.YELLOW + "простите, вы не администратор");
            }
        }

        return true;
    }
}