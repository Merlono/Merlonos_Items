package net.merlono.merlonositems.item;

import net.merlono.merlonositems.MerlonosItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MerlonosItems.MOD_ID);

    public static final RegistryObject<Item> STAILIUM = ITEMS.register( "stailium",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STAILIUM = ITEMS.register( "raw_stailium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HILT = ITEMS.register( "hilt",
            () ->  new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRIP = ITEMS.register( "grip",
            () ->  new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}