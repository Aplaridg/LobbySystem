package de.simon.main;

import de.simon.listener.PlayerJoinListener;
import de.simon.listener.Prefix;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static String Prefix = "§7[§bLobbySystem§7]§r ";
    public static String NoPerm = Main.Prefix + "§cDazu hast du keine Rechte!";
    public static String NoCons = "§cDazu musst du ein Spieler sein!";


    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------------------------");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "LobbySystem - By Aplaridg");
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Wurde Aktiviert!");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------------------------");

        regListener();
        regCommands();

    }



    public void regListener() {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new Prefix(), this);


    }

    public void regCommands() {

    }





}
