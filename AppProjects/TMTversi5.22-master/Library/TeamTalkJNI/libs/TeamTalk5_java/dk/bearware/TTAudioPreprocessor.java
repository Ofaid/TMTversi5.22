/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

import dk.bearware.SoundLevel;

public class TTAudioPreprocessor {
    public int nGainLevel;
    public boolean bMuteLeftSpeaker;
    public boolean bMuteRightSpeaker;

    public TTAudioPreprocessor() {
    }

    public TTAudioPreprocessor(boolean bl) {
        if (bl) {
            this.nGainLevel = SoundLevel.SOUND_GAIN_DEFAULT;
            this.bMuteLeftSpeaker = false;
            this.bMuteRightSpeaker = false;
        }
    }
}

