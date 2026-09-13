package net.njw.justsheepheadtowel;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(JustSheepHeadTowel.MODID)
public class JustSheepHeadTowel {
    public static final String MODID = "njw_just_sheep_head_towel";
    public static final Logger LOGGER = LogUtils.getLogger();

    public JustSheepHeadTowel(IEventBus modEventBus, ModContainer modContainer) {
    }
}
