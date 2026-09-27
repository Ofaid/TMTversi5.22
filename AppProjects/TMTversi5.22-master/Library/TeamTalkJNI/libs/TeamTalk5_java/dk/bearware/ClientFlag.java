/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface ClientFlag {
    public static final int CLIENT_CLOSED = 0;
    public static final int CLIENT_SNDINPUT_READY = 1;
    public static final int CLIENT_SNDOUTPUT_READY = 2;
    public static final int CLIENT_SNDINOUTPUT_DUPLEX = 4;
    public static final int CLIENT_SNDINPUT_VOICEACTIVATED = 8;
    public static final int CLIENT_SNDINPUT_VOICEACTIVE = 16;
    public static final int CLIENT_SNDOUTPUT_MUTE = 32;
    public static final int CLIENT_SNDOUTPUT_AUTO3DPOSITION = 64;
    public static final int CLIENT_VIDEOCAPTURE_READY = 128;
    public static final int CLIENT_TX_VOICE = 256;
    public static final int CLIENT_TX_VIDEOCAPTURE = 512;
    public static final int CLIENT_TX_DESKTOP = 1024;
    public static final int CLIENT_DESKTOP_ACTIVE = 2048;
    public static final int CLIENT_MUX_AUDIOFILE = 4096;
    public static final int CLIENT_CONNECTING = 8192;
    public static final int CLIENT_CONNECTED = 16384;
    public static final int CLIENT_CONNECTION = 24576;
    public static final int CLIENT_AUTHORIZED = 32768;
    public static final int CLIENT_STREAM_AUDIO = 65536;
    public static final int CLIENT_STREAM_VIDEO = 131072;
}

