/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public class SpeexVBRCodec {
    public int nBandmode;
    public int nQuality;
    public int nBitRate;
    public int nMaxBitRate;
    public boolean bDTX;
    public int nTxIntervalMSec;
    public boolean bStereoPlayback;

    public SpeexVBRCodec() {
    }

    public SpeexVBRCodec(boolean bl) {
        if (!bl) {
            return;
        }
        this.nBandmode = 1;
        this.nQuality = 4;
        this.nBitRate = 0;
        this.nMaxBitRate = 0;
        this.bDTX = true;
        this.nTxIntervalMSec = 40;
        this.bStereoPlayback = false;
    }
}

