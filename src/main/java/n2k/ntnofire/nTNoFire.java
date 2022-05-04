package n2k.ntnofire;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
public final class nTNoFire extends JavaPlugin implements Listener {
    @Override public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler void onBlockBurn(@NotNull BlockBurnEvent EVENT) {
                EVENT.setCancelled(true);
            }
            @EventHandler void onFirePlace(@NotNull BlockPlaceEvent EVENT) {
                if(EVENT.getBlockPlaced().getType() == Material.FIRE) EVENT.setCancelled(true);
            }
        }, this);
    }
}
