package com.finallion.arfo.common.loot;

import com.finallion.arfo.init.ModItems;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.WeightedRandom;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class GrassLootModifiers {

    public static class DyeEntry extends WeightedRandom.Item {
        public final Item dye_item;

        public DyeEntry(Item dye_id, int itemWeightIn) {
            super(itemWeightIn);
            dye_item = dye_id;
        }
    }

    public static class GrassLootModifier extends LootModifier {
        private List<DyeEntry> dropped_dye = new ArrayList<DyeEntry>();

        public GrassLootModifier(ILootCondition[] conditionsIn, List<String> dyes) {
            super(conditionsIn);
            dropped_dye.add(new DyeEntry(Items.WHEAT_SEEDS, 1));

            for (String d : dyes) {
                Item seedItem = ForgeRegistries.ITEMS.getValue(new ResourceLocation(d));
                if ((seedItem == ModItems.JUNGLE_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.JUNGLE_DYE,5));
                    continue;
                }
                if ((seedItem == ModItems.JUNGLE_EDGE_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.JUNGLE_EDGE_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.BADLANDS_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.BADLANDS_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.SAVANNA_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.SAVANNA_DYE, 5));
                }
                if ((seedItem == ModItems.FOREST_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.FOREST_DYE,5));
                    continue;
                }
                if ((seedItem == ModItems.BIRCH_FOREST_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.BIRCH_FOREST_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.DARK_FOREST_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.DARK_FOREST_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.PLAINS_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.PLAINS_DYE, 5));
                }
                if ((seedItem == ModItems.SWAMP_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.SWAMP_DYE,5));
                    continue;
                }
                if ((seedItem == ModItems.LUSH_SWAMP_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.LUSH_SWAMP_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.MOUNTAINS_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.MOUNTAINS_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.MUSHROOM_FIELDS_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.MUSHROOM_FIELDS_DYE, 5));
                }
                if ((seedItem == ModItems.TAIGA_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.TAIGA_DYE,5));
                    continue;
                }
                if ((seedItem == ModItems.MEGA_TAIGA_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.MEGA_TAIGA_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.SNOWY_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.SNOWY_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.SNOWY_BEACH_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.SNOWY_BEACH_DYE, 5));
                    continue;
                }
                if ((seedItem == ModItems.WATERS_DYE)) {
                    dropped_dye.add(new DyeEntry(ModItems.WATERS_DYE, 5));
                }
            }
        }

        @Override
        protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
            List<ItemStack> newLoot = new ArrayList<ItemStack>();
            for (ItemStack stack : generatedLoot) {

                if (stack.getItem() == Items.WHEAT_SEEDS) {
                    DyeEntry dyeEntry = WeightedRandom.getRandomItem(context.getRandom(), dropped_dye);
                    ItemStack new_stack = new ItemStack(dyeEntry.dye_item, stack.getCount());
                    newLoot.add(new_stack);
                } else {
                    newLoot.add(stack);
                }
            }
            return newLoot;
        }

        public static class Serializer extends GlobalLootModifierSerializer<GrassLootModifier> {
            @Override
            public GrassLootModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition) {
                List<String> dyes = new ArrayList<String>();

                JsonArray dyeList = JSONUtils.getAsJsonArray(object, "dyes");
                for (JsonElement je: dyeList) {
                    dyes.add(je.getAsString());
                }
                return new GrassLootModifier(ailootcondition, dyes);
            }

            @Override
            public JsonObject write(GrassLootModifier instance) {
                return makeConditions(instance.conditions);
            }
        }
    }
}