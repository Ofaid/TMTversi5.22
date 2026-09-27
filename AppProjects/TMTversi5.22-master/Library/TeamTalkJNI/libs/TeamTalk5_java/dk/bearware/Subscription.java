/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface Subscription {
    public static final int SUBSCRIBE_NONE = 0;
    public static final int SUBSCRIBE_USER_MSG = 1;
    public static final int SUBSCRIBE_CHANNEL_MSG = 2;
    public static final int SUBSCRIBE_BROADCAST_MSG = 4;
    public static final int SUBSCRIBE_CUSTOM_MSG = 8;
    public static final int SUBSCRIBE_VOICE = 16;
    public static final int SUBSCRIBE_VIDEOCAPTURE = 32;
    public static final int SUBSCRIBE_DESKTOP = 64;
    public static final int SUBSCRIBE_DESKTOPINPUT = 128;
    public static final int SUBSCRIBE_MEDIAFILE = 256;
    public static final int SUBSCRIBE_INTERCEPT_USER_MSG = 65536;
    public static final int SUBSCRIBE_INTERCEPT_CHANNEL_MSG = 131072;
    public static final int SUBSCRIBE_INTERCEPT_CUSTOM_MSG = 524288;
    public static final int SUBSCRIBE_INTERCEPT_VOICE = 0x100000;
    public static final int SUBSCRIBE_INTERCEPT_VIDEOCAPTURE = 0x200000;
    public static final int SUBSCRIBE_INTERCEPT_DESKTOP = 0x400000;
    public static final int SUBSCRIBE_INTERCEPT_MEDIAFILE = 0x1000000;
}

