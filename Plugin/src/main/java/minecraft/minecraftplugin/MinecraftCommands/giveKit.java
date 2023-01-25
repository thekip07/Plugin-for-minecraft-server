package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class giveKit implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "комманду должен прописать игрок!");
        }
        else {
            ItemStack sword = new ItemStack(Material.STONE_SWORD);
            ItemStack food = new ItemStack(Material.APPLE, 15);
            ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
            ItemStack Ch = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
            ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
            ItemStack leg = new ItemStack(Material.LEATHER_LEGGINGS);

            Player player = (Player) sender;

            player.getInventory().addItem(sword);
            player.getInventory().addItem(helmet);
            player.getInventory().addItem(Ch);
            player.getInventory().addItem(leg);
            player.getInventory().addItem(boots);
            player.getInventory().addItem(food);

            player.sendMessage(ChatColor.LIGHT_PURPLE + "[KIT] " + ChatColor.YELLOW + "выдан кит!");
        }
        return true;
    }
}
