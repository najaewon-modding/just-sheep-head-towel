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
            .texOffs(0, 0).addBox(-7.0F, -6.0F, -2.0F, 3.0F, 4.0F, 4.0F)
            .texOffs(0, 0).addBox(-6.5F, -7.0F, -1.5F, 2.5F, 1.0F, 3.0F)
            .texOffs(0, 0).addBox(-6.5F, -2.0F, -1.5F, 2.5F, 1.0F, 3.0F)
            .texOffs(0, 0).addBox(-6.5F, -5.5F, -2.75F, 2.5F, 3.0F, 0.75F)
            .texOffs(0, 0).addBox(-6.5F, -5.5F, 2.0F, 2.5F, 3.0F, 0.75F)
            .texOffs(32, 0).addBox(-7.75F, -5.25F, -1.25F, 0.75F, 2.5F, 2.5F)
            .texOffs(32, 32).addBox(-8.25F, -4.75F, -0.75F, 0.5F, 1.5F, 1.5F)
            .texOffs(0, 32).addBox(-7.75F, -4.25F, 1.0F, 0.75F, 1.0F, 1.0F), PartPose.ZERO);

        return LayerDefinition.create(mesh, 64, 64);
    }
}
