package io.github.terslenk.magicalcharms;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.terslenk.magicalcharms.utils.Setup;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.markdown.DiscordFlavor;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;

public class MagicalCharms extends AbstractAddon implements SlimefunAddon {
    private static MagicalCharms i;

    public static final MiniMessage MM = MiniMessage.builder()
            .removeDefaultTransformations()
            .transformation(TransformationType.COLOR)
            .transformation(TransformationType.DECORATION)
            .transformation(TransformationType.GRADIENT)
            .markdown()
            .markdownFlavor(DiscordFlavor.get())
            .build();

    public MagicalCharms() {
        super("TerslenK","MagicalCharms","master","options.auto-update");
    }

    @Override
    protected void enable() {
        getLogger().info("⎯⎯⎯⎯⎯⎯⎯⎯Magical Charms⎯⎯⎯⎯⎯⎯⎯⎯");
        getLogger().info("Version: v" + getPluginVersion());
        getLogger().info("⎯⎯⎯⎯⎯⎯⎯⎯⎯Information⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        getLogger().info("  An Addon Created by TerslenK");
        getLogger().info("This addon code is heavily inspired");
        getLogger().info("from SlimefunWarfare,AlchemiaVitae");
        getLogger().info("and HotbarPets.");
        getLogger().info("⎯⎯⎯⎯Issue Information Link⎯⎯⎯⎯");
        getLogger().info(getBugTrackerURL());

        i = this;
        Setup.setupCategories(this);
        Setup.setupCharms(this);
    }

    @Override
    protected void disable() {
        i = null;
    }

    public static MagicalCharms i() {
        return i;
    }
}


