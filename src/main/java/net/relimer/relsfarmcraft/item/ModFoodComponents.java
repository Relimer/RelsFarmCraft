package net.relimer.relsfarmcraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.relimer.relsfarmcraft.effect.ModEffects;

public class ModFoodComponents {
    public static final FoodComponent BERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent DRIED_BERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent BERRY_JAM = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent BERRY_JAM_TART = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent BERRY_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build();
    public static final FoodComponent BERRY_SORBET = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).snack().build();
    public static final FoodComponent BERRY_DOUGHNUT = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).snack().build();
    public static final FoodComponent DRIED_BERRY_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).snack().build();
    public static final FoodComponent BERRY_COMPOTE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build();
    public static final FoodComponent HONEYED_BERRY = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent BERRY_JELLY = new FoodComponent.Builder().hunger(-2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 1), 1.0f).alwaysEdible().build();
    public static final FoodComponent BERRY_JUICE = new FoodComponent.Builder().hunger(0).saturationModifier(0.5f).alwaysEdible().build();
    public static final FoodComponent BERRY_WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.3f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 1.0f).build();

    public static final FoodComponent SPICED_GRAPE_JAM = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 1.0f).build();
    public static final FoodComponent GRAPE_TEA = new FoodComponent.Builder().hunger(0).saturationModifier(0.2f).alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.WEAKNESS_IMMUNITY, 600, 0), 1.0f).build();
    public static final FoodComponent SPICED_GRAPE_WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 2), 1.0f).build();

    public static final FoodComponent SPICED_STRAWBERRY_JAM = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0f).build();
    public static final FoodComponent STRAWBERRY_TEA = new FoodComponent.Builder().hunger(0).saturationModifier(0.2f).alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.POISON_IMMUNITY, 600, 0), 1.0f).statusEffect(new StatusEffectInstance(ModEffects.WITHER_IMMUNITY, 600, 0), 1.0f).build();
    public static final FoodComponent SPICED_STRAWBERRY_WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f).build();

    public static final FoodComponent SPICED_CRANBERRY_JAM = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1.0f).build();
    public static final FoodComponent CRANBERRY_TEA = new FoodComponent.Builder().hunger(0).saturationModifier(0.2f).alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.POISON_IMMUNITY, 600, 0), 1.0f).statusEffect(new StatusEffectInstance(ModEffects.WITHER_IMMUNITY, 600, 0), 1.0f).build();
    public static final FoodComponent SPICED_CRANBERRY_WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f).build();

}

