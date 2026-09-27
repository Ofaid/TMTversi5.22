/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface StreamType {
    public static final int STREAMTYPE_NONE = 0;
    public static final int STREAMTYPE_VOICE = 1;
    public static final int STREAMTYPE_VIDEOCAPTURE = 2;
    public static final int STREAMTYPE_MEDIAFILE_AUDIO = 4;
    public static final int STREAMTYPE_MEDIAFILE_VIDEO = 8;
    public static final int STREAMTYPE_DESKTOP = 16;
    public static final int STREAMTYPE_DESKTOPINPUT = 32;
    public static final int STREAMTYPE_MEDIAFILE = 12;
    public static final int STREAMTYPE_CHANNELMSG = 64;
    public static final int STREAMTYPE_LOCALMEDIAPLAYBACK_AUDIO = 128;
    public static final int STREAMTYPE_CLASSROOM_ALL = 95;
}

