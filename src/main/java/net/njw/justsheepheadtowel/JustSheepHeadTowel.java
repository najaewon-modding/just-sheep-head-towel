package net.njw.justsheepheadtowel;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.njw.justsheepheadtowel.client.ClientEvents;
import net.njw.justsheepheadtowel.item.ModItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(JustSheepHeadTowel.MODID)
public class JustSheepHeadTowel {
    public static final String MODID = "njw_just_sheep_head_towel";
    public static final Logger LOGGER = LogUtils.getLogger();

    public JustSheepHeadTowel(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.ITEMS.register(modEventBus);
        if (FMLEnvironment.getDist() == Dist.CLIENT) {
            modEventBus.addListener(ClientEvents::registerLayerDefinitions);
            modEventBus.addListener(ClientEvents::addPlayerLayers);
        }
    }
}
