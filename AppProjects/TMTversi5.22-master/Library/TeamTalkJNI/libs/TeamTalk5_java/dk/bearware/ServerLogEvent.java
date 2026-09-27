/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface ServerLogEvent {
    public static final int SERVERLOGEVENT_NONE = 0;
    public static final int SERVERLOGEVENT_USER_CONNECTED = 1;
    public static final int SERVERLOGEVENT_USER_DISCONNECTED = 2;
    public static final int SERVERLOGEVENT_USER_LOGGEDIN = 4;
    public static final int SERVERLOGEVENT_USER_LOGGEDOUT = 8;
    public static final int SERVERLOGEVENT_USER_LOGINFAILED = 16;
    public static final int SERVERLOGEVENT_USER_TIMEDOUT = 32;
    public static final int SERVERLOGEVENT_USER_KICKED = 64;
    public static final int SERVERLOGEVENT_USER_BANNED = 128;
    public static final int SERVERLOGEVENT_USER_UNBANNED = 256;
    public static final int SERVERLOGEVENT_USER_UPDATED = 512;
    public static final int SERVERLOGEVENT_USER_JOINEDCHANNEL = 1024;
    public static final int SERVERLOGEVENT_USER_LEFTCHANNEL = 2048;
    public static final int SERVERLOGEVENT_USER_MOVED = 4096;
    public static final int SERVERLOGEVENT_USER_TEXTMESSAGE_PRIVATE = 8192;
    public static final int SERVERLOGEVENT_USER_TEXTMESSAGE_CUSTOM = 16384;
    public static final int SERVERLOGEVENT_USER_TEXTMESSAGE_CHANNEL = 32768;
    public static final int SERVERLOGEVENT_USER_TEXTMESSAGE_BROADCAST = 65536;
    public static final int SERVERLOGEVENT_CHANNEL_CREATED = 131072;
    public static final int SERVERLOGEVENT_CHANNEL_UPDATED = 262144;
    public static final int SERVERLOGEVENT_CHANNEL_REMOVED = 524288;
    public static final int SERVERLOGEVENT_FILE_UPLOADED = 0x100000;
    public static final int SERVERLOGEVENT_FILE_DOWNLOADED = 0x200000;
    public static final int SERVERLOGEVENT_FILE_DELETED = 0x400000;
    public static final int SERVERLOGEVENT_SERVER_UPDATED = 0x800000;
    public static final int SERVERLOGEVENT_SERVER_SAVECONFIG = 0x1000000;
    public static final int SERVERLOGEVENT_DEFAULT = 0x1FFFFFF;
}

