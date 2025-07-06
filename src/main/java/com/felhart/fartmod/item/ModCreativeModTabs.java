package com.felhart.fartmod.item;

import com.felhart.fartmod.FartMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FartMod.MODID);

    public static final RegistryObject<CreativeModeTab> FART_TAB = CREATIVE_MODE_TABS.register("fart_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FART.get()))
                    .title(Component.translatable("creativetab.fart_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.FART.get());
                        output.accept(ModItems.FART_STAFF.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
