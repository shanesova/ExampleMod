package com.example.examplemod.proxy;

import com.example.examplemod.hanlder.ConfigurationHandler;
import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy implements IProxy {

    public void registerEventHandlers() {
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());
    }
}
