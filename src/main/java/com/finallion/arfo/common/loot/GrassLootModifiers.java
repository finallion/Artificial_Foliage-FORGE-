package com.finallion.arfo.common.loot;

import com.finallion.arfo.init.ARFOItems;
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
                if ((seedItem == ARFOItems.JUNGLE_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.JUNGLE_DYE,5));
                    continue;
                }
                if ((seedItem == ARFOItems.JUNGLE_EDGE_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.JUNGLE_EDGE_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.BADLANDS_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.BADLANDS_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.SAVANNA_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.SAVANNA_DYE, 5));
                }
                if ((seedItem == ARFOItems.FOREST_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.FOREST_DYE,5));
                    continue;
                }
                if ((seedItem == ARFOItems.BIRCH_FOREST_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.BIRCH_FOREST_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.DARK_FOREST_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.DARK_FOREST_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.PLAINS_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.PLAINS_DYE, 5));
                }
                if ((seedItem == ARFOItems.SWAMP_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.SWAMP_DYE,5));
                    continue;
                }
                if ((seedItem == ARFOItems.LUSH_SWAMP_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.LUSH_SWAMP_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.MOUNTAINS_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.MOUNTAINS_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.MUSHROOM_FIELDS_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.MUSHROOM_FIELDS_DYE, 5));
                }
                if ((seedItem == ARFOItems.TAIGA_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.TAIGA_DYE,5));
                    continue;
                }
                if ((seedItem == ARFOItems.MEGA_TAIGA_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.MEGA_TAIGA_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.SNOWY_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.SNOWY_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.SNOWY_BEACH_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.SNOWY_BEACH_DYE, 5));
                    continue;
                }
                if ((seedItem == ARFOItems.WATERS_DYE)) {
                    dropped_dye.add(new DyeEntry(ARFOItems.WATERS_DYE, 5));
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