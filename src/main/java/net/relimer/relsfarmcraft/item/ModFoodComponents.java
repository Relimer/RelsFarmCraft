package net.relimer.relsfarmcraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.relimer.relsfarmcraft.effect.ModEffects;

public class ModFoodComponents {
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent GRAPES = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();

    public static final FoodComponent DRIED_GRAPES = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent GRAPE_JAM = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent SPICED_GRAPE_JAM = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 0), 1.0f).build();
    public static final FoodComponent GRAPE_JAM_TART = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent GRAPE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(0.3f).build();
    public static final FoodComponent GRAPE_SORBET = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).snack().build();
    public static final FoodComponent GRAPE_DOUGHNUT = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).snack().build();
    public static final FoodComponent DRIED_GRAPE_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).snack().build();
    public static final FoodComponent GRAPE_COMPOTE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build();
    public static final FoodComponent HONEYED_GRAPES = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();
    public static final FoodComponent GRAPE_JELLY = new FoodComponent.Builder().hunger(-2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 1), 1.0f).alwaysEdible().build();
    public static final FoodComponent GRAPE_JUICE = new FoodComponent.Builder().hunger(0).saturationModifier(0.5f).alwaysEdible().build();
    public static final FoodComponent GRAPE_TEA = new FoodComponent.Builder().hunger(0).saturationModifier(0.2f).alwaysEdible().statusEffect(new StatusEffectInstance(ModEffects.WEAKNESS_IMMUNITY, 600, 0), 1.0f).build();
    public static final FoodComponent GRAPE_WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.3f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 1.0f).build();
    public static final FoodComponent SPICED_GRAPE_WINE = new FoodComponent.Builder().hunger(0).saturationModifier(0.5f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 2), 1.0f).build();
}

