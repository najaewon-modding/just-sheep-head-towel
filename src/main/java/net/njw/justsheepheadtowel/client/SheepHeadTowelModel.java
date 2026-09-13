package net.njw.justsheepheadtowel.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.Identifier;
import net.njw.justsheepheadtowel.JustSheepHeadTowel;

public final class SheepHeadTowelModel {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(JustSheepHeadTowel.MODID, "sheep_head_towel"), "main");

    private SheepHeadTowelModel() {
    }

    public static LayerDefinition createLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        root.addOrReplaceChild("left_ear", CubeListBuilder.create()
            .texOffs(0, 32).addBox(-2.5F, -1.5F, -2.0F, 2.5F, 3.0F, 4.0F)
            .texOffs(14, 32).addBox(-2.0F, -2.25F, -1.5F, 2.0F, 0.75F, 3.0F)
            .texOffs(14, 36).addBox(-2.0F, 1.5F, -1.5F, 2.0F, 0.75F, 3.0F)
            .texOffs(24, 32).addBox(-3.0F, -1.0F, -1.5F, 0.5F, 2.0F, 3.0F), PartPose.offset(-4.05F, -4.0F, 0.0F));

        return LayerDefinition.create(mesh, 64, 64);
    }
}
