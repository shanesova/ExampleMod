package com.example.examplemod.reference;

public class Reference {
    public static final String MOD_ID = "examplemod";
    public static final String LOWERCASE_MOD_ID = MOD_ID.toLowerCase();
    public static final String MOD_NAME = "Example Mod";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String MOD_VERSION = "@MOD_VERSION@";
    public static final String DEPENDENCIES = "required-after:forge@[12.18.3.2185,)";
    public static final String ACCEPTEDMINECRAFTVERSIONS = "[1.10.2,1.11]";
    public static final String SERVER_PROXY_CLASS = "com.example.examplemod.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.example.examplemod.proxy.ClientProxy";
    public static final String GUI_FACTORY_CLASS = "com.example.examplemod.client.gui.GuiFactory";
    public static final String UPDATE_URL = "https://raw.githubusercontent.com/shanesova/ExampleMod/master/update.json";
}
