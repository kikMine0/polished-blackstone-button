package kik.polishedBlackstoneButton;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class polished implements CommandExecutor {
    private final Plugin plugin;

    public polished(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        ItemStack polishedblackstonebutton = new ItemStack(Material.POLISHED_BLACKSTONE_BUTTON);
        // praticamente o si givva un fottio a qualcuno o si givva a tutti
        if (args.length == 0){
            Bukkit.getServer().sendPlainMessage(sender.getName()+"vi da polished blackstone button");
            for (Player polishedblackstonebuttoner : Bukkit.getOnlinePlayers()){
                polishedblackstonebutton.give()
            }
        }



        return true;
    }
}
