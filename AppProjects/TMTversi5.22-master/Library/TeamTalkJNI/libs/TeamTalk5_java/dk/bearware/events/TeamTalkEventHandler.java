/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Vector
 */
package dk.bearware.events;

import dk.bearware.TTMessage;
import dk.bearware.TeamTalkBase;
import dk.bearware.TextMessage;
import dk.bearware.User;
import dk.bearware.events.ClientEventListener;
import dk.bearware.events.ClientListener;
import dk.bearware.events.CommandListener;
import dk.bearware.events.ConnectionListener;
import dk.bearware.events.UserListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class TeamTalkEventHandler {
    Map<Integer, Vector<ProcessTTMessage>> listeners = new HashMap();

    private Vector<ProcessTTMessage> get(int n) {
        Vector vector = (Vector)this.listeners.get((Object)n);
        if (vector == null) {
            vector = new Vector();
            this.listeners.put((Object)n, (Object)vector);
        }
        return vector;
    }

    private Vector<ProcessTTMessage> remove(int n, Object object) {
        Vector<ProcessTTMessage> vector = this.get(n);
        int n2 = 0;
        while (n2 < vector.size()) {
            if (((ProcessTTMessage)vector.get((int)n2)).o == object) {
                vector.remove(n2);
                continue;
            }
            ++n2;
        }
        return vector;
    }

    private void register(int n, Object object, boolean bl, ProcessTTMessage processTTMessage) {
        Vector<ProcessTTMessage> vector = this.remove(n, object);
        if (bl) {
            vector.add((Object)processTTMessage);
        }
    }

    public void unregisterListener(Object object) {
        Iterator iterator = this.listeners.keySet().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            this.remove(n, object);
        }
    }

    @Deprecated
    public void addConnectionListener(ConnectionListener connectionListener) {
        this.registerOnConnectSuccessListener(connectionListener, true);
        this.registerOnEncryptionErrorListener(connectionListener, true);
        this.registerOnConnectFailedListener(connectionListener, true);
        this.registerOnConnectionLostListener(connectionListener, true);
        this.registerOnMaxPayloadUpdateListener(connectionListener, true);
    }

    @Deprecated
    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.registerOnConnectSuccessListener(connectionListener, false);
        this.registerOnEncryptionErrorListener(connectionListener, false);
        this.registerOnConnectFailedListener(connectionListener, false);
        this.registerOnConnectionLostListener(connectionListener, false);
        this.registerOnMaxPayloadUpdateListener(connectionListener, false);
    }

    public void registerOnConnectSuccessListener(final ClientEventListener.OnConnectSuccessListener onConnectSuccessListener, boolean bl) {
        this.register(10, onConnectSuccessListener, bl, new ProcessTTMessage(this, onConnectSuccessListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onConnectSuccessListener.onConnectSuccess();
            }
        });
    }

    public void registerOnEncryptionErrorListener(final ClientEventListener.OnEncryptionErrorListener onEncryptionErrorListener, boolean bl) {
        this.register(15, onEncryptionErrorListener, bl, new ProcessTTMessage(this, onEncryptionErrorListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onEncryptionErrorListener.onEncryptionError(tTMessage.nSource, tTMessage.clienterrormsg);
            }
        });
    }

    public void registerOnConnectFailedListener(final ClientEventListener.OnConnectFailedListener onConnectFailedListener, boolean bl) {
        this.register(20, onConnectFailedListener, bl, new ProcessTTMessage(this, onConnectFailedListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onConnectFailedListener.onConnectFailed();
            }
        });
    }

    public void registerOnConnectionLostListener(final ClientEventListener.OnConnectionLostListener onConnectionLostListener, boolean bl) {
        this.register(30, onConnectionLostListener, bl, new ProcessTTMessage(this, onConnectionLostListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onConnectionLostListener.onConnectionLost();
            }
        });
    }

    public void registerOnMaxPayloadUpdateListener(final ClientEventListener.OnMaxPayloadUpdateListener onMaxPayloadUpdateListener, boolean bl) {
        this.register(40, onMaxPayloadUpdateListener, bl, new ProcessTTMessage(this, onMaxPayloadUpdateListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onMaxPayloadUpdateListener.onMaxPayloadUpdate(tTMessage.nPayloadSize);
            }
        });
    }

    @Deprecated
    public void addCommandListener(CommandListener commandListener) {
        this.registerOnCmdProcessing(commandListener, true);
        this.registerOnCmdError(commandListener, true);
        this.registerOnCmdSuccess(commandListener, true);
        this.registerOnCmdMyselfLoggedIn(commandListener, true);
        this.registerOnCmdMyselfLoggedOut(commandListener, true);
        this.registerOnCmdMyselfKickedFromChannel(commandListener, true);
        this.registerOnCmdUserLoggedIn(commandListener, true);
        this.registerOnCmdUserLoggedOut(commandListener, true);
        this.registerOnCmdUserUpdate(commandListener, true);
        this.registerOnCmdUserJoinedChannel(commandListener, true);
        this.registerOnCmdUserLeftChannel(commandListener, true);
        this.registerOnCmdUserTextMessage(commandListener, true);
        this.registerOnCmdChannelNew(commandListener, true);
        this.registerOnCmdChannelUpdate(commandListener, true);
        this.registerOnCmdChannelRemove(commandListener, true);
        this.registerOnCmdServerUpdate(commandListener, true);
        this.registerOnCmdFileNew(commandListener, true);
        this.registerOnCmdFileRemove(commandListener, true);
        this.registerOnCmdUserAccount(commandListener, true);
        this.registerOnCmdUserAccountNew(commandListener, true);
        this.registerOnCmdUserAccountRemove(commandListener, true);
        this.registerOnCmdBannedUser(commandListener, true);
    }

    @Deprecated
    public void removeCommandListener(CommandListener commandListener) {
        this.registerOnCmdProcessing(commandListener, false);
        this.registerOnCmdError(commandListener, false);
        this.registerOnCmdSuccess(commandListener, false);
        this.registerOnCmdMyselfLoggedIn(commandListener, false);
        this.registerOnCmdMyselfLoggedOut(commandListener, false);
        this.registerOnCmdMyselfKickedFromChannel(commandListener, false);
        this.registerOnCmdUserLoggedIn(commandListener, false);
        this.registerOnCmdUserLoggedOut(commandListener, false);
        this.registerOnCmdUserUpdate(commandListener, false);
        this.registerOnCmdUserJoinedChannel(commandListener, false);
        this.registerOnCmdUserLeftChannel(commandListener, false);
        this.registerOnCmdUserTextMessage(commandListener, false);
        this.registerOnCmdChannelNew(commandListener, false);
        this.registerOnCmdChannelUpdate(commandListener, false);
        this.registerOnCmdChannelRemove(commandListener, false);
        this.registerOnCmdServerUpdate(commandListener, false);
        this.registerOnCmdFileNew(commandListener, false);
        this.registerOnCmdFileRemove(commandListener, false);
        this.registerOnCmdUserAccount(commandListener, false);
        this.registerOnCmdUserAccountNew(commandListener, false);
        this.registerOnCmdUserAccountRemove(commandListener, false);
        this.registerOnCmdBannedUser(commandListener, false);
    }

    public void registerOnCmdProcessing(final ClientEventListener.OnCmdProcessingListener onCmdProcessingListener, boolean bl) {
        this.register(200, onCmdProcessingListener, bl, new ProcessTTMessage(this, onCmdProcessingListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 29);
                onCmdProcessingListener.onCmdProcessing(tTMessage.nSource, !tTMessage.bActive);
            }
        });
    }

    public void registerOnCmdError(final ClientEventListener.OnCmdErrorListener onCmdErrorListener, boolean bl) {
        this.register(210, onCmdErrorListener, bl, new ProcessTTMessage(this, onCmdErrorListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 28);
                onCmdErrorListener.onCmdError(tTMessage.nSource, tTMessage.clienterrormsg);
            }
        });
    }

    public void registerOnCmdSuccess(final ClientEventListener.OnCmdSuccessListener onCmdSuccessListener, boolean bl) {
        this.register(220, onCmdSuccessListener, bl, new ProcessTTMessage(this, onCmdSuccessListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onCmdSuccessListener.onCmdSuccess(tTMessage.nSource);
            }
        });
    }

    public void registerOnCmdMyselfLoggedIn(final ClientEventListener.OnCmdMyselfLoggedInListener onCmdMyselfLoggedInListener, boolean bl) {
        this.register(230, onCmdMyselfLoggedInListener, bl, new ProcessTTMessage(this, onCmdMyselfLoggedInListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 18);
                onCmdMyselfLoggedInListener.onCmdMyselfLoggedIn(tTMessage.nSource, tTMessage.useraccount);
            }
        });
    }

    public void registerOnCmdMyselfLoggedOut(final ClientEventListener.OnCmdMyselfLoggedOutListener onCmdMyselfLoggedOutListener, boolean bl) {
        this.register(240, onCmdMyselfLoggedOutListener, bl, new ProcessTTMessage(this, onCmdMyselfLoggedOutListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                onCmdMyselfLoggedOutListener.onCmdMyselfLoggedOut();
            }
        });
    }

    public void registerOnCmdMyselfKickedFromChannel(final ClientEventListener.OnCmdMyselfKickedFromChannelListener onCmdMyselfKickedFromChannelListener, boolean bl) {
        this.register(250, onCmdMyselfKickedFromChannelListener, bl, new ProcessTTMessage(this, onCmdMyselfKickedFromChannelListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                if (tTMessage.ttType == 0) {
                    onCmdMyselfKickedFromChannelListener.onCmdMyselfKickedFromChannel();
                } else if (tTMessage.ttType == 17) {
                    onCmdMyselfKickedFromChannelListener.onCmdMyselfKickedFromChannel(tTMessage.user);
                }
            }
        });
    }

    public void registerOnCmdUserLoggedIn(final ClientEventListener.OnCmdUserLoggedInListener onCmdUserLoggedInListener, boolean bl) {
        this.register(260, onCmdUserLoggedInListener, bl, new ProcessTTMessage(this, onCmdUserLoggedInListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                User user = tTMessage.user;
                onCmdUserLoggedInListener.onCmdUserLoggedIn(user);
            }
        });
    }

    public void registerOnCmdUserLoggedOut(final ClientEventListener.OnCmdUserLoggedOutListener onCmdUserLoggedOutListener, boolean bl) {
        this.register(270, onCmdUserLoggedOutListener, bl, new ProcessTTMessage(this, onCmdUserLoggedOutListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                User user = tTMessage.user;
                onCmdUserLoggedOutListener.onCmdUserLoggedOut(user);
            }
        });
    }

    public void registerOnCmdUserUpdate(final ClientEventListener.OnCmdUserUpdateListener onCmdUserUpdateListener, boolean bl) {
        this.register(280, onCmdUserUpdateListener, bl, new ProcessTTMessage(this, onCmdUserUpdateListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                User user = tTMessage.user;
                onCmdUserUpdateListener.onCmdUserUpdate(user);
            }
        });
    }

    public void registerOnCmdUserJoinedChannel(final ClientEventListener.OnCmdUserJoinedChannelListener onCmdUserJoinedChannelListener, boolean bl) {
        this.register(290, onCmdUserJoinedChannelListener, bl, new ProcessTTMessage(this, onCmdUserJoinedChannelListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                User user = tTMessage.user;
                onCmdUserJoinedChannelListener.onCmdUserJoinedChannel(user);
            }
        });
    }

    public void registerOnCmdUserLeftChannel(final ClientEventListener.OnCmdUserLeftChannelListener onCmdUserLeftChannelListener, boolean bl) {
        this.register(300, onCmdUserLeftChannelListener, bl, new ProcessTTMessage(this, onCmdUserLeftChannelListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                User user = tTMessage.user;
                onCmdUserLeftChannelListener.onCmdUserLeftChannel(tTMessage.nSource, user);
            }
        });
    }

    public void registerOnCmdUserTextMessage(final ClientEventListener.OnCmdUserTextMessageListener onCmdUserTextMessageListener, boolean bl) {
        this.register(310, onCmdUserTextMessageListener, bl, new ProcessTTMessage(this, onCmdUserTextMessageListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 14);
                TextMessage textMessage = tTMessage.textmessage;
                onCmdUserTextMessageListener.onCmdUserTextMessage(textMessage);
            }
        });
    }

    public void registerOnCmdChannelNew(final ClientEventListener.OnCmdChannelNewListener onCmdChannelNewListener, boolean bl) {
        this.register(320, onCmdChannelNewListener, bl, new ProcessTTMessage(this, onCmdChannelNewListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 5);
                onCmdChannelNewListener.onCmdChannelNew(tTMessage.channel);
            }
        });
    }

    public void registerOnCmdChannelUpdate(final ClientEventListener.OnCmdChannelUpdateListener onCmdChannelUpdateListener, boolean bl) {
        this.register(330, onCmdChannelUpdateListener, bl, new ProcessTTMessage(this, onCmdChannelUpdateListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 5);
                onCmdChannelUpdateListener.onCmdChannelUpdate(tTMessage.channel);
            }
        });
    }

    public void registerOnCmdChannelRemove(final ClientEventListener.OnCmdChannelRemoveListener onCmdChannelRemoveListener, boolean bl) {
        this.register(340, onCmdChannelRemoveListener, bl, new ProcessTTMessage(this, onCmdChannelRemoveListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 5);
                onCmdChannelRemoveListener.onCmdChannelRemove(tTMessage.channel);
            }
        });
    }

    public void registerOnCmdServerUpdate(final ClientEventListener.OnCmdServerUpdateListener onCmdServerUpdateListener, boolean bl) {
        this.register(350, onCmdServerUpdateListener, bl, new ProcessTTMessage(this, onCmdServerUpdateListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 10);
                onCmdServerUpdateListener.onCmdServerUpdate(tTMessage.serverproperties);
            }
        });
    }

    public void registerOnCmdFileNew(final ClientEventListener.OnCmdFileNewListener onCmdFileNewListener, boolean bl) {
        this.register(370, onCmdFileNewListener, bl, new ProcessTTMessage(this, onCmdFileNewListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 7);
                onCmdFileNewListener.onCmdFileNew(tTMessage.remotefile);
            }
        });
    }

    public void registerOnCmdFileRemove(final ClientEventListener.OnCmdFileRemoveListener onCmdFileRemoveListener, boolean bl) {
        this.register(380, onCmdFileRemoveListener, bl, new ProcessTTMessage(this, onCmdFileRemoveListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 7);
                onCmdFileRemoveListener.onCmdFileRemove(tTMessage.remotefile);
            }
        });
    }

    public void registerOnCmdUserAccount(final ClientEventListener.OnCmdUserAccountListener onCmdUserAccountListener, boolean bl) {
        this.register(390, onCmdUserAccountListener, bl, new ProcessTTMessage(this, onCmdUserAccountListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 18);
                onCmdUserAccountListener.onCmdUserAccount(tTMessage.useraccount);
            }
        });
    }

    public void registerOnCmdUserAccountNew(final ClientEventListener.OnCmdUserAccountNewListener onCmdUserAccountNewListener, boolean bl) {
        this.register(410, onCmdUserAccountNewListener, bl, new ProcessTTMessage(this, onCmdUserAccountNewListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 18);
                onCmdUserAccountNewListener.onCmdUserAccountNew(tTMessage.useraccount);
            }
        });
    }

    public void registerOnCmdUserAccountRemove(final ClientEventListener.OnCmdUserAccountRemoveListener onCmdUserAccountRemoveListener, boolean bl) {
        this.register(420, onCmdUserAccountRemoveListener, bl, new ProcessTTMessage(this, onCmdUserAccountRemoveListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 18);
                onCmdUserAccountRemoveListener.onCmdUserAccountRemove(tTMessage.useraccount);
            }
        });
    }

    public void registerOnCmdBannedUser(final ClientEventListener.OnCmdBannedUserListener onCmdBannedUserListener, boolean bl) {
        this.register(400, onCmdBannedUserListener, bl, new ProcessTTMessage(this, onCmdBannedUserListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 2);
                onCmdBannedUserListener.onCmdBannedUser(tTMessage.banneduser);
            }
        });
    }

    @Deprecated
    public void addUserListener(UserListener userListener) {
        this.registerOnUserStateChange(userListener, true);
        this.registerOnUserVideoCapture(userListener, true);
        this.registerOnUserMediaFileVideo(userListener, true);
        this.registerOnUserDesktopWindow(userListener, true);
        this.registerOnUserDesktopCursor(userListener, true);
        this.registerOnUserDesktopInput(userListener, true);
        this.registerOnUserRecordMediaFile(userListener, true);
        this.registerOnUserAudioBlock(userListener, true);
        this.registerOnUserFirstVoiceStreamPacket(userListener, true);
    }

    @Deprecated
    public void removeUserListener(UserListener userListener) {
        this.registerOnUserStateChange(userListener, false);
        this.registerOnUserVideoCapture(userListener, false);
        this.registerOnUserMediaFileVideo(userListener, false);
        this.registerOnUserDesktopWindow(userListener, false);
        this.registerOnUserDesktopCursor(userListener, false);
        this.registerOnUserDesktopInput(userListener, false);
        this.registerOnUserRecordMediaFile(userListener, false);
        this.registerOnUserAudioBlock(userListener, false);
        this.registerOnUserFirstVoiceStreamPacket(userListener, false);
    }

    public void registerOnUserStateChange(final ClientEventListener.OnUserStateChangeListener onUserStateChangeListener, boolean bl) {
        this.register(500, onUserStateChangeListener, bl, new ProcessTTMessage(this, onUserStateChangeListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                onUserStateChangeListener.onUserStateChange(tTMessage.user);
            }
        });
    }

    public void registerOnUserVideoCapture(final ClientEventListener.OnUserVideoCaptureListener onUserVideoCaptureListener, boolean bl) {
        this.register(510, onUserVideoCaptureListener, bl, new ProcessTTMessage(this, onUserVideoCaptureListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 30);
                int n = tTMessage.nSource;
                int n2 = tTMessage.nStreamID;
                onUserVideoCaptureListener.onUserVideoCapture(n, n2);
            }
        });
    }

    public void registerOnUserMediaFileVideo(final ClientEventListener.OnUserMediaFileVideoListener onUserMediaFileVideoListener, boolean bl) {
        this.register(520, onUserMediaFileVideoListener, bl, new ProcessTTMessage(this, onUserMediaFileVideoListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 30);
                int n = tTMessage.nSource;
                int n2 = tTMessage.nStreamID;
                onUserMediaFileVideoListener.onUserMediaFileVideo(n, n2);
            }
        });
    }

    public void registerOnUserDesktopWindow(final ClientEventListener.OnUserDesktopWindowListener onUserDesktopWindowListener, boolean bl) {
        this.register(530, onUserDesktopWindowListener, bl, new ProcessTTMessage(this, onUserDesktopWindowListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 30);
                int n = tTMessage.nSource;
                int n2 = tTMessage.nStreamID;
                onUserDesktopWindowListener.onUserDesktopWindow(n, n2);
            }
        });
    }

    public void registerOnUserDesktopCursor(final ClientEventListener.OnUserDesktopCursorListener onUserDesktopCursorListener, boolean bl) {
        this.register(540, onUserDesktopCursorListener, bl, new ProcessTTMessage(this, onUserDesktopCursorListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 31);
                int n = tTMessage.nSource;
                onUserDesktopCursorListener.onUserDesktopCursor(n, tTMessage.desktopinput);
            }
        });
    }

    public void registerOnUserDesktopInput(final ClientEventListener.OnUserDesktopInputListener onUserDesktopInputListener, boolean bl) {
        this.register(550, onUserDesktopInputListener, bl, new ProcessTTMessage(this, onUserDesktopInputListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 31);
                int n = tTMessage.nSource;
                onUserDesktopInputListener.onUserDesktopInput(n, tTMessage.desktopinput);
            }
        });
    }

    public void registerOnUserRecordMediaFile(final ClientEventListener.OnUserRecordMediaFileListener onUserRecordMediaFileListener, boolean bl) {
        this.register(560, onUserRecordMediaFileListener, bl, new ProcessTTMessage(this, onUserRecordMediaFileListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 0);
                int n = tTMessage.nSource;
                onUserRecordMediaFileListener.onUserRecordMediaFile(n, tTMessage.mediafileinfo);
            }
        });
    }

    public void registerOnUserAudioBlock(final ClientEventListener.OnUserAudioBlockListener onUserAudioBlockListener, boolean bl) {
        this.register(570, onUserAudioBlockListener, bl, new ProcessTTMessage(this, onUserAudioBlockListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 33);
                int n = tTMessage.nSource;
                onUserAudioBlockListener.onUserAudioBlock(n, tTMessage.nStreamType);
            }
        });
    }

    public void registerOnUserFirstVoiceStreamPacket(final ClientEventListener.OnUserFirstVoiceStreamPacketListener onUserFirstVoiceStreamPacketListener, boolean bl) {
        this.register(1090, onUserFirstVoiceStreamPacketListener, bl, new ProcessTTMessage(this, onUserFirstVoiceStreamPacketListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 17);
                User user = tTMessage.user;
                onUserFirstVoiceStreamPacketListener.onUserFirstVoiceStreamPacket(user, tTMessage.nSource);
            }
        });
    }

    @Deprecated
    public void addClientListener(ClientListener clientListener) {
        this.registerOnInternalError(clientListener, true);
        this.registerOnVoiceActivation(clientListener, true);
        this.registerOnHotKeyToggle(clientListener, true);
        this.registerOnHotKeyTest(clientListener, true);
        this.registerOnFileTransfer(clientListener, true);
        this.registerOnDesktopWindowTransfer(clientListener, true);
        this.registerOnStreamMediaFile(clientListener, true);
        this.registerOnLocalMediaFile(clientListener, true);
        this.registerOnAudioInput(clientListener, true);
        this.registerOnSoundDeviceAdded(clientListener, true);
        this.registerOnSoundDeviceRemoved(clientListener, true);
        this.registerOnSoundDeviceUnplugged(clientListener, true);
        this.registerOnSoundDeviceNewDefaultInput(clientListener, true);
        this.registerOnSoundDeviceNewDefaultOutput(clientListener, true);
        this.registerOnSoundDeviceNewDefaultInputComDevice(clientListener, true);
        this.registerOnSoundDeviceNewDefaultOutputComDevice(clientListener, true);
    }

    @Deprecated
    public void removeClientListener(ClientListener clientListener) {
        this.registerOnInternalError(clientListener, false);
        this.registerOnVoiceActivation(clientListener, false);
        this.registerOnHotKeyToggle(clientListener, false);
        this.registerOnHotKeyTest(clientListener, false);
        this.registerOnFileTransfer(clientListener, false);
        this.registerOnDesktopWindowTransfer(clientListener, false);
        this.registerOnStreamMediaFile(clientListener, false);
        this.registerOnLocalMediaFile(clientListener, false);
        this.registerOnAudioInput(clientListener, false);
        this.registerOnSoundDeviceAdded(clientListener, false);
        this.registerOnSoundDeviceRemoved(clientListener, false);
        this.registerOnSoundDeviceUnplugged(clientListener, false);
        this.registerOnSoundDeviceNewDefaultInput(clientListener, false);
        this.registerOnSoundDeviceNewDefaultOutput(clientListener, false);
        this.registerOnSoundDeviceNewDefaultInputComDevice(clientListener, false);
        this.registerOnSoundDeviceNewDefaultOutputComDevice(clientListener, false);
    }

    public void registerOnInternalError(final ClientEventListener.OnInternalErrorListener onInternalErrorListener, boolean bl) {
        this.register(1000, onInternalErrorListener, bl, new ProcessTTMessage(this, onInternalErrorListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 28);
                onInternalErrorListener.onInternalError(tTMessage.clienterrormsg);
            }
        });
    }

    public void registerOnVoiceActivation(final ClientEventListener.OnVoiceActivationListener onVoiceActivationListener, boolean bl) {
        this.register(1010, onVoiceActivationListener, bl, new ProcessTTMessage(this, onVoiceActivationListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 29);
                onVoiceActivationListener.onVoiceActivation(tTMessage.bActive);
            }
        });
    }

    public void registerOnHotKeyToggle(final ClientEventListener.OnHotKeyToggleListener onHotKeyToggleListener, boolean bl) {
        this.register(1020, onHotKeyToggleListener, bl, new ProcessTTMessage(this, onHotKeyToggleListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 29);
                int n = tTMessage.nSource;
                boolean bl = tTMessage.bActive;
                onHotKeyToggleListener.onHotKeyToggle(n, bl);
            }
        });
    }

    public void registerOnHotKeyTest(final ClientEventListener.OnHotKeyTestListener onHotKeyTestListener, boolean bl) {
        this.register(1030, onHotKeyTestListener, bl, new ProcessTTMessage(this, onHotKeyTestListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 29);
                int n = tTMessage.nSource;
                boolean bl = tTMessage.bActive;
                onHotKeyTestListener.onHotKeyTest(n, bl);
            }
        });
    }

    public void registerOnFileTransfer(final ClientEventListener.OnFileTransferListener onFileTransferListener, boolean bl) {
        this.register(1040, onFileTransferListener, bl, new ProcessTTMessage(this, onFileTransferListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 8);
                onFileTransferListener.onFileTransfer(tTMessage.filetransfer);
            }
        });
    }

    public void registerOnDesktopWindowTransfer(final ClientEventListener.OnDesktopWindowTransferListener onDesktopWindowTransferListener, boolean bl) {
        this.register(1050, onDesktopWindowTransferListener, bl, new ProcessTTMessage(this, onDesktopWindowTransferListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 30);
                int n = tTMessage.nSource;
                int n2 = tTMessage.nBytesRemain;
                onDesktopWindowTransferListener.onDesktopWindowTransfer(n, n2);
            }
        });
    }

    public void registerOnStreamMediaFile(final ClientEventListener.OnStreamMediaFileListener onStreamMediaFileListener, boolean bl) {
        this.register(1060, onStreamMediaFileListener, bl, new ProcessTTMessage(this, onStreamMediaFileListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 27);
                onStreamMediaFileListener.onStreamMediaFile(tTMessage.mediafileinfo);
            }
        });
    }

    public void registerOnLocalMediaFile(final ClientEventListener.OnLocalMediaFileListener onLocalMediaFileListener, boolean bl) {
        this.register(1070, onLocalMediaFileListener, bl, new ProcessTTMessage(this, onLocalMediaFileListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 27);
                onLocalMediaFileListener.onLocalMediaFile(tTMessage.mediafileinfo);
            }
        });
    }

    public void registerOnAudioInput(final ClientEventListener.OnAudioInputListener onAudioInputListener, boolean bl) {
        this.register(1080, onAudioInputListener, bl, new ProcessTTMessage(this, onAudioInputListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 40);
                onAudioInputListener.onAudioInput(tTMessage.audioinputprogress, tTMessage.nSource);
            }
        });
    }

    public void registerOnSoundDeviceAdded(final ClientEventListener.OnSoundDeviceAddedListener onSoundDeviceAddedListener, boolean bl) {
        this.register(1100, onSoundDeviceAddedListener, bl, new ProcessTTMessage(this, onSoundDeviceAddedListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceAddedListener.onSoundDeviceAdded(tTMessage.sounddevice);
            }
        });
    }

    public void registerOnSoundDeviceRemoved(final ClientEventListener.OnSoundDeviceRemovedListener onSoundDeviceRemovedListener, boolean bl) {
        this.register(1110, onSoundDeviceRemovedListener, bl, new ProcessTTMessage(this, onSoundDeviceRemovedListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceRemovedListener.onSoundDeviceRemoved(tTMessage.sounddevice);
            }
        });
    }

    public void registerOnSoundDeviceUnplugged(final ClientEventListener.OnSoundDeviceUnpluggedListener onSoundDeviceUnpluggedListener, boolean bl) {
        this.register(1120, onSoundDeviceUnpluggedListener, bl, new ProcessTTMessage(this, onSoundDeviceUnpluggedListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceUnpluggedListener.onSoundDeviceUnplugged(tTMessage.sounddevice);
            }
        });
    }

    public void registerOnSoundDeviceNewDefaultInput(final ClientEventListener.OnSoundDeviceNewDefaultInputListener onSoundDeviceNewDefaultInputListener, boolean bl) {
        this.register(1130, onSoundDeviceNewDefaultInputListener, bl, new ProcessTTMessage(this, onSoundDeviceNewDefaultInputListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceNewDefaultInputListener.onSoundDeviceNewDefaultInput(tTMessage.sounddevice);
            }
        });
    }

    public void registerOnSoundDeviceNewDefaultOutput(final ClientEventListener.OnSoundDeviceNewDefaultOutputListener onSoundDeviceNewDefaultOutputListener, boolean bl) {
        this.register(1140, onSoundDeviceNewDefaultOutputListener, bl, new ProcessTTMessage(this, onSoundDeviceNewDefaultOutputListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceNewDefaultOutputListener.onSoundDeviceNewDefaultOutput(tTMessage.sounddevice);
            }
        });
    }

    public void registerOnSoundDeviceNewDefaultInputComDevice(final ClientEventListener.OnSoundDeviceNewDefaultInputComDeviceListener onSoundDeviceNewDefaultInputComDeviceListener, boolean bl) {
        this.register(1150, onSoundDeviceNewDefaultInputComDeviceListener, bl, new ProcessTTMessage(this, onSoundDeviceNewDefaultInputComDeviceListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceNewDefaultInputComDeviceListener.onSoundDeviceNewDefaultInputComDevice(tTMessage.sounddevice);
            }
        });
    }

    public void registerOnSoundDeviceNewDefaultOutputComDevice(final ClientEventListener.OnSoundDeviceNewDefaultOutputComDeviceListener onSoundDeviceNewDefaultOutputComDeviceListener, boolean bl) {
        this.register(1160, onSoundDeviceNewDefaultOutputComDeviceListener, bl, new ProcessTTMessage(this, onSoundDeviceNewDefaultOutputComDeviceListener){
            final /* synthetic */ TeamTalkEventHandler this$0;
            {
                this.this$0 = teamTalkEventHandler;
                super(object);
            }

            @Override
            void processTTMessage(TTMessage tTMessage) {
                assert (tTMessage.ttType == 12);
                onSoundDeviceNewDefaultOutputComDeviceListener.onSoundDeviceNewDefaultOutputComDevice(tTMessage.sounddevice);
            }
        });
    }

    public boolean processEvent(TeamTalkBase teamTalkBase, int n) {
        TTMessage tTMessage = new TTMessage();
        if (!teamTalkBase.getMessage(tTMessage, n)) {
            return false;
        }
        for (ProcessTTMessage processTTMessage : this.get(tTMessage.nClientEvent)) {
            processTTMessage.processTTMessage(tTMessage);
        }
        return true;
    }

    abstract class ProcessTTMessage {
        public Object o;

        ProcessTTMessage(Object object) {
            this.o = object;
        }

        abstract void processTTMessage(TTMessage var1);
    }
}

