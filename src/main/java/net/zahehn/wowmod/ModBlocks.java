package net.zahehn.wowmod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    // Registro para blocos
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    // Seu bloco customizado
    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE) // Cor no mapa
                    .strength(3.0f, 3.0f) // Dureza para quebrar, resistência a explosões
                    .requiresCorrectToolForDrops() // Precisa da ferramenta certa
                    .sound(SoundType.STONE))); // Som quando quebra/pisa

    // Método para registrar os blocos
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}