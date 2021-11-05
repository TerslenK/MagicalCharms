package io.github.terslenk.magicalcharms.utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public enum Head {
    //Categories
    CHARMS("5e809128a0e5a44c2e39532e6bbc68252cb8c9d5ecd246e5965077c147c795e7"),
    MAIN("3b6db980a52496097dfa8d57dfb99d8b120119c71138358a4da29bef06a1d6c1"),
    //Charms
    BLAZE_CHARM("64b1b9ce2e9a6ce8a985d39776e2908077b82e6a333d2a81a441438eab39f8e1");

    private final String hash;

    Head(@Nonnull String hash) {
        this.hash = hash;
    }

    @Nonnull
    public String getHash() {
        return hash;
    }

    @Nonnull
    @Override
    public String toString() {
        return this.hash;
    }

    @Nonnull
    public ItemStack getAsItem() {
        return PlayerHead.getItemStack(PlayerSkin.fromHashCode(getHash()));
    }
}
