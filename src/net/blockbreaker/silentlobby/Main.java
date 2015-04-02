package net.blockbreaker.silentlobby;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Janne on 31.03.2015.
 */

public class Main extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        System.out.println("Silent Lobby aktiviert!");
        new Events(this);
    }

    @Override
    public void onDisable() {
        System.out.println("Silent Lobby deaktiviert!");
    }
}
