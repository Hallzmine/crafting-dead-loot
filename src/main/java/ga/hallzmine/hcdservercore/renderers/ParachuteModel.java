package ga.hallzmine.hcdservercore.renderers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ParachuteModel extends EntityModel<Entity> {
    private final ModelRenderer bb_main;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;

    public ParachuteModel() {
        textureWidth = 128;
        textureHeight = 128;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(48, 1).addBox(-8.0F, -57.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-15.7048F, -54.626F, 0.0F);
        bb_main.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
        cube_r1.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-30.9324F, -50.5458F, 0.0F);
        bb_main.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3491F);
        cube_r2.setTextureOffset(0, 17).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-37.0F, -48.5F, -7.0F);
        bb_main.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.1309F, 0.0F, -0.8727F);
        cube_r3.setTextureOffset(0, 51).addBox(-0.4226F, -0.1075F, -0.1574F, 1.0F, 43.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-37.0F, -48.5F, 7.0F);
        bb_main.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1309F, 0.0F, -0.8727F);
        cube_r4.setTextureOffset(4, 51).addBox(-0.4226F, -0.1075F, -0.8426F, 1.0F, 43.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(37.0F, -48.5F, 7.0F);
        bb_main.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.1309F, 0.0F, 0.8727F);
        cube_r5.setTextureOffset(8, 51).addBox(-0.5774F, -0.1075F, -0.8426F, 1.0F, 43.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(15.7048F, -54.626F, 0.0F);
        bb_main.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
        cube_r6.setTextureOffset(0, 34).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(37.0F, -48.5F, -7.0F);
        bb_main.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.1309F, 0.0F, 0.8727F);
        cube_r7.setTextureOffset(12, 51).addBox(-0.5774F, -0.1075F, -0.1574F, 1.0F, 43.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(30.9324F, -50.5458F, 0.0F);
        bb_main.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
        cube_r8.setTextureOffset(48, 48).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}