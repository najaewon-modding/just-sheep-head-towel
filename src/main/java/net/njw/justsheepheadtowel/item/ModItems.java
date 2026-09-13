package net.njw.justsheepheadtowel.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.njw.justsheepheadtowel.JustSheepHeadTowel;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JustSheepHeadTowel.MODID);
    public static final DeferredItem<Item> SHEEP_HEAD_TOWEL = ITEMS.registerSimpleItem("sheep_head_towel", properties -> properties.stacksTo(1).equippable(EquipmentSlot.HEAD));

    private ModItems() {
    }
}
