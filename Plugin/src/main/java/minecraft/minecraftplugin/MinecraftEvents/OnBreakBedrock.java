package minecraft.minecraftplugin.MinecraftEvents;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class OnBreakBedrock implements Listener {
    @EventHandler

    public void BreakBedrock(BlockBreakEvent bedrock) {

        if (bedrock.getBlock().getType() == Material.BEDROCK) {
            bedrock.setCancelled(true);
            bedrock.getBlock().setType(Material.BEDROCK);

            bedrock.getPlayer().sendMessage(ChatColor.RED + "[ОШИБКА] " + ChatColor.YELLOW + "вы не можете сломать бедрок!");
        }

    }
}
