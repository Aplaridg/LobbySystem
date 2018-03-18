package de.simon.listener;

import com.connorlinfoot.titleapi.TitleAPI;
import de.simon.main.Main;
import net.onlykev.CoinsAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        if(p.hasPlayedBefore()) {
            if(p.hasPermission("system.teamjoin")) {
                e.setJoinMessage(Main.Prefix + "§bDas Teammitglied §c" + p.getName() + " §bist auf den Server gejoint!");
                CoinsAPI.coins.addCoins(p.getUniqueId().toString(), 2);
                p.sendMessage(Main.Prefix + "§bDu hast nun §6" + CoinsAPI.coins.getCoins(p.getUniqueId().toString()) + " §bCoins!");
            } else if(p.hasPermission("system.vip")) {
                e.setJoinMessage(Main.Prefix + "§bDer §6Premiumspieler §6" + p.getName() + " §bist auf den Server gejoint!");
                CoinsAPI.coins.addCoins(p.getUniqueId().toString(), 1);
                p.sendMessage(Main.Prefix + "§bDu hast nun §6" + CoinsAPI.coins.getCoins(p.getUniqueId().toString()) + " §bCoins!");
            } else {
                e.setJoinMessage("§7[§a+§7] §7" + p.getName());
            }

        } else {
            TitleAPI.sendTitle(p, 20, 40, 10, "§bWillkommen!");
        }




    }

}
