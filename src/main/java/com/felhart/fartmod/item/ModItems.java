package com.felhart.fartmod.item;


import com.felhart.fartmod.FartMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FartMod.MODID);

    public static final RegistryObject<Item> FART = ITEMS.register("fart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FART_STAFF = ITEMS.register("fart_staff",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
