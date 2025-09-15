package fr.rudy.crons;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private ScheduledTaskManager scheduler;

    @Override
    public void onEnable() {
        saveDefaultConfig(); // Crée config.yml s'il n'existe pas
        scheduler = new ScheduledTaskManager(this);
        scheduler.start();
        getLogger().info("✅ Plugin Crons chargé !");
    }

    @Override
    public void onDisable() {
        getLogger().info("🛑 Plugin Crons désactivé.");
    }
}
