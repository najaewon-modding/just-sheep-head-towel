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
            .texOffs(0, 0).addBox(-4.5F, -8.75F, -4.5F, 9.0F, 2.0F, 9.0F)
            .texOffs(0, 16).addBox(-4.5F, -6.75F, 2.75F, 9.0F, 3.0F, 1.75F)
            .texOffs(24, 16).addBox(-4.5F, -6.75F, -4.5F, 1.0F, 3.0F, 7.25F)
            .texOffs(24, 22).addBox(3.5F, -6.75F, -4.5F, 1.0F, 3.0F, 7.25F), PartPose.ZERO);

        root.addOrReplaceChild("left_shell", CubeListBuilder.create()
            .texOffs(0, 32).addBox(-7.25F, -6.75F, -2.0F, 3.0F, 4.0F, 4.0F)
            .texOffs(16, 32).addBox(-8.0F, -6.25F, -1.5F, 1.0F, 3.0F, 3.0F)
            .texOffs(24, 32).addBox(-8.35F, -5.75F, -1.0F, 0.5F, 2.0F, 2.0F), PartPose.ZERO);

        root.addOrReplaceChild("right_shell", CubeListBuilder.create()
            .texOffs(0, 44).addBox(4.25F, -6.75F, -2.0F, 3.0F, 4.0F, 4.0F)
            .texOffs(16, 44).addBox(7.0F, -6.25F, -1.5F, 1.0F, 3.0F, 3.0F)
            .texOffs(24, 44).addBox(7.85F, -5.75F, -1.0F, 0.5F, 2.0F, 2.0F), PartPose.ZERO);

        return LayerDefinition.create(mesh, 64, 64);
    }
}
