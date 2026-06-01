package kik.polishedBlackstoneButton;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.List;

public class polished implements CommandExecutor {
    private final Plugin plugin;
    int quantita;
    public polished(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        ItemStack polishedblackstonebutton = new ItemStack(Material.POLISHED_BLACKSTONE_BUTTON);

        polishedblackstonebutton.setAmount(1);
        // praticamente o si givva un fottio a qualcuno o si givva a tutti

        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "FACK U");
            return true;


        } else if (args.length == 1) {
            String arg = args[0];
            if (arg.equalsIgnoreCase("tutti")) {
                Bukkit.getServer().sendPlainMessage(sender.getName() + "vi da polished blackstone button");
                for (Player polishedblackstonebuttoner : Bukkit.getOnlinePlayers()) {
                    polishedblackstonebuttoner.give(polishedblackstonebutton);
                }
            } else {
                    Player poraccio = Bukkit.getPlayer(arg);
                    if (poraccio == null){sender.sendMessage(ChatColor.RED + "FACK U, METTI CIAO IUSER RIAL"); return true;}

                    Bukkit.getServer().sendPlainMessage(sender.getName() + " ha dato 1 polished blackstone button a "+poraccio.getName());
                    poraccio.give(polishedblackstonebutton);


            }

            return true;
        } else if (args.length == 2) {
            String arg = args[0];

            try{
                quantita = Integer.parseInt(args[1]);
            }catch (Exception e){
                sender.sendMessage(ChatColor.RED+"Hey! chitamortasci tua metti stocazzo di numero! \n"+e.getMessage());
            }
            polishedblackstonebutton.setAmount(quantita);
            if (arg.equalsIgnoreCase("tutti")){
                Bukkit.getServer().sendPlainMessage(sender.getName() + "vi da "+ChatColor.GOLD+quantita+ChatColor.RESET+" polished blackstone button");
                for (Player polishedblackstonebuttoner : Bukkit.getOnlinePlayers()) {
                    polishedblackstonebuttoner.give(polishedblackstonebutton);
                }
                return true;
            }else{

                    Player poraccio = Bukkit.getPlayer(arg);
                if (poraccio == null){sender.sendMessage(ChatColor.RED + "FACK U, METTI CIAO IUSER RIAL"); return true;}
                    Bukkit.getServer().sendPlainMessage(sender.getName() + " ha dato "+ChatColor.GOLD+quantita+ChatColor.RESET+" polished blackstone button a "+poraccio.getName());
                    poraccio.give(polishedblackstonebutton);


            }
        }


        return true;
    }
}