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
            .texOffs(0, 32).addBox(-7.25F, -6.5F, -2.5F, 3.0F, 5.0F, 5.0F)
            .texOffs(16, 32).addBox(-6.75F, -7.0F, -2.0F, 2.5F, 0.5F, 4.0F)
            .texOffs(16, 38).addBox(-6.75F, -1.5F, -2.0F, 2.5F, 0.5F, 4.0F)
            .texOffs(32, 32).addBox(-8.25F, -5.75F, -1.75F, 1.0F, 3.5F, 3.5F)
            .texOffs(42, 32).addBox(-9.0F, -5.0F, -1.0F, 0.75F, 2.0F, 2.0F), PartPose.ZERO);

        return LayerDefinition.create(mesh, 64, 64);
    }
}
