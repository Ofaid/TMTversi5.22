/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware.events;

import dk.bearware.events.ClientEventListener;

public interface ConnectionListener
extends ClientEventListener.OnConnectSuccessListener,
ClientEventListener.OnEncryptionErrorListener,
ClientEventListener.OnConnectFailedListener,
ClientEventListener.OnConnectionLostListener,
ClientEventListener.OnMaxPayloadUpdateListener {
}

