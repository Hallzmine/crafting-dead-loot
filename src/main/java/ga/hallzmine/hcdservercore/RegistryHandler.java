package ga.hallzmine.hcdservercore;

import ga.hallzmine.hcdservercore.blocks.*;
import ga.hallzmine.hcdservercore.effects.ParachuteEffect;
import ga.hallzmine.hcdservercore.items.ItemBase;
import ga.hallzmine.hcdservercore.items.ParachuteItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ServercoreMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ServercoreMod.MOD_ID);
    public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, ServercoreMod.MOD_ID);
    public static final DeferredRegister<ContainerType<?>> CONTAINERTYPE = DeferredRegister.create(ForgeRegistries.CONTAINERS, ServercoreMod.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERTYPE.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> MILITARY_LOOT = BLOCKS.register("military_loot", () -> new LootPileBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), "military"));
    public static final RegistryObject<Item> MILITARY_LOOT_ITEM = ITEMS.register("military_loot", () -> new HiddenBlockItemBase(MILITARY_LOOT.get()));

    public static final RegistryObject<Block> MEDIC_LOOT = BLOCKS.register("medic_loot", () -> new LootPileBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), "medic"));
    public static final RegistryObject<Item> MEDIC_LOOT_ITEM = ITEMS.register("medic_loot", () -> new HiddenBlockItemBase(MEDIC_LOOT.get()));

    public static final RegistryObject<Block> CIVILIAN_LOOT = BLOCKS.register("civilian_loot", () -> new LootPileBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), "civilian"));
    public static final RegistryObject<Item> CIVILIAN_LOOT_ITEM = ITEMS.register("civilian_loot", () -> new HiddenBlockItemBase(CIVILIAN_LOOT.get()));

    public static final RegistryObject<Block> CIVILIAN_RARE_LOOT = BLOCKS.register("civilian_rare_loot", () -> new LootPileBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), "civilian_rare"));
    public static final RegistryObject<Item> CIVILIAN_RARE_LOOT_ITEM = ITEMS.register("civilian_rare_loot", () -> new HiddenBlockItemBase(CIVILIAN_RARE_LOOT.get()));

    public static final RegistryObject<Block> POLICE_LOOT = BLOCKS.register("police_loot", () -> new LootPileBase(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f, 5.0f), "police"));
    public static final RegistryObject<Item> POLICE_LOOT_ITEM = ITEMS.register("police_loot", () -> new HiddenBlockItemBase(POLICE_LOOT.get()));


    public static final RegistryObject<Block> MILITARY_LOOT_GEN = BLOCKS.register("military_loot_gen", () -> new LootGenBase(Block.Properties.create(Material.STRUCTURE_VOID).hardnessAndResistance(5.0f, 5.0f), "military"));
    public static final RegistryObject<Item> MILITARY_LOOT_GEN_ITEM = ITEMS.register("military_loot_gen", () -> new BlockItemBase(MILITARY_LOOT_GEN.get()));

    public static final RegistryObject<Block> MEDIC_LOOT_GEN = BLOCKS.register("medic_loot_gen", () -> new LootGenBase(Block.Properties.create(Material.STRUCTURE_VOID).hardnessAndResistance(5.0f, 5.0f), "medic"));
    public static final RegistryObject<Item> MEDIC_LOOT_GEN_ITEM = ITEMS.register("medic_loot_gen", () -> new BlockItemBase(MEDIC_LOOT_GEN.get()));

    public static final RegistryObject<Block> CIVILIAN_LOOT_GEN = BLOCKS.register("civilian_loot_gen", () -> new LootGenBase(Block.Properties.create(Material.STRUCTURE_VOID).hardnessAndResistance(5.0f, 5.0f), "civilian"));
    public static final RegistryObject<Item> CIVILIAN_LOOT_GEN_ITEM = ITEMS.register("civilian_loot_gen", () -> new BlockItemBase(CIVILIAN_LOOT_GEN.get()));

    public static final RegistryObject<Block> CIVILIAN_RARE_LOOT_GEN = BLOCKS.register("civilian_rare_loot_gen", () -> new LootGenBase(Block.Properties.create(Material.STRUCTURE_VOID).hardnessAndResistance(5.0f, 5.0f), "civilian_rare"));
    public static final RegistryObject<Item> CIVILIAN_RARE_LOOT_GEN_ITEM = ITEMS.register("civilian_rare_loot_gen", () -> new BlockItemBase(CIVILIAN_RARE_LOOT_GEN.get()));

    public static final RegistryObject<Block> POLICE_LOOT_GEN = BLOCKS.register("police_loot_gen", () -> new LootGenBase(Block.Properties.create(Material.STRUCTURE_VOID).hardnessAndResistance(5.0f, 5.0f), "police"));
    public static final RegistryObject<Item> POLICE_LOOT_GEN_ITEM = ITEMS.register("police_loot_gen", () -> new BlockItemBase(POLICE_LOOT_GEN.get()));

    public static final RegistryObject<Item> PARACHUTE = ITEMS.register("parachute", () -> new ParachuteItem());
    public static final RegistryObject<Effect> PARACHUTEEFFECT = EFFECTS.register("parachute", () -> new ParachuteEffect());
}
