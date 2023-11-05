package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModSmithingTemplateItem extends Item {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.ingredients"))).formatted(TITLE_FORMATTING);
    private static final Text APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.applies_to"))).formatted(TITLE_FORMATTING);
    private static final Text ORIKALKUM_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier(OresAndMetals.MOD_ID, "orikalkum_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text NECRONIUM_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier(OresAndMetals.MOD_ID, "necronium_upgrade"))).formatted(TITLE_FORMATTING);
    private static final Text ORIKALKUM_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.orikalkum_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text ORIKALKUM_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.orikalkum_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text ORIKALKUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.orikalkum_upgrade.base_slot_description")));
    private static final Text ORIKALKUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.orikalkum_upgrade.additions_slot_description")));
    private static final Text NECRONIUM_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.necronium_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text NECRONIUM_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.necronium_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    private static final Text NECRONIUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.necronium_upgrade.base_slot_description")));
    private static final Text NECRONIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier(OresAndMetals.MOD_ID, "smithing_template.necronium_upgrade.additions_slot_description")));
    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = new Identifier("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = new Identifier("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = new Identifier("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = new Identifier("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = new Identifier("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = new Identifier("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = new Identifier("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = new Identifier("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = new Identifier("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_INGOT_TEXTURE = new Identifier("item/empty_slot_ingot");
    private final Text appliesToText;
    private final Text ingredientsText;
    private final Text titleText;
    private final Text baseSlotDescriptionText;
    private final Text additionsSlotDescriptionText;
    private final List<Identifier> emptyBaseSlotTextures;
    private final List<Identifier> emptyAdditionsSlotTextures;
    public ModSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText, Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures, List<Identifier> emptyAdditionsSlotTextures) {
        super(new FabricItemSettings());
        this.appliesToText = appliesToText;
        this.ingredientsText = ingredientsText;
        this.titleText = titleText;
        this.baseSlotDescriptionText = baseSlotDescriptionText;
        this.additionsSlotDescriptionText = additionsSlotDescriptionText;
        this.emptyBaseSlotTextures = emptyBaseSlotTextures;
        this.emptyAdditionsSlotTextures = emptyAdditionsSlotTextures;
    }

    public static SmithingTemplateItem createOrikalkumUpgrade() {
        return new SmithingTemplateItem(ORIKALKUM_UPGRADE_APPLIES_TO_TEXT, ORIKALKUM_UPGRADE_INGREDIENTS_TEXT, ORIKALKUM_UPGRADE_TEXT, ORIKALKUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, ORIKALKUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures());
    }

    public static SmithingTemplateItem createNecroniumUpgrade() {
        return new SmithingTemplateItem(NECRONIUM_UPGRADE_APPLIES_TO_TEXT, NECRONIUM_UPGRADE_INGREDIENTS_TEXT, NECRONIUM_UPGRADE_TEXT, NECRONIUM_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, NECRONIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, getUpgradeEmptyBaseSlotTextures(), getUpgradeEmptyAdditionsSlotTextures());
    }

    private static List<Identifier> getUpgradeEmptyBaseSlotTextures() {
        return List.of(EMPTY_ARMOR_SLOT_HELMET_TEXTURE, EMPTY_SLOT_SWORD_TEXTURE, EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE, EMPTY_SLOT_PICKAXE_TEXTURE, EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE, EMPTY_SLOT_AXE_TEXTURE, EMPTY_ARMOR_SLOT_BOOTS_TEXTURE, EMPTY_SLOT_HOE_TEXTURE, EMPTY_SLOT_SHOVEL_TEXTURE);
    }

    private static List<Identifier> getUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_INGOT_TEXTURE);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(this.titleText);
        tooltip.add(ScreenTexts.EMPTY);
        tooltip.add(APPLIES_TO_TEXT);
        tooltip.add(ScreenTexts.space().append(this.appliesToText));
        tooltip.add(INGREDIENTS_TEXT);
        tooltip.add(ScreenTexts.space().append(this.ingredientsText));
    }
}
