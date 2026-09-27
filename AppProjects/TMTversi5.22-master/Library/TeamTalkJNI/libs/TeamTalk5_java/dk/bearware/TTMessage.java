/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

import dk.bearware.AudioInputProgress;
import dk.bearware.BannedUser;
import dk.bearware.Channel;
import dk.bearware.ClientErrorMsg;
import dk.bearware.DesktopInput;
import dk.bearware.FileTransfer;
import dk.bearware.MediaFileInfo;
import dk.bearware.RemoteFile;
import dk.bearware.ServerProperties;
import dk.bearware.ServerStatistics;
import dk.bearware.SoundDevice;
import dk.bearware.TextMessage;
import dk.bearware.User;
import dk.bearware.UserAccount;

public class TTMessage {
    public int nClientEvent;
    public int nSource;
    public int ttType;
    public Channel channel;
    public ClientErrorMsg clienterrormsg;
    public DesktopInput desktopinput;
    public FileTransfer filetransfer;
    public MediaFileInfo mediafileinfo;
    public RemoteFile remotefile;
    public ServerProperties serverproperties;
    public ServerStatistics serverstatistics;
    public TextMessage textmessage;
    public User user;
    public UserAccount useraccount;
    public BannedUser banneduser;
    public boolean bActive;
    public int nBytesRemain;
    public int nStreamID;
    public int nPayloadSize;
    public int nStreamType;
    public AudioInputProgress audioinputprogress;
    public SoundDevice sounddevice;
}

