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
            .texOffs(0, 0).addBox(-5.80F, -5.80F, -1.9F, 1.2F, 3.9F, 3.8F)
            .texOffs(14, 0).addBox(-6.40F, -5.40F, -1.75F, 0.6F, 3.1F, 3.5F)
            .texOffs(24, 0).addBox(-6.75F, -4.85F, -1.45F, 0.35F, 2.2F, 2.9F)
            .texOffs(32, 0).addBox(-4.65F, -5.40F, -1.6F, 0.7F, 3.1F, 3.2F)
            .texOffs(42, 0).addBox(-4.05F, -4.90F, -1.3F, 0.6F, 2.2F, 2.6F)
            .texOffs(0, 12).addBox(-5.40F, -6.30F, -1.35F, 1.4F, 0.5F, 2.7F)
            .texOffs(10, 12).addBox(-5.40F, -1.90F, -1.35F, 1.4F, 0.5F, 2.7F)
            .texOffs(20, 12).addBox(-5.00F, -4.85F, -0.95F, 0.55F, 1.9F, 1.9F)
            .texOffs(28, 12).addBox(-4.75F, -4.45F, -0.65F, 0.4F, 1.1F, 1.3F)
            .texOffs(34, 12).addBox(-4.15F, -5.30F, -1.4F, 0.75F, 2.8F, 2.8F), PartPose.ZERO);

        head.addOrReplaceChild("right_shell", CubeListBuilder.create().mirror()
            .texOffs(0, 0).addBox(4.60F, -5.80F, -1.9F, 1.2F, 3.9F, 3.8F)
            .texOffs(14, 0).addBox(5.80F, -5.40F, -1.75F, 0.6F, 3.1F, 3.5F)
            .texOffs(24, 0).addBox(6.40F, -4.85F, -1.45F, 0.35F, 2.2F, 2.9F)
            .texOffs(32, 0).addBox(3.95F, -5.40F, -1.6F, 0.7F, 3.1F, 3.2F)
            .texOffs(42, 0).addBox(3.45F, -4.90F, -1.3F, 0.6F, 2.2F, 2.6F)
            .texOffs(0, 12).addBox(4.00F, -6.30F, -1.35F, 1.4F, 0.5F, 2.7F)
            .texOffs(10, 12).addBox(4.00F, -1.90F, -1.35F, 1.4F, 0.5F, 2.7F)
            .texOffs(20, 12).addBox(4.45F, -4.85F, -0.95F, 0.55F, 1.9F, 1.9F)
            .texOffs(28, 12).addBox(4.35F, -4.45F, -0.65F, 0.4F, 1.1F, 1.3F)
            .texOffs(34, 12).addBox(3.40F, -5.30F, -1.4F, 0.75F, 2.8F, 2.8F), PartPose.ZERO);

        return LayerDefinition.create(mesh, 64, 64);
    }
}
