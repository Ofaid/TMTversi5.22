/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public class OpusCodec {
    public int nSampleRate;
    public int nChannels;
    public int nApplication;
    public int nComplexity;
    public boolean bFEC;
    public boolean bDTX;
    public int nBitRate;
    public boolean bVBR;
    public boolean bVBRConstraint;
    public int nTxIntervalMSec;
    public int nFrameSizeMSec;

    public OpusCodec() {
    }

    public OpusCodec(boolean bl) {
        if (!bl) {
            return;
        }
        this.nSampleRate = 48000;
        this.nChannels = 1;
        this.nApplication = 2048;
        this.nComplexity = 10;
        this.bFEC = true;
        this.bDTX = true;
        this.nBitRate = 32000;
        this.bVBR = true;
        this.bVBRConstraint = false;
        this.nTxIntervalMSec = 40;
        this.nFrameSizeMSec = 40;
    }
}

