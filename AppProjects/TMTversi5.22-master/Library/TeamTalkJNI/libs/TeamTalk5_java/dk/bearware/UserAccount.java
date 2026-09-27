/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package dk.bearware;

import dk.bearware.AbusePrevention;

public class UserAccount {
    public String szUsername = "";
    public String szPassword = "";
    public int uUserType = 0;
    public int uUserRights = 0;
    public int nUserData = 0;
    public String szNote = "";
    public String szInitChannel = "";
    public int[] autoOperatorChannels = new int[16];
    public int nAudioCodecBpsLimit;
    public AbusePrevention abusePrevent = new AbusePrevention();
    public String szLastModified = "";
    public String szLastLoginTime = "";

    public void copy(UserAccount userAccount) {
        this.szUsername = userAccount.szUsername;
        this.szPassword = userAccount.szPassword;
        this.uUserType = userAccount.uUserType;
        this.uUserRights = userAccount.uUserRights;
        this.nUserData = userAccount.nUserData;
        this.szNote = userAccount.szNote;
        this.szInitChannel = userAccount.szInitChannel;
        this.autoOperatorChannels = (int[])userAccount.autoOperatorChannels.clone();
        this.nAudioCodecBpsLimit = userAccount.nAudioCodecBpsLimit;
        this.abusePrevent = userAccount.abusePrevent;
    }
}

