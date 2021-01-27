package ga.hallzmine.hcdservercore.effects;

import ga.hallzmine.hcdservercore.RegistryHandler;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;

public class ParachuteEffect extends Effect {
    public ParachuteEffect() {
        super(EffectType.BENEFICIAL, 16773073);
    }

    @Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        entityLivingBaseIn.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 1, 0, true, false));
        if(entityLivingBaseIn.isOnGround() == true) {
            entityLivingBaseIn.removePotionEffect(RegistryHandler.PARACHUTEEFFECT.get());
        }
/*
        if(entityLivingBaseIn instanceof PlayerEntity) {
            final EntityRendererManager renderManager = null;
            EntityRenderer<PlayerEntity> entityRenderer = (EntityRenderer<PlayerEntity>) renderManager.getRenderer((PlayerEntity)entityLivingBaseIn);
            entityRenderer;
        }
*/
        super.performEffect(entityLivingBaseIn, amplifier);
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean isInstant() {
        return false;
    }
}
