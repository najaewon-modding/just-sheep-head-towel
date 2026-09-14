package net.njw.justsheepheadtowel.client;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.resources.Identifier;
import net.njw.justsheepheadtowel.JustSheepHeadTowel;

public final class SheepHeadTowelModel extends HumanoidModel<AvatarRenderState> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath(JustSheepHeadTowel.MODID, "sheep_head_towel"), "main");

    public SheepHeadTowelModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createLayer() {
        MeshDefinition mesh = PlayerModel.createMesh(CubeDeformation.NONE, false);
        PartDefinition root = mesh.getRoot().clearRecursively();
        PartDefinition head = root.getChild("head");
        head.clearChild("hat");

        head.addOrReplaceChild("left_shell", CubeListBuilder.create()
            .texOffs(0, 0).addBox(-7.2F, -6.5F, -2.4F, 1.6F, 5.0F, 4.8F)
            .texOffs(14, 0).addBox(-8.0F, -6.0F, -2.2F, 0.8F, 4.0F, 4.4F)
            .texOffs(24, 0).addBox(-8.5F, -5.3F, -1.8F, 0.5F, 2.8F, 3.6F)
            .texOffs(32, 0).addBox(-5.7F, -6.0F, -2.0F, 0.9F, 4.0F, 4.0F)
            .texOffs(42, 0).addBox(-4.9F, -5.4F, -1.6F, 0.8F, 2.8F, 3.2F)
            .texOffs(0, 12).addBox(-6.7F, -7.1F, -1.7F, 1.8F, 0.6F, 3.4F)
            .texOffs(10, 12).addBox(-6.7F, -1.5F, -1.7F, 1.8F, 0.6F, 3.4F)
            .texOffs(20, 12).addBox(-6.2F, -5.2F, -1.2F, 0.7F, 2.4F, 2.4F)
            .texOffs(28, 12).addBox(-5.9F, -4.7F, -0.8F, 0.5F, 1.4F, 1.6F), PartPose.ZERO);

        head.addOrReplaceChild("right_shell", CubeListBuilder.create().mirror()
            .texOffs(0, 0).addBox(5.6F, -6.5F, -2.4F, 1.6F, 5.0F, 4.8F)
            .texOffs(14, 0).addBox(7.2F, -6.0F, -2.2F, 0.8F, 4.0F, 4.4F)
            .texOffs(24, 0).addBox(8.0F, -5.3F, -1.8F, 0.5F, 2.8F, 3.6F)
            .texOffs(32, 0).addBox(4.8F, -6.0F, -2.0F, 0.9F, 4.0F, 4.0F)
            .texOffs(42, 0).addBox(4.1F, -5.4F, -1.6F, 0.8F, 2.8F, 3.2F)
            .texOffs(0, 12).addBox(4.9F, -7.1F, -1.7F, 1.8F, 0.6F, 3.4F)
            .texOffs(10, 12).addBox(4.9F, -1.5F, -1.7F, 1.8F, 0.6F, 3.4F)
            .texOffs(20, 12).addBox(5.5F, -5.2F, -1.2F, 0.7F, 2.4F, 2.4F)
            .texOffs(28, 12).addBox(5.4F, -4.7F, -0.8F, 0.5F, 1.4F, 1.6F), PartPose.ZERO);

        return LayerDefinition.create(mesh, 64, 64);
    }
}
