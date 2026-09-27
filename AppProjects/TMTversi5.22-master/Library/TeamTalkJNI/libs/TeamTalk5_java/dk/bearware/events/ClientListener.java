/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware.events;

import dk.bearware.events.ClientEventListener;

public interface ClientListener
extends ClientEventListener.OnInternalErrorListener,
ClientEventListener.OnVoiceActivationListener,
ClientEventListener.OnHotKeyToggleListener,
ClientEventListener.OnHotKeyTestListener,
ClientEventListener.OnFileTransferListener,
ClientEventListener.OnDesktopWindowTransferListener,
ClientEventListener.OnStreamMediaFileListener,
ClientEventListener.OnLocalMediaFileListener,
ClientEventListener.OnAudioInputListener,
ClientEventListener.OnSoundDeviceAddedListener,
ClientEventListener.OnSoundDeviceRemovedListener,
ClientEventListener.OnSoundDeviceUnpluggedListener,
ClientEventListener.OnSoundDeviceNewDefaultInputListener,
ClientEventListener.OnSoundDeviceNewDefaultOutputListener,
ClientEventListener.OnSoundDeviceNewDefaultInputComDeviceListener,
ClientEventListener.OnSoundDeviceNewDefaultOutputComDeviceListener {
}

