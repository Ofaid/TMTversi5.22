/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public interface ClientEvent {
    public static final int CLIENTEVENT_NONE = 0;
    public static final int CLIENTEVENT_CON_SUCCESS = 10;
    public static final int CLIENTEVENT_CON_CRYPT_ERROR = 15;
    public static final int CLIENTEVENT_CON_FAILED = 20;
    public static final int CLIENTEVENT_CON_LOST = 30;
    public static final int CLIENTEVENT_CON_MAX_PAYLOAD_UPDATED = 40;
    public static final int CLIENTEVENT_CMD_PROCESSING = 200;
    public static final int CLIENTEVENT_CMD_ERROR = 210;
    public static final int CLIENTEVENT_CMD_SUCCESS = 220;
    public static final int CLIENTEVENT_CMD_MYSELF_LOGGEDIN = 230;
    public static final int CLIENTEVENT_CMD_MYSELF_LOGGEDOUT = 240;
    public static final int CLIENTEVENT_CMD_MYSELF_KICKED = 250;
    public static final int CLIENTEVENT_CMD_USER_LOGGEDIN = 260;
    public static final int CLIENTEVENT_CMD_USER_LOGGEDOUT = 270;
    public static final int CLIENTEVENT_CMD_USER_UPDATE = 280;
    public static final int CLIENTEVENT_CMD_USER_JOINED = 290;
    public static final int CLIENTEVENT_CMD_USER_LEFT = 300;
    public static final int CLIENTEVENT_CMD_USER_TEXTMSG = 310;
    public static final int CLIENTEVENT_CMD_CHANNEL_NEW = 320;
    public static final int CLIENTEVENT_CMD_CHANNEL_UPDATE = 330;
    public static final int CLIENTEVENT_CMD_CHANNEL_REMOVE = 340;
    public static final int CLIENTEVENT_CMD_SERVER_UPDATE = 350;
    public static final int CLIENTEVENT_CMD_SERVERSTATISTICS = 360;
    public static final int CLIENTEVENT_CMD_FILE_NEW = 370;
    public static final int CLIENTEVENT_CMD_FILE_REMOVE = 380;
    public static final int CLIENTEVENT_CMD_USERACCOUNT = 390;
    public static final int CLIENTEVENT_CMD_BANNEDUSER = 400;
    public static final int CLIENTEVENT_CMD_USERACCOUNT_NEW = 410;
    public static final int CLIENTEVENT_CMD_USERACCOUNT_REMOVE = 420;
    public static final int CLIENTEVENT_USER_STATECHANGE = 500;
    public static final int CLIENTEVENT_USER_VIDEOCAPTURE = 510;
    public static final int CLIENTEVENT_USER_MEDIAFILE_VIDEO = 520;
    public static final int CLIENTEVENT_USER_DESKTOPWINDOW = 530;
    public static final int CLIENTEVENT_USER_DESKTOPCURSOR = 540;
    public static final int CLIENTEVENT_USER_DESKTOPINPUT = 550;
    public static final int CLIENTEVENT_USER_RECORD_MEDIAFILE = 560;
    public static final int CLIENTEVENT_USER_AUDIOBLOCK = 570;
    public static final int CLIENTEVENT_INTERNAL_ERROR = 1000;
    public static final int CLIENTEVENT_VOICE_ACTIVATION = 1010;
    public static final int CLIENTEVENT_HOTKEY = 1020;
    public static final int CLIENTEVENT_HOTKEY_TEST = 1030;
    public static final int CLIENTEVENT_FILETRANSFER = 1040;
    public static final int CLIENTEVENT_DESKTOPWINDOW_TRANSFER = 1050;
    public static final int CLIENTEVENT_STREAM_MEDIAFILE = 1060;
    public static final int CLIENTEVENT_LOCAL_MEDIAFILE = 1070;
    public static final int CLIENTEVENT_AUDIOINPUT = 1080;
    public static final int CLIENTEVENT_USER_FIRSTVOICESTREAMPACKET = 1090;
    public static final int CLIENTEVENT_SOUNDDEVICE_ADDED = 1100;
    public static final int CLIENTEVENT_SOUNDDEVICE_REMOVED = 1110;
    public static final int CLIENTEVENT_SOUNDDEVICE_UNPLUGGED = 1120;
    public static final int CLIENTEVENT_SOUNDDEVICE_NEW_DEFAULT_INPUT = 1130;
    public static final int CLIENTEVENT_SOUNDDEVICE_NEW_DEFAULT_OUTPUT = 1140;
    public static final int CLIENTEVENT_SOUNDDEVICE_NEW_DEFAULT_INPUT_COMDEVICE = 1150;
    public static final int CLIENTEVENT_SOUNDDEVICE_NEW_DEFAULT_OUTPUT_COMDEVICE = 1160;
}

