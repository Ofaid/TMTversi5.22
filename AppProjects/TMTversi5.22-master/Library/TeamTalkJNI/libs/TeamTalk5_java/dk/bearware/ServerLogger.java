/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package dk.bearware;

import dk.bearware.Channel;
import dk.bearware.RemoteFile;
import dk.bearware.ServerProperties;
import dk.bearware.TextMessage;
import dk.bearware.User;

public class ServerLogger {
    public void userConnected(User user) {
    }

    public void userLoggedIn(User user) {
    }

    public void userLoggedOut(User user) {
    }

    public void userDisconnected(User user) {
    }

    public void userTimedout(User user) {
    }

    public void userKicked(User user, User user2, Channel channel) {
    }

    public void userBanned(User user, User user2, Channel channel) {
    }

    public void userUnbanned(User user, String string) {
    }

    public void userUpdated(User user) {
    }

    public void userJoinedChannel(User user, Channel channel) {
    }

    public void userLeftChannel(User user, Channel channel) {
    }

    public void userMoved(User user, User user2) {
    }

    public void userTextMessage(User user, TextMessage textMessage) {
    }

    public void channelCreated(Channel channel, User user) {
    }

    public void channelUpdated(Channel channel, User user) {
    }

    public void channelRemoved(Channel channel, User user) {
    }

    public void fileUploaded(RemoteFile remoteFile, User user) {
    }

    public void fileDownloaded(RemoteFile remoteFile, User user) {
    }

    public void fileDeleted(RemoteFile remoteFile, User user) {
    }

    public void serverUpdated(ServerProperties serverProperties, User user) {
    }

    public void serverSavedConfig(User user) {
    }
}

