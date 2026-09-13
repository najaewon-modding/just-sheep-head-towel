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

        root.addOrReplaceChild("towel", CubeListBuilder.create()
            .texOffs(0, 0).addBox(-4.25F, -8.25F, -4.25F, 8.5F, 0.5F, 8.5F)
            .texOffs(0, 16).addBox(-4.25F, -7.75F, 3.75F, 8.5F, 6.0F, 0.5F)
            .texOffs(24, 16).addBox(-4.25F, -7.75F, -3.75F, 0.5F, 6.0F, 7.5F)
            .texOffs(24, 22).addBox(3.75F, -7.75F, -3.75F, 0.5F, 6.0F, 7.5F)
            .texOffs(0, 24).addBox(-4.25F, -7.75F, -4.25F, 8.5F, 1.75F, 0.5F), PartPose.ZERO);

        root.addOrReplaceChild("left_shell", CubeListBuilder.create()
            .texOffs(0, 32).addBox(-1.9F, -2.0F, -2.0F, 1.9F, 4.0F, 4.0F)
            .texOffs(16, 32).addBox(-2.7F, -1.5F, -1.5F, 0.8F, 3.0F, 3.0F)
            .texOffs(24, 32).addBox(-3.1F, -1.0F, -1.0F, 0.4F, 2.0F, 2.0F), PartPose.offsetAndRotation(-4.05F, -4.0F, 0.0F, 0.0F, 0.0F, -0.08F));

        root.addOrReplaceChild("right_shell", CubeListBuilder.create()
            .texOffs(0, 44).addBox(0.0F, -2.0F, -2.0F, 1.9F, 4.0F, 4.0F)
            .texOffs(16, 44).addBox(1.9F, -1.5F, -1.5F, 0.8F, 3.0F, 3.0F)
            .texOffs(24, 44).addBox(2.7F, -1.0F, -1.0F, 0.4F, 2.0F, 2.0F), PartPose.offsetAndRotation(4.05F, -4.0F, 0.0F, 0.0F, 0.0F, 0.08F));

        return LayerDefinition.create(mesh, 64, 64);
    }
}
