package me.lucasaraujo.joinandleave;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.player.PlayerEvent;

import java.util.Set;

public class PreventBreakingBlocks implements Listener {
    @EventHandler
    public void PreventBlocks(BlockBreakEvent e) {
        Player player = e.getPlayer();
        Block block = e.getBlock();

        if(e.getPlayer().getTargetBlock((Set<Material>) null, 4).getType() != Material.AIR){
            e.setCancelled(true);
            player.sendMessage(ChatColor.WHITE + "" + ChatColor.BOLD + "In this server" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + ", not is permited break blocks");
        }else if (e.getPlayer().getTargetBlock((Set<Material>) null, 4).getType() == Material.AIR) {
            e.setCancelled(false);
        }
    }
}
