package minecraft.minecraftplugin.MinecraftCommands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class AdminStick implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "комманду должен прописать игрок!");
        }
        else {
            if (sender.isOp() || sender.getName() == "Thekip07") {
                ItemStack adminStick = new ItemStack(Material.STICK);
                ItemMeta adminStickMeta = adminStick.getItemMeta();

                adminStickMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "палочка админа");
                adminStickMeta.addEnchant(Enchantment.KNOCKBACK, 50, true);
                adminStickMeta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
                adminStick.setItemMeta(adminStickMeta);

                ((Player) sender).getInventory().addItem(adminStick);
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "[STICK] " + ChatColor.YELLOW + "от всего сердца вручаю палочку админа");
            }
            else {
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "[STICK] " + ChatColor.YELLOW + "простите, вы не администратор");
            }
        }
        return true;
    }
}
