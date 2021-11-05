package io.github.terslenk.magicalcharms.items;

import io.github.terslenk.magicalcharms.utils.Head;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import static io.github.terslenk.magicalcharms.MagicalCharms.MM;

@UtilityClass
public final class Items {
    //Charms
    public static final SlimefunItemStack BLAZE_CHARM = new SlimefunItemStack(
         "MAGICALCHARMS_BLAZE",
         Head.BLAZE_CHARM.getHash(),
         BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#cbc42c:#8e3f02>Blaze Charm</gradient>")),
         "ez bozo"
    );
    static {
        ItemMeta meta = BLAZE_CHARM.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        BLAZE_CHARM.setItemMeta(meta);
        BLAZE_CHARM.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
    }
}
