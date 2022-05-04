package com.Marumasa.we_keymod.main;

import com.Marumasa.we_keymod.init.Events;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


@Mod("we_keymod")
public class WE_KeyMod {
    public static final String MOD_ID = "we_keymod";
    public WE_KeyMod(){
        MinecraftForge.EVENT_BUS.register((new Events()));
    }
}
