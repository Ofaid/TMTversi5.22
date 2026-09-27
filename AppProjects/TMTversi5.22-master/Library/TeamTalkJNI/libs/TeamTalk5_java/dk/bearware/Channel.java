/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package dk.bearware;

import dk.bearware.AudioCodec;
import dk.bearware.AudioConfig;

public class Channel {
    public int nParentID = 0;
    public int nChannelID = 0;
    public String szName = "";
    public String szTopic = "";
    public String szPassword = "";
    public boolean bPassword = false;
    public int uChannelType = 0;
    public int nUserData = 0;
    public long nDiskQuota = 0L;
    public String szOpPassword = "";
    public int nMaxUsers = 0;
    public AudioCodec audiocodec = new AudioCodec();
    public AudioConfig audiocfg = new AudioConfig();
    public int[][] transmitUsers = new int[128][2];
    public int[] transmitUsersQueue = new int[16];
    public int nTransmitUsersQueueDelayMSec = 0;
    public int nTimeOutTimerVoiceMSec = 0;
    public int nTimeOutTimerMediaFileMSec = 0;

    public Channel() {
    }

    public Channel(boolean bl, boolean bl2) {
        this.audiocodec = new AudioCodec(bl);
        this.audiocfg = new AudioConfig(bl2);
    }
}

