/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware.events;

import dk.bearware.AudioInputProgress;
import dk.bearware.BannedUser;
import dk.bearware.Channel;
import dk.bearware.ClientErrorMsg;
import dk.bearware.DesktopInput;
import dk.bearware.FileTransfer;
import dk.bearware.MediaFileInfo;
import dk.bearware.RemoteFile;
import dk.bearware.ServerProperties;
import dk.bearware.SoundDevice;
import dk.bearware.TextMessage;
import dk.bearware.User;
import dk.bearware.UserAccount;

public interface ClientEventListener {

    public static interface OnSoundDeviceNewDefaultOutputComDeviceListener {
        public void onSoundDeviceNewDefaultOutputComDevice(SoundDevice var1);
    }

    public static interface OnSoundDeviceNewDefaultInputComDeviceListener {
        public void onSoundDeviceNewDefaultInputComDevice(SoundDevice var1);
    }

    public static interface OnSoundDeviceNewDefaultOutputListener {
        public void onSoundDeviceNewDefaultOutput(SoundDevice var1);
    }

    public static interface OnSoundDeviceNewDefaultInputListener {
        public void onSoundDeviceNewDefaultInput(SoundDevice var1);
    }

    public static interface OnSoundDeviceUnpluggedListener {
        public void onSoundDeviceUnplugged(SoundDevice var1);
    }

    public static interface OnSoundDeviceRemovedListener {
        public void onSoundDeviceRemoved(SoundDevice var1);
    }

    public static interface OnSoundDeviceAddedListener {
        public void onSoundDeviceAdded(SoundDevice var1);
    }

    public static interface OnAudioInputListener {
        public void onAudioInput(AudioInputProgress var1, int var2);
    }

    public static interface OnLocalMediaFileListener {
        public void onLocalMediaFile(MediaFileInfo var1);
    }

    public static interface OnStreamMediaFileListener {
        public void onStreamMediaFile(MediaFileInfo var1);
    }

    public static interface OnDesktopWindowTransferListener {
        public void onDesktopWindowTransfer(int var1, int var2);
    }

    public static interface OnFileTransferListener {
        public void onFileTransfer(FileTransfer var1);
    }

    public static interface OnHotKeyTestListener {
        public void onHotKeyTest(int var1, boolean var2);
    }

    public static interface OnHotKeyToggleListener {
        public void onHotKeyToggle(int var1, boolean var2);
    }

    public static interface OnVoiceActivationListener {
        public void onVoiceActivation(boolean var1);
    }

    public static interface OnInternalErrorListener {
        public void onInternalError(ClientErrorMsg var1);
    }

    public static interface OnUserFirstVoiceStreamPacketListener {
        public void onUserFirstVoiceStreamPacket(User var1, int var2);
    }

    public static interface OnUserAudioBlockListener {
        public void onUserAudioBlock(int var1, int var2);
    }

    public static interface OnUserRecordMediaFileListener {
        public void onUserRecordMediaFile(int var1, MediaFileInfo var2);
    }

    public static interface OnUserDesktopInputListener {
        public void onUserDesktopInput(int var1, DesktopInput var2);
    }

    public static interface OnUserDesktopCursorListener {
        public void onUserDesktopCursor(int var1, DesktopInput var2);
    }

    public static interface OnUserDesktopWindowListener {
        public void onUserDesktopWindow(int var1, int var2);
    }

    public static interface OnUserMediaFileVideoListener {
        public void onUserMediaFileVideo(int var1, int var2);
    }

    public static interface OnUserVideoCaptureListener {
        public void onUserVideoCapture(int var1, int var2);
    }

    public static interface OnUserStateChangeListener {
        public void onUserStateChange(User var1);
    }

    public static interface OnCmdUserAccountRemoveListener {
        public void onCmdUserAccountRemove(UserAccount var1);
    }

    public static interface OnCmdUserAccountNewListener {
        public void onCmdUserAccountNew(UserAccount var1);
    }

    public static interface OnCmdBannedUserListener {
        public void onCmdBannedUser(BannedUser var1);
    }

    public static interface OnCmdUserAccountListener {
        public void onCmdUserAccount(UserAccount var1);
    }

    public static interface OnCmdFileRemoveListener {
        public void onCmdFileRemove(RemoteFile var1);
    }

    public static interface OnCmdFileNewListener {
        public void onCmdFileNew(RemoteFile var1);
    }

    public static interface OnCmdServerUpdateListener {
        public void onCmdServerUpdate(ServerProperties var1);
    }

    public static interface OnCmdChannelRemoveListener {
        public void onCmdChannelRemove(Channel var1);
    }

    public static interface OnCmdChannelUpdateListener {
        public void onCmdChannelUpdate(Channel var1);
    }

    public static interface OnCmdChannelNewListener {
        public void onCmdChannelNew(Channel var1);
    }

    public static interface OnCmdUserTextMessageListener {
        public void onCmdUserTextMessage(TextMessage var1);
    }

    public static interface OnCmdUserLeftChannelListener {
        public void onCmdUserLeftChannel(int var1, User var2);
    }

    public static interface OnCmdUserJoinedChannelListener {
        public void onCmdUserJoinedChannel(User var1);
    }

    public static interface OnCmdUserUpdateListener {
        public void onCmdUserUpdate(User var1);
    }

    public static interface OnCmdUserLoggedOutListener {
        public void onCmdUserLoggedOut(User var1);
    }

    public static interface OnCmdUserLoggedInListener {
        public void onCmdUserLoggedIn(User var1);
    }

    public static interface OnCmdMyselfKickedFromChannelListener {
        public void onCmdMyselfKickedFromChannel();

        public void onCmdMyselfKickedFromChannel(User var1);
    }

    public static interface OnCmdMyselfLoggedOutListener {
        public void onCmdMyselfLoggedOut();
    }

    public static interface OnCmdMyselfLoggedInListener {
        public void onCmdMyselfLoggedIn(int var1, UserAccount var2);
    }

    public static interface OnCmdProcessingListener {
        public void onCmdProcessing(int var1, boolean var2);
    }

    public static interface OnCmdSuccessListener {
        public void onCmdSuccess(int var1);
    }

    public static interface OnCmdErrorListener {
        public void onCmdError(int var1, ClientErrorMsg var2);
    }

    public static interface OnMaxPayloadUpdateListener {
        public void onMaxPayloadUpdate(int var1);
    }

    public static interface OnConnectionLostListener {
        public void onConnectionLost();
    }

    public static interface OnConnectFailedListener {
        public void onConnectFailed();
    }

    public static interface OnEncryptionErrorListener {
        public void onEncryptionError(int var1, ClientErrorMsg var2);
    }

    public static interface OnConnectSuccessListener {
        public void onConnectSuccess();
    }
}

