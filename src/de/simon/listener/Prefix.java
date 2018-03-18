package de.simon.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Prefix implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();


        if(p.hasPermission("system.ower")) {
            p.setDisplayName("§7[§4Owner§7] ► §f" + p.getName());
            p.setPlayerListName("Owner" + p.getName());
        }



    }


}
