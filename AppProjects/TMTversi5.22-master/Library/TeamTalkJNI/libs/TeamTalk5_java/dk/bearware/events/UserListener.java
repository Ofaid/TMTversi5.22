/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware.events;

import dk.bearware.events.ClientEventListener;

public interface UserListener
extends ClientEventListener.OnUserStateChangeListener,
ClientEventListener.OnUserVideoCaptureListener,
ClientEventListener.OnUserMediaFileVideoListener,
ClientEventListener.OnUserDesktopWindowListener,
ClientEventListener.OnUserDesktopCursorListener,
ClientEventListener.OnUserDesktopInputListener,
ClientEventListener.OnUserRecordMediaFileListener,
ClientEventListener.OnUserAudioBlockListener,
ClientEventListener.OnUserFirstVoiceStreamPacketListener {
}

