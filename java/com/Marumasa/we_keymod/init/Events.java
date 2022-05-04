package com.Marumasa.we_keymod.init;

import com.Marumasa.we_keymod.keybind.ModKeyBind;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {
    @SubscribeEvent
    public void KeyInputEvent(InputEvent.KeyInputEvent event) {
        if (ModKeyBind.ModKeys[0].isDown()) {
            Minecraft.getInstance().player.chat("//pos1");
        }

        if (ModKeyBind.ModKeys[1].isDown()) {
            Minecraft.getInstance().player.chat("//pos2");
        }
    }
}
