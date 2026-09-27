/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public class SpeexDSP {
    public boolean bEnableAGC;
    public int nGainLevel;
    public int nMaxIncDBSec;
    public int nMaxDecDBSec;
    public int nMaxGainDB;
    public boolean bEnableDenoise;
    public int nMaxNoiseSuppressDB;
    public boolean bEnableEchoCancellation;
    public int nEchoSuppress;
    public int nEchoSuppressActive;

    public SpeexDSP() {
    }

    public SpeexDSP(boolean bl) {
        if (!bl) {
            return;
        }
        this.bEnableAGC = true;
        this.nGainLevel = 8000;
        this.nMaxIncDBSec = 12;
        this.nMaxDecDBSec = -40;
        this.nMaxGainDB = 30;
        this.bEnableDenoise = true;
        this.nMaxNoiseSuppressDB = -30;
        this.bEnableEchoCancellation = true;
        this.nEchoSuppress = -40;
        this.nEchoSuppressActive = -15;
    }
}

