package net.thecat.geology.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.thecat.geology.Geology;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, Geology.MOD_ID);


    public static final RegistryObject<Item> FLUORITE = ITEMS.register("fluorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_INGOT = ITEMS.register("fluorite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FLUORITE_NUGGET = ITEMS.register("fluorite_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURIFIED_FLUORITE = ITEMS.register("purified_fluorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURIFIED_FLUORITE_INGOT = ITEMS.register("purified_fluorite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURIFIED_FLUORITE_NUGGET = ITEMS.register("purified_fluorite_nugget",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> RED_FLUORITE = ITEMS.register("red_fluorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_FLUORITE_INGOT = ITEMS.register("red_fluorite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_FLUORITE_NUGGET = ITEMS.register("red_fluorite_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
