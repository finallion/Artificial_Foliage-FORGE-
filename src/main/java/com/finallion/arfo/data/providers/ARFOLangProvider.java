package com.finallion.arfo.data.providers;

import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

public class ARFOLangProvider extends LanguageProvider {

    public ARFOLangProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        for (Block block : ARFOBlocks.blocksList) {
            add(block, buildBlockName(block.toString()));
        }

        for (Item item : ARFOItems.itemsList) {
            String itemName = item.toString();
            if (itemName.contains("bucket") || itemName.contains("dye") || itemName.contains("grass_seed")) {
                add(item, buildItemName(itemName));
            }
        }

        add("itemGroup.arfo", "Artificial Foliage");
        //add("itemGroup.arfo+", "Artificial Foliage for Traverse");
        //add("itemGroup.arfo++", "Artificial Foliage for BYG");

    }

    public static String buildBlockName(String id) {
        String[] singleWords = id.split(":")[1].replace("_", " ").replace("}", "").split(" ");
        StringBuilder name = new StringBuilder();
        for (String word : singleWords) {
            name.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        String buildName = name.toString().trim();

        if (buildName.contains("Byg")) {
            return buildName.replace("Byg", "BYG");
        }

        return buildName;
    }

    private String buildItemName(String id) {
        String[] singleWords = id.replace("_", " ").split(" ");
        StringBuilder name = new StringBuilder();
        for (String word : singleWords) {
            name.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        String buildName = name.toString().trim();

        if (buildName.contains("Byg")) {
            buildName = buildName.replace("Byg", "BYG");
        }

        if (buildName.contains("Dye")) {
            return buildName.replace("Dye", "Pigment");
        }

        return buildName;
    }

    @Override
    public String getName() {
        return "Artificial Foliage lang";
    }
}
