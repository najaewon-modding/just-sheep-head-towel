package net.njw.justsheepheadtowel.client;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;

public final class ClientEvents {
    private ClientEvents() {
    }

    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SheepHeadTowelModel.LAYER_LOCATION, SheepHeadTowelModel::createLayer);
    }

    public static void addPlayerLayers(EntityRenderersEvent.AddLayers event) {
        for (var skin : event.getSkins()) {
            var renderer = event.getPlayerRenderer(skin);
            if (renderer != null) {
                renderer.addLayer(new SheepHeadTowelLayer(renderer, event.getEntityModels()));
            }
        }
    }
}
