/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.AutoCloseable
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Vector
 */
package dk.bearware;

import dk.bearware.AudioBlock;
import dk.bearware.AudioCodec;
import dk.bearware.AudioFormat;
import dk.bearware.AudioPreprocessor;
import dk.bearware.BannedUser;
import dk.bearware.Channel;
import dk.bearware.ClientKeepAlive;
import dk.bearware.ClientStatistics;
import dk.bearware.DesktopInput;
import dk.bearware.DesktopWindow;
import dk.bearware.EncryptionContext;
import dk.bearware.FileTransfer;
import dk.bearware.IntPtr;
import dk.bearware.MediaFileInfo;
import dk.bearware.MediaFilePlayback;
import dk.bearware.RemoteFile;
import dk.bearware.ServerProperties;
import dk.bearware.SoundDevice;
import dk.bearware.SoundDeviceEffects;
import dk.bearware.SpeexDSP;
import dk.bearware.TTMessage;
import dk.bearware.TextMessage;
import dk.bearware.User;
import dk.bearware.UserAccount;
import dk.bearware.UserStatistics;
import dk.bearware.VideoCaptureDevice;
import dk.bearware.VideoCodec;
import dk.bearware.VideoFormat;
import dk.bearware.VideoFrame;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public abstract class TeamTalkBase
implements AutoCloseable {
    private long ttInst = 0L;

    protected void finalize() throws Throwable {
        this.closeTeamTalk();
        this.ttInst = 0L;
        super.finalize();
    }

    public void close() throws Exception {
        this.closeTeamTalk();
        this.ttInst = 0L;
    }

    public static native String getVersion();

    private native long initTeamTalkPoll();

    protected TeamTalkBase(boolean bl) {
        if (bl) {
            this.ttInst = this.initTeamTalkPoll();
        }
    }

    public native boolean closeTeamTalk();

    public native boolean getMessage(TTMessage var1, int var2);

    public native boolean pumpMessage(int var1, int var2);

    public native int getFlags();

    public static native boolean setLicenseInformation(String var0, String var1);

    public static native boolean getDefaultSoundDevices(IntPtr var0, IntPtr var1);

    private static native boolean getSoundDevices(SoundDevice[] var0, IntPtr var1);

    public static boolean getSoundDevices(Vector<SoundDevice> vector) {
        IntPtr intPtr = new IntPtr();
        if (!TeamTalkBase.getSoundDevices(null, intPtr)) {
            return false;
        }
        Object[] objectArray = new SoundDevice[intPtr.value];
        if (TeamTalkBase.getSoundDevices((SoundDevice[])objectArray, intPtr)) {
            vector.addAll((Collection)Arrays.asList((Object[])objectArray).subList(0, intPtr.value));
        }
        return true;
    }

    public static native boolean restartSoundSystem();

    public static native long startSoundLoopbackTest(int var0, int var1, int var2, int var3, boolean var4, SpeexDSP var5);

    private static native long startSoundLoopbackTestEx(int var0, int var1, int var2, int var3, boolean var4, AudioPreprocessor var5, SoundDeviceEffects var6);

    public static long startSoundLoopbackTest(int n, int n2, int n3, int n4, boolean bl, AudioPreprocessor audioPreprocessor, SoundDeviceEffects soundDeviceEffects) {
        return TeamTalkBase.startSoundLoopbackTestEx(n, n2, n3, n4, bl, audioPreprocessor, soundDeviceEffects);
    }

    public static native boolean closeSoundLoopbackTest(long var0);

    public native boolean initSoundInputDevice(int var1);

    public static native boolean initSoundInputSharedDevice(int var0, int var1, int var2);

    public native boolean initSoundOutputDevice(int var1);

    public static native boolean initSoundOutputSharedDevice(int var0, int var1, int var2);

    public native boolean initSoundDuplexDevices(int var1, int var2);

    public native boolean closeSoundInputDevice();

    public native boolean closeSoundOutputDevice();

    public native boolean closeSoundDuplexDevices();

    public native boolean setSoundDeviceEffects(SoundDeviceEffects var1);

    public native boolean getSoundDeviceEffects(SoundDeviceEffects var1);

    public native int getSoundInputLevel();

    public native boolean setSoundInputGainLevel(int var1);

    public native int getSoundInputGainLevel();

    public native boolean setSoundInputPreprocess(SpeexDSP var1);

    public native boolean getSoundInputPreprocess(SpeexDSP var1);

    private native boolean setSoundInputPreprocessEx(AudioPreprocessor var1);

    public boolean setSoundInputPreprocess(AudioPreprocessor audioPreprocessor) {
        return this.setSoundInputPreprocessEx(audioPreprocessor);
    }

    private native boolean getSoundInputPreprocessEx(AudioPreprocessor var1);

    public boolean getSoundInputPreprocess(AudioPreprocessor audioPreprocessor) {
        return this.getSoundInputPreprocessEx(audioPreprocessor);
    }

    public native boolean setSoundOutputVolume(int var1);

    public native int getSoundOutputVolume();

    public native boolean setSoundOutputMute(boolean var1);

    public native boolean enable3DSoundPositioning(boolean var1);

    public native boolean autoPositionUsers();

    public native boolean enableAudioBlockEvent(int var1, int var2, boolean var3);

    private native boolean enableAudioBlockEventEx(int var1, int var2, AudioFormat var3, boolean var4);

    public boolean enableAudioBlockEvent(int n, int n2, AudioFormat audioFormat, boolean bl) {
        return this.enableAudioBlockEventEx(n, n2, audioFormat, bl);
    }

    public native boolean insertAudioBlock(AudioBlock var1);

    public native boolean enableVoiceTransmission(boolean var1);

    public native boolean enableVoiceActivation(boolean var1);

    public native boolean setVoiceActivationLevel(int var1);

    public native int getVoiceActivationLevel();

    public native boolean setVoiceActivationStopDelay(int var1);

    public native int getVoiceActivationStopDelay();

    public native boolean startRecordingMuxedAudioFile(AudioCodec var1, String var2, int var3);

    private native boolean startRecordingMuxedAudioFileEx(int var1, String var2, int var3);

    public boolean startRecordingMuxedAudioFile(int n, String string, int n2) {
        return this.startRecordingMuxedAudioFileEx(n, string, n2);
    }

    public native boolean startRecordingMuxedStreams(int var1, AudioCodec var2, String var3, int var4);

    public native boolean stopRecordingMuxedAudioFile();

    private native boolean stopRecordingMuxedAudioFileEx(int var1);

    public boolean stopRecordingMuxedAudioFile(int n) {
        return this.stopRecordingMuxedAudioFileEx(n);
    }

    public native boolean startVideoCaptureTransmission(VideoCodec var1);

    public native boolean stopVideoCaptureTransmission();

    private static native boolean getVideoCaptureDevices(VideoCaptureDevice[] var0, IntPtr var1);

    public static boolean getVideoCaptureDevices(Vector<VideoCaptureDevice> vector) {
        IntPtr intPtr = new IntPtr();
        if (!TeamTalkBase.getVideoCaptureDevices(null, intPtr)) {
            return false;
        }
        Object[] objectArray = new VideoCaptureDevice[intPtr.value];
        if (TeamTalkBase.getVideoCaptureDevices((VideoCaptureDevice[])objectArray, intPtr)) {
            vector.addAll((Collection)Arrays.asList((Object[])objectArray).subList(0, intPtr.value));
        }
        return true;
    }

    public native boolean initVideoCaptureDevice(String var1, VideoFormat var2);

    public native boolean closeVideoCaptureDevice();

    public native VideoFrame acquireUserVideoCaptureFrame(int var1);

    public native boolean startStreamingMediaFileToChannel(String var1, VideoCodec var2);

    private native boolean startStreamingMediaFileToChannelEx(String var1, MediaFilePlayback var2, VideoCodec var3);

    public boolean startStreamingMediaFileToChannel(String string, MediaFilePlayback mediaFilePlayback, VideoCodec videoCodec) {
        return this.startStreamingMediaFileToChannelEx(string, mediaFilePlayback, videoCodec);
    }

    public native boolean updateStreamingMediaFileToChannel(MediaFilePlayback var1, VideoCodec var2);

    public native boolean stopStreamingMediaFileToChannel();

    public native int initLocalPlayback(String var1, MediaFilePlayback var2);

    public native boolean updateLocalPlayback(int var1, MediaFilePlayback var2);

    public native boolean stopLocalPlayback(int var1);

    public static native boolean getMediaFileInfo(String var0, MediaFileInfo var1);

    public native VideoFrame acquireUserMediaVideoFrame(int var1);

    public native int sendDesktopWindow(DesktopWindow var1, int var2);

    public native boolean closeDesktopWindow();

    public native boolean sendDesktopCursorPosition(int var1, int var2);

    public native boolean sendDesktopInput(int var1, DesktopInput[] var2);

    public native DesktopWindow acquireUserDesktopWindow(int var1);

    public native DesktopWindow acquireUserDesktopWindowEx(int var1, int var2);

    public native boolean setEncryptionContext(EncryptionContext var1);

    public native boolean connect(String var1, int var2, int var3, int var4, int var5, boolean var6);

    public native boolean connectSysID(String var1, int var2, int var3, int var4, int var5, boolean var6, String var7);

    public native boolean connectEx(String var1, int var2, int var3, String var4, int var5, int var6, boolean var7);

    public native boolean disconnect();

    public native boolean queryMaxPayload(int var1);

    public native boolean getClientStatistics(ClientStatistics var1);

    public native boolean setClientKeepAlive(ClientKeepAlive var1);

    public native boolean getClientKeepAlive(ClientKeepAlive var1);

    public native int doPing();

    public native int doLogin(String var1, String var2, String var3);

    public native int doLoginEx(String var1, String var2, String var3, String var4);

    public native int doLogout();

    public native int doJoinChannel(Channel var1);

    public native int doJoinChannelByID(int var1, String var2);

    public native int doLeaveChannel();

    public native int doChangeNickname(String var1);

    public native int doChangeStatus(int var1, String var2);

    public native int doTextMessage(TextMessage var1);

    public native int doChannelOp(int var1, int var2, boolean var3);

    public native int doChannelOpEx(int var1, int var2, String var3, boolean var4);

    public native int doKickUser(int var1, int var2);

    public native int doSendFile(int var1, String var2);

    public native int doRecvFile(int var1, int var2, String var3);

    public native int doDeleteFile(int var1, int var2);

    public native int doSubscribe(int var1, int var2);

    public native int doUnsubscribe(int var1, int var2);

    public native int doMakeChannel(Channel var1);

    public native int doUpdateChannel(Channel var1);

    public native int doRemoveChannel(int var1);

    public native int doMoveUser(int var1, int var2);

    public native int doUpdateServer(ServerProperties var1);

    public native int doListUserAccounts(int var1, int var2);

    public native int doNewUserAccount(UserAccount var1);

    public native int doDeleteUserAccount(String var1);

    public native int doBanUser(int var1, int var2);

    public native int doBanUserEx(int var1, int var2);

    public native int doBan(BannedUser var1);

    public native int doBanIPAddress(String var1, int var2);

    public native int doUnBanUser(String var1, int var2);

    public native int doUnBanUserEx(BannedUser var1);

    public native int doListBans(int var1, int var2, int var3);

    public native int doSaveConfig();

    public native int doQueryServerStats();

    public native int doQuit();

    public native boolean getServerProperties(ServerProperties var1);

    public native boolean getServerUsers(User[] var1, IntPtr var2);

    public native int getRootChannelID();

    public native int getMyChannelID();

    public native boolean getChannel(int var1, Channel var2);

    public native String getChannelPath(int var1);

    public native int getChannelIDFromPath(String var1);

    public native boolean getChannelUsers(int var1, User[] var2, IntPtr var3);

    public native boolean getChannelFiles(int var1, RemoteFile[] var2, IntPtr var3);

    public native boolean getChannelFile(int var1, int var2, RemoteFile var3);

    public native boolean isChannelOperator(int var1, int var2);

    public native boolean getServerChannels(Channel[] var1, IntPtr var2);

    public native int getMyUserID();

    public native boolean getMyUserAccount(UserAccount var1);

    public native boolean getUser(int var1, User var2);

    public native boolean getUserStatistics(int var1, UserStatistics var2);

    public native boolean setUserVolume(int var1, int var2, int var3);

    public native boolean setUserMute(int var1, int var2, boolean var3);

    public native boolean setUserStoppedPlaybackDelay(int var1, int var2, int var3);

    public native boolean setUserPosition(int var1, int var2, float var3, float var4, float var5);

    public native boolean setUserStereo(int var1, int var2, boolean var3, boolean var4);

    public native boolean setUserMediaStorageDir(int var1, String var2, String var3, int var4);

    public native boolean setUserAudioStreamBufferSize(int var1, int var2, int var3);

    public native AudioBlock acquireUserAudioBlock(int var1, int var2);

    public native boolean getFileTransferInfo(int var1, FileTransfer var2);

    public native boolean cancelFileTransfer(int var1);

    public static native String getErrorMessage(int var0);

    public native boolean DBG_SetSoundInputTone(int var1, int var2);

    public static native boolean DBG_WriteAudioFileTone(MediaFileInfo var0, int var1);
}

