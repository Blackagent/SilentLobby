package net.blockbreaker.silentlobby;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Janne on 02.04.2015.
 */
public class Events implements Listener{

    private final Main plugin;

    public Events(Main main) {
        this.plugin = main;
        plugin.getServer().getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void playerJoin(PlayerJoinEvent join) {

        Player p = join.getPlayer();

        Bukkit.getOnlinePlayers().forEach(player -> {
            player.hidePlayer(p);
            player.setPlayerListName(null);
            p.hidePlayer(player);
            p.setPlayerListName(null);
        });
    }


    @EventHandler
    public void cancelChat (PlayerChatEvent chat) {
        chat.setCancelled(true);
    }

}
