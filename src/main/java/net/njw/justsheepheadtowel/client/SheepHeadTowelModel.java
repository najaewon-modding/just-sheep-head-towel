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
            .texOffs(0, 0).addBox(-4.375F, -8.5F, -4.375F, 8.75F, 2.5F, 8.75F)
            .texOffs(0, 18).addBox(-4.375F, -6.0F, 2.375F, 8.75F, 2.0F, 2.0F)
            .texOffs(24, 18).addBox(-4.375F, -6.0F, -2.375F, 2.0F, 2.0F, 4.75F)
            .texOffs(24, 24).addBox(2.375F, -6.0F, -2.375F, 2.0F, 2.0F, 4.75F), PartPose.ZERO);

        root.addOrReplaceChild("left_shell", CubeListBuilder.create()
            .texOffs(0, 32).addBox(-2.75F, -2.25F, -2.25F, 2.75F, 4.5F, 4.5F)
            .texOffs(16, 32).addBox(-4.0F, -1.75F, -1.75F, 1.25F, 3.5F, 3.5F)
            .texOffs(24, 32).addBox(-4.75F, -1.25F, -1.25F, 0.75F, 2.5F, 2.5F), PartPose.offsetAndRotation(-4.0F, -4.25F, 0.0F, 0.0F, 0.0F, -0.08F));

        root.addOrReplaceChild("right_shell", CubeListBuilder.create()
            .texOffs(0, 44).addBox(0.0F, -2.25F, -2.25F, 2.75F, 4.5F, 4.5F)
            .texOffs(16, 44).addBox(2.75F, -1.75F, -1.75F, 1.25F, 3.5F, 3.5F)
            .texOffs(24, 44).addBox(4.0F, -1.25F, -1.25F, 0.75F, 2.5F, 2.5F), PartPose.offsetAndRotation(4.0F, -4.25F, 0.0F, 0.0F, 0.0F, 0.08F));

        return LayerDefinition.create(mesh, 64, 64);
    }
}
