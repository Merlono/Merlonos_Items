package net.merlono.merlonosweapons.item;

import net.merlono.merlonosweapons.MerlonosWeapons;
import net.merlono.merlonosweapons.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MerlonosWeapons.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MERLONOS_WEAPONS = CREATIVE_MODE_TABS.register("merlonos_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.STAILIUM.get()))
                    .title(Component.translatable("creativetab.merlonos_weapons"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(Moditems.STAILIUM.get());
                        p_259752_.accept(Moditems.RAW_STAILIUM.get());
                        p_259752_.accept(Moditems.HILT.get());
                        p_259752_.accept(ModBlocks.STAILIUM_BLOCK.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
