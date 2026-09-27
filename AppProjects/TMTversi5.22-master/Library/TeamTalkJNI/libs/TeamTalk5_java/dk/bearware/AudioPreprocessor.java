/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

import dk.bearware.SpeexDSP;
import dk.bearware.TTAudioPreprocessor;
import dk.bearware.WebRTCAudioPreprocessor;

public class AudioPreprocessor {
    public int nPreprocessor = 0;
    public SpeexDSP speexdsp = new SpeexDSP();
    public TTAudioPreprocessor ttpreprocessor = new TTAudioPreprocessor();
    public WebRTCAudioPreprocessor webrtc = new WebRTCAudioPreprocessor();

    public AudioPreprocessor() {
    }

    public AudioPreprocessor(int n, boolean bl) {
        this.nPreprocessor = n;
        switch (n) {
            case 0: {
                break;
            }
            case 1: {
                this.speexdsp = new SpeexDSP(bl);
                break;
            }
            case 2: {
                this.ttpreprocessor = new TTAudioPreprocessor(bl);
                break;
            }
            case 4: {
                this.webrtc = new WebRTCAudioPreprocessor(bl);
            }
        }
    }
}

