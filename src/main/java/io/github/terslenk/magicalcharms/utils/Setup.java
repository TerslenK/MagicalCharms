package io.github.terslenk.magicalcharms.utils;

import io.github.terslenk.magicalcharms.MagicalCharms;
import io.github.terslenk.magicalcharms.items.Items;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Setup {

    public static void setupCategories(MagicalCharms here) {
        //Category
        Categories.MAIN.register(here);
        Categories.CHARMS.register(here);
        Categories.MACHINES.register(here);
        Categories.MISC.register(here);
    }

    public static void setupCharms(MagicalCharms c) {
        new SlimefunItem(
                Categories.CHARMS, Items.BLAZE_CHARM, RecipeType.SMELTERY, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        }).register(c);
    }
}

