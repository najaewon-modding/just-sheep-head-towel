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

        root.addOrReplaceChild("towel_top", CubeListBuilder.create()
            .texOffs(0, 0).addBox(-4.25F, -8.25F, -4.25F, 8.5F, 1.25F, 8.5F), PartPose.ZERO);

        root.addOrReplaceChild("towel_front", CubeListBuilder.create()
            .texOffs(0, 10).addBox(-4.25F, -7.0F, -4.25F, 8.5F, 1.5F, 1.25F), PartPose.ZERO);

        root.addOrReplaceChild("towel_back", CubeListBuilder.create()
            .texOffs(0, 14).addBox(-4.25F, -7.0F, 3.0F, 8.5F, 4.0F, 1.25F), PartPose.ZERO);

        root.addOrReplaceChild("towel_left", CubeListBuilder.create()
            .texOffs(22, 10).addBox(-4.25F, -7.0F, -3.0F, 1.25F, 4.0F, 6.0F), PartPose.ZERO);

        root.addOrReplaceChild("towel_right", CubeListBuilder.create()
            .texOffs(22, 20).addBox(3.0F, -7.0F, -3.0F, 1.25F, 4.0F, 6.0F), PartPose.ZERO);

        root.addOrReplaceChild("left_shell", CubeListBuilder.create()
            .texOffs(0, 32).addBox(-2.75F, -2.25F, -2.25F, 2.75F, 4.5F, 4.5F)
            .texOffs(16, 32).addBox(-3.65F, -1.75F, -1.75F, 0.9F, 3.5F, 3.5F)
            .texOffs(24, 32).addBox(-4.25F, -1.15F, -1.15F, 0.6F, 2.3F, 2.3F), PartPose.offset(-4.25F, -4.0F, 0.0F));

        root.addOrReplaceChild("right_shell", CubeListBuilder.create()
            .texOffs(0, 46).addBox(0.0F, -2.25F, -2.25F, 2.75F, 4.5F, 4.5F)
            .texOffs(16, 46).addBox(2.75F, -1.75F, -1.75F, 0.9F, 3.5F, 3.5F)
            .texOffs(24, 46).addBox(3.65F, -1.15F, -1.15F, 0.6F, 2.3F, 2.3F), PartPose.offset(4.25F, -4.0F, 0.0F));

        return LayerDefinition.create(mesh, 64, 64);
    }
}
