package net.zahehn.wowmod;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Registro para itens
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    // Item customizado
    public static final RegistryObject<Item> VOID_GLASS_SOVEREIGN_BLADE = ITEMS.register("voidglass_sovereigns_blade",
            () -> new SwordItem(ModToolTiers.VOIDGLASS, 10, -2.4f,
                    new Item.Properties().fireResistant()));

    // Método para registrar os itens
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}