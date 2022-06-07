package net.relimer.relsfarmcraft.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;

public class ModEffects {
    public static StatusEffect WEAKNESS_IMMUNITY;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(RelsFarmCraft.MOD_ID, name),
                new WeaknessImmunityEffect(StatusEffectCategory.BENEFICIAL, 0xb1a3ca));
    }

    public static void registerEffects() {
        WEAKNESS_IMMUNITY = registerStatusEffect( "weakness_immunity");
    }
}
