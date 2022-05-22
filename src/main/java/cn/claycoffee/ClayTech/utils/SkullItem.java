package cn.claycoffee.ClayTech.utils;

import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.inventory.ItemStack;

public class SkullItem {
    public static ItemStack fromURL(String url) {
        return  SlimefunUtils.getCustomHead(url.substring(url.length()-64));
    }
    public static ItemStack fromHash(String url){
        return  SlimefunUtils.getCustomHead(url);
    }
}
