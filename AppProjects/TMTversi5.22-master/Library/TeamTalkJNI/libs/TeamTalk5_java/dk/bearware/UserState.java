/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface UserState {
    public static final int USERSTATE_NONE = 0;
    public static final int USERSTATE_VOICE = 1;
    public static final int USERSTATE_MUTE_VOICE = 2;
    public static final int USERSTATE_MUTE_MEDIAFILE = 4;
    public static final int USERSTATE_DESKTOP = 8;
    public static final int USERSTATE_VIDEOCAPTURE = 16;
    public static final int USERSTATE_MEDIAFILE_AUDIO = 32;
    public static final int USERSTATE_MEDIAFILE_VIDEO = 64;
    public static final int USERSTATE_MEDIAFILE = 96;
}

