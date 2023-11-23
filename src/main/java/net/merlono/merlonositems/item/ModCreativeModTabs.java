package net.merlono.merlonositems.item;

import net.merlono.merlonositems.MerlonosItems;
import net.merlono.merlonositems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MerlonosItems.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MERLONOS_ITEMS = CREATIVE_MODE_TABS.register("merlonos_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.STAILIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.merlonos_items"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(Moditems.STAILIUM_INGOT.get());
                        p_259752_.accept(Moditems.RAW_STAILIUM.get());
                        p_259752_.accept(Moditems.HILT.get());
                        p_259752_.accept(ModBlocks.STAILIUM_BLOCK.get());
                        p_259752_.accept(ModBlocks.RAW_STAILIUM_BLOCK.get());
                        p_259752_.accept(Moditems.GRIP.get());
                        p_259752_.accept(ModBlocks.END_STONE_STAILIUM_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
