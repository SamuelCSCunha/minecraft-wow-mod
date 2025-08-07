package net.zahehn.wowmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    // Cria o registro para abas criativas
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    // Define sua aba criativa
    public static final RegistryObject<CreativeModeTab> WOW_TAB = CREATIVE_MODE_TABS.register("wow_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.VOID_GLASS_SOVEREIGN_BLADE.get())) // Ícone da aba
                    .title(Component.translatable("creativetab.wowmod.wow_tab")) // Nome da aba
                    .displayItems((itemDisplayParameters, output) -> {
                        // Adiciona seus itens na aba
                        output.accept(ModItems.VOID_GLASS_SOVEREIGN_BLADE.get());
                    })
                    .build());

    // Método para registrar as abas
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}