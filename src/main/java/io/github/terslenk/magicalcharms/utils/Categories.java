package io.github.terslenk.magicalcharms.utils;


import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;

import static io.github.terslenk.magicalcharms.MagicalCharms.MM;

@UtilityClass
public class Categories {

    public static final ItemGroup CHARMS = new SubGroup(
            "mc_charms",
            new CustomItemStack(Head.CHARMS.getAsItem(),
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#14003c:#5101e7>≫Charms</gradient>")))
    );

    public static final ItemGroup MISC = new SubGroup(
            "mc_misc",
            new CustomItemStack(Material.BARRIER,
            "UNFINISHED CATEGORY")
    );

    public static final ItemGroup MACHINES = new SubGroup(
            "mc_machines",
            new CustomItemStack(Material.BARRIER,
            "UNFINISHED CATEGORY")
    );

    public static final ItemGroup MAIN = new MultiGroup(
            "MagicalCharms",
            new CustomItemStack(Head.MAIN.getAsItem(),
            BukkitComponentSerializer.legacy().serialize(MM.parse("<gradient:#14003c:#5101e7>Magical Charms</gradient>"))),
            CHARMS,MISC,MACHINES
    );

}
