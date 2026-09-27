/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface UserRight {
    public static final int USERRIGHT_NONE = 0;
    public static final int USERRIGHT_MULTI_LOGIN = 1;
    public static final int USERRIGHT_VIEW_ALL_USERS = 2;
    public static final int USERRIGHT_CREATE_TEMPORARY_CHANNEL = 4;
    public static final int USERRIGHT_MODIFY_CHANNELS = 8;
    public static final int USERRIGHT_TEXTMESSAGE_BROADCAST = 16;
    public static final int USERRIGHT_KICK_USERS = 32;
    public static final int USERRIGHT_BAN_USERS = 64;
    public static final int USERRIGHT_MOVE_USERS = 128;
    public static final int USERRIGHT_OPERATOR_ENABLE = 256;
    public static final int USERRIGHT_UPLOAD_FILES = 512;
    public static final int USERRIGHT_DOWNLOAD_FILES = 1024;
    public static final int USERRIGHT_UPDATE_SERVERPROPERTIES = 2048;
    public static final int USERRIGHT_TRANSMIT_VOICE = 4096;
    public static final int USERRIGHT_TRANSMIT_VIDEOCAPTURE = 8192;
    public static final int USERRIGHT_TRANSMIT_DESKTOP = 16384;
    public static final int USERRIGHT_TRANSMIT_DESKTOPINPUT = 32768;
    public static final int USERRIGHT_TRANSMIT_MEDIAFILE_AUDIO = 65536;
    public static final int USERRIGHT_TRANSMIT_MEDIAFILE_VIDEO = 131072;
    public static final int USERRIGHT_TRANSMIT_MEDIAFILE = 196608;
    public static final int USERRIGHT_LOCKED_NICKNAME = 262144;
    public static final int USERRIGHT_LOCKED_STATUS = 524288;
    public static final int USERRIGHT_RECORD_VOICE = 0x100000;
    public static final int USERRIGHT_VIEW_HIDDEN_CHANNELS = 0x200000;
    public static final int USERRIGHT_TEXTMESSAGE_USER = 0x400000;
    public static final int USERRIGHT_TEXTMESSAGE_CHANNEL = 0x800000;
    public static final int USERRIGHT_ALL = -786433;
}

