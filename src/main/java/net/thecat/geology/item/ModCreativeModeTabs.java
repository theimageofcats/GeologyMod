package net.thecat.geology.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thecat.geology.Geology;
import net.thecat.geology.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Geology.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FLUORITE_CREATIVE = CREATIVE_MODE_TABS.register("fluorite_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE_INGOT.get()))
                    .title(Component.translatable("creativetab.geology.fluorite_creative"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FLUORITE.get());
                        output.accept(ModItems.RED_FLUORITE.get());
                        output.accept(ModItems.PURIFIED_FLUORITE.get());
                        output.accept(ModItems.FLUORITE_INGOT.get());
                        output.accept(ModItems.RED_FLUORITE_INGOT.get());
                        output.accept(ModItems.PURIFIED_FLUORITE_INGOT.get());
                        output.accept(ModItems.FLUORITE_NUGGET.get());
                        output.accept(ModItems.RED_FLUORITE_NUGGET.get());
                        output.accept(ModItems.PURIFIED_FLUORITE_NUGGET.get());
                        output.accept(ModBlocks.FLUORITE_BLOCK.get());
                        output.accept(ModBlocks.RED_FLUORITE_BLOCK.get());
                        output.accept(ModBlocks.PURIFIED_FLUORITE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
