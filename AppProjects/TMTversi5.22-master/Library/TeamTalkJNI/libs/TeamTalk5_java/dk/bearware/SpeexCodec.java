/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public class SpeexCodec {
    public int nBandmode;
    public int nQuality;
    public int nTxIntervalMSec;
    public boolean bStereoPlayback;

    public SpeexCodec() {
    }

    public SpeexCodec(boolean bl) {
        if (!bl) {
            return;
        }
        this.nBandmode = 1;
        this.nQuality = 4;
        this.nTxIntervalMSec = 40;
        this.bStereoPlayback = false;
    }
}

