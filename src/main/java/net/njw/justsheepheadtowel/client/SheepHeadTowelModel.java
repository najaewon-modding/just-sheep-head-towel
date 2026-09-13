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

        root.addOrReplaceChild("top_towel", CubeListBuilder.create()
            .texOffs(0, 0).addBox(-4.35F, -8.65F, -4.35F, 8.7F, 2.1F, 8.7F), PartPose.ZERO);

        root.addOrReplaceChild("left_wrap", CubeListBuilder.create()
            .texOffs(0, 18).addBox(-1.25F, 0.0F, -4.1F, 2.5F, 4.2F, 8.2F), PartPose.offsetAndRotation(-4.0F, -6.85F, 0.0F, 0.0F, 0.0F, 0.52F));

        root.addOrReplaceChild("right_wrap", CubeListBuilder.create()
            .texOffs(22, 18).addBox(-1.25F, 0.0F, -4.1F, 2.5F, 4.2F, 8.2F), PartPose.offsetAndRotation(4.0F, -6.85F, 0.0F, 0.0F, 0.0F, -0.52F));

        root.addOrReplaceChild("left_shell", CubeListBuilder.create()
            .texOffs(0, 34).addBox(-2.0F, -2.25F, -2.25F, 4.0F, 4.5F, 4.5F)
            .texOffs(18, 34).addBox(-3.15F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F)
            .texOffs(28, 34).addBox(-3.9F, -1.15F, -1.15F, 1.0F, 2.3F, 2.3F), PartPose.offsetAndRotation(-6.55F, -3.75F, 0.0F, 0.0F, 0.0F, -0.08F));

        root.addOrReplaceChild("right_shell", CubeListBuilder.create()
            .texOffs(0, 47).addBox(-2.0F, -2.25F, -2.25F, 4.0F, 4.5F, 4.5F)
            .texOffs(18, 47).addBox(1.65F, -1.75F, -1.75F, 1.5F, 3.5F, 3.5F)
            .texOffs(28, 47).addBox(2.9F, -1.15F, -1.15F, 1.0F, 2.3F, 2.3F), PartPose.offsetAndRotation(6.55F, -3.75F, 0.0F, 0.0F, 0.0F, 0.08F));

        return LayerDefinition.create(mesh, 64, 64);
    }
}
