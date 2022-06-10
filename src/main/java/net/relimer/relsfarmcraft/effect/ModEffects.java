package net.relimer.relsfarmcraft.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;

public class ModEffects {
    public static void registerEffects() {
        WEAKNESS_IMMUNITY = registerWeaknessImmunityStatusEffect( "weakness_immunity");
        POISON_IMMUNITY = registerPoisonImmunityStatusEffect( "poison_immunity");
        WITHER_IMMUNITY = registerWitherImmunityStatusEffect( "wither_immunity");
    }
    public static StatusEffect WEAKNESS_IMMUNITY;
    public static StatusEffect POISON_IMMUNITY;
    public static StatusEffect WITHER_IMMUNITY;



    public static StatusEffect registerWeaknessImmunityStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(RelsFarmCraft.MOD_ID, name),
                new WeaknessImmunityEffect(StatusEffectCategory.BENEFICIAL, 0xb1a3ca));
    }

    public static StatusEffect registerPoisonImmunityStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(RelsFarmCraft.MOD_ID, name),
                new PoisonImmunityEffect(StatusEffectCategory.BENEFICIAL, 0xff8888));
    }

    public static StatusEffect registerWitherImmunityStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(RelsFarmCraft.MOD_ID, name),
                new WitherImmunityEffect(StatusEffectCategory.BENEFICIAL, 0xff8888));
    }



}
