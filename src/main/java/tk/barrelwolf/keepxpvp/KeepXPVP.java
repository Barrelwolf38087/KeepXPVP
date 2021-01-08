package tk.barrelwolf.keepxpvp;

import org.bukkit.plugin.java.JavaPlugin;

public class KeepXPVP extends JavaPlugin {

    @Override
    public void onLoad() {
        System.out.println("KeepXPVP loaded");
    }

    @Override
    public void onEnable() {
        System.out.println("KeepXPVP enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("KeepXPVP disabled");
    }
}
