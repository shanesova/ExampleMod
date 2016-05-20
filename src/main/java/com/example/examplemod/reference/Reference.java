package com.example.examplemod.reference;

public class Reference {
    public static final String MOD_ID = "examplemod";
    public static final String LOWERCASE_MOD_ID = MOD_ID.toLowerCase();
    public static final String MOD_NAME = "Example Mod";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String MOD_VERSION = "@MOD_VERSION@";
    public static final String DEPENDENCIES = "required-after:Forge@[12.17.0.1909,)";
    public static final String SERVER_PROXY_CLASS = "com.example.examplemod.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.example.examplemod.proxy.ClientProxy";
    public static final String GUI_FACTORY_CLASS = "com.example.examplemod.client.gui.GuiFactory";
}
