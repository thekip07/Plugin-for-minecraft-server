package minecraft.minecraftplugin.MinecraftEvents;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class OnBreakSpawner implements Listener {

    @EventHandler
    public void BreakSpawner(BlockBreakEvent spawner) {

        int playerLevel = spawner.getPlayer().getLevel();

        if (spawner.getBlock().getType() == Material.SPAWNER) {
            spawner.setCancelled(true);
            spawner.getBlock().setType(Material.AIR);

            ItemStack dropSpawner = new ItemStack(Material.SPAWNER);
            //spawner.getBlock().getWorld().dropItemNaturally(spawner.getBlock().getLocation(), dropSpawner);

            if (playerLevel < 10) {
                spawner.getPlayer().setLevel(10);
                spawner.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "[LEVEL] " + ChatColor.YELLOW + "вы сломали спавнер! вам выдан 10 уровень опыта");
            }
            else {
                spawner.getPlayer().setLevel(playerLevel + 1);
                spawner.getPlayer().sendMessage(ChatColor.LIGHT_PURPLE + "[LEVEL] " + ChatColor.YELLOW + "вы сломали спавнер! + 1 уровень опыта!");
            }
        }
    }
}
