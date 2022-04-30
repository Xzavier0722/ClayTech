package cn.claycoffee.ClayTech.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.common.CommonPatterns;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class HeadTexture {
    private final String texture;
    private final UUID uuid;

    private HeadTexture(String texture) {
        Validate.notNull(texture, "Texture cannot be null");
        Validate.isTrue(CommonPatterns.HEXADECIMAL.matcher(texture).matches(), "Textures must be in hexadecimal.");
        if (texture.length() != 64) {
            this.texture = texture.substring(texture.length() - 64);
        } else {
            this.texture = texture;
        }

        this.uuid = UUID.nameUUIDFromBytes(texture.getBytes(StandardCharsets.UTF_8));
    }
    
    public String getTexture() {
        return this.texture;
    }
    
    public UUID getUniqueId() {
        return this.uuid;
    }

    public ItemStack getAsItemStack() {
        return SlimefunUtils.getCustomHead(this.getTexture());
    }


    public PlayerSkin getAsSkin() {
        return PlayerSkin.fromHashCode(this.texture);
    }
}
