package com.Marumasa.we_keymod.keybind;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.awt.event.KeyEvent;

@OnlyIn(Dist.CLIENT)
public class ModKeyBind {
    public static KeyBinding[] ModKeys;

    public static void register(final FMLClientSetupEvent event) {
        ModKeys = new KeyBinding[2];
        ModKeys[0] = crate("pos1", KeyEvent.VK_I);
        ModKeys[1] = crate("pos2", KeyEvent.VK_O);

        for (int loop = 0; loop < ModKeys.length; loop++) {
            ClientRegistry.registerKeyBinding(ModKeys[loop]);
        }
    }

    private static KeyBinding crate(String name, int key) {
        return new KeyBinding("key.we_keymod." + name, key, "key.category.we_keymod");
    }

}