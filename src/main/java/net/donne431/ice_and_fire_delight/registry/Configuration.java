package net.donne431.ice_and_fire_delight.registry;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configuration {
    public static ForgeConfigSpec COMMON_CONFIG;
    public static final String CATEGORY_SPECIAL_PIE = "special_pie";
    public static ForgeConfigSpec.BooleanValue ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE;
    public static ForgeConfigSpec.DoubleValue CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE;
    public static ForgeConfigSpec.IntValue NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE;
    public static final String CATEGORY_SPECIAL_PIE_SLICE = "special_pie_slice";
    public static ForgeConfigSpec.BooleanValue ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE_SLICE;
    public static ForgeConfigSpec.DoubleValue CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE_SLICE;
    public static ForgeConfigSpec.IntValue NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE_SLICE;
    public static final String CATEGORY_SPECIAL_SAUSAGE = "special_sausage";
    public static ForgeConfigSpec.BooleanValue ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_SAUSAGE;
    public static ForgeConfigSpec.DoubleValue CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_SAUSAGE;
    public static ForgeConfigSpec.IntValue NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_SAUSAGE;

    static {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("Special Pie").push("special_pie");
        ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE = COMMON_BUILDER.comment("Will there be an explosion when eating a special pie. Default: true").define("enable_explosions_when_eat_special_pie", true);
        CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE = COMMON_BUILDER.comment("This variable is responsible for the chance of an explosion when eating a special pie. 0.0 - 0%, 1.0 - 100%. Default: 0.2").defineInRange("chance_explosions_when_eat_special_pie", 0.2, (double)0.0F, (double)1.0F);
        NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE = COMMON_BUILDER.comment("Number of deaths before explosions stop after eating special pie. Default: 1").defineInRange("number_death_before_explosions_stop_when_eating_special_pie", 1, (int) 1, (int)9999);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Special Pie Slice").push("special_pie_slice");
        ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE_SLICE = COMMON_BUILDER.comment("Will there be an explosion when eating a special pie slice. Default: true").define("enable_explosions_when_eat_special_pie_slice", true);
        CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE_SLICE = COMMON_BUILDER.comment("This variable is responsible for the chance of an explosion when eating a special pie slice. 0.0 - 0%, 1.0 - 100%. Default: 0.2").defineInRange("chance_explosions_when_eat_special_pie_slice", 0.2, (double)0.0F, (double)1.0F);
        NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE_SLICE = COMMON_BUILDER.comment("Number of deaths before explosions stop after eating special pie slice. Default: 1").defineInRange("number_death_before_explosions_stop_when_eating_special_pie_slice", 1, (int)1, (int)9999);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("Special Sausage").push("special_sausage");
        ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_SAUSAGE = COMMON_BUILDER.comment("Will there be an explosion when eating a special sausage. Default: true").define("enable_explosions_when_eat_special_sausage", true);
        CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_SAUSAGE = COMMON_BUILDER.comment("This variable is responsible for the chance of an explosion when eating a special sausage. 0.0 - 0%, 1.0 - 100%. Default: 0.2").defineInRange("chance_explosions_when_eat_special_sausage", 0.2, (double)0.0F, (double)1.0F);
        NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_SAUSAGE = COMMON_BUILDER.comment("Number of deaths before explosions stop after eating special sausage. Default: 1").defineInRange("number_death_before_explosions_stop_when_eating_special_sausage", 1, (int)1, (int)9999);
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}

