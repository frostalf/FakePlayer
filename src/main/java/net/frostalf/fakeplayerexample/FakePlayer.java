/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.frostalf.fakeplayerexample;

import java.util.logging.Level;
import net.minecraft.server.v1_8_R2.EntityPlayer;
import org.bukkit.craftbukkit.v1_8_R2.CraftServer;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftPlayer;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author Frostalf
 */
public class FakePlayer extends JavaPlugin {

    private static FakePlayer instance;
    private CraftPlayer player;

    @Override
    public void onEnable() {
        instance = this;
        player = new FakeCraftPlayer((CraftServer) getServer(), (EntityPlayer) getServer().getPlayer("frostalf"));
        getServer().getLogger().log(Level.INFO, "Fake Player: {0} is at {1}", new Object[]{player.getName(), player.getLocation().toString()});
    }

    public static FakePlayer getInstance() {
        return instance;
    }
}
