package n2k.ntnofire;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
public final class nTNoFire extends JavaPlugin implements Listener {
    @Override public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler void onFire(@NotNull BlockBurnEvent EVENT) {
                EVENT.setCancelled(true);
            }
        }, this);
    }
}
