package minecraft.minecraftplugin.MinecraftEvents;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    @EventHandler
    public void OnJoin(PlayerJoinEvent player) {

        if (player.getPlayer().getName() == "Thekip07") {
            player.setJoinMessage(ChatColor.RED + "[THEKIP] " + ChatColor.YELLOW + "хост Thekip07 зашел на сервер!");
            player.getPlayer().sendMessage(ChatColor.GREEN + "добро пожаловать!");
        }
        else if (player.getPlayer().isOp()) {
            player.setJoinMessage(
                    ChatColor.RED + "[ADMINISTRATOR] " + ChatColor.YELLOW + "администратор " + player.getPlayer().getName() + " зашел на сервер!"
            );
            player.getPlayer().sendMessage(ChatColor.GREEN + "добро пожаловать!");
        }
        else {
            player.getPlayer().sendMessage(ChatColor.RED + "[" + player.getPlayer().getName() + "]" + ChatColor.YELLOW + " добро пожаловать!");
        }
    }
}
