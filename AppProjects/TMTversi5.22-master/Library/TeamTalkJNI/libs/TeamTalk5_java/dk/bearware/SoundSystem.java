/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface SoundSystem {
    public static final int SOUNDSYSTEM_NONE = 0;
    public static final int SOUNDSYSTEM_WINMM = 1;
    public static final int SOUNDSYSTEM_DSOUND = 2;
    public static final int SOUNDSYSTEM_ALSA = 3;
    public static final int SOUNDSYSTEM_COREAUDIO = 4;
    public static final int SOUNDSYSTEM_WASAPI = 5;
    public static final int SOUNDSYSTEM_OPENSLES = 7;
    public static final int SOUNDSYSTEM_OPENSLES_ANDROID = 7;
    public static final int SOUNDSYSTEM_AUDIOUNIT = 8;
    public static final int SOUNDSYSTEM_AUDIOUNIT_IOS = 8;
    public static final int SOUNDSYSTEM_PULSEAUDIO = 10;
}

