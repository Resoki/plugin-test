package resoki.tut;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Le plugin demarre");

    }

    @Override
    public void onDisable() {
        getLogger().info("Le plugin est eteint");

    }
}
