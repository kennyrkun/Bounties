package io.github.kennyrkun.bounties;

import org.bukkit.plugin.java.JavaPlugin;

public class Bounties extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("Bounties enabled.");
    }

    @Override
    public void onDisable()
    {

        getLogger().info("Bounties disabled.");
    }
}
