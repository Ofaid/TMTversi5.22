/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public class AudioConfig {
    public boolean bEnableAGC;
    public int nGainLevel;

    public AudioConfig() {
    }

    public AudioConfig(boolean bl) {
        if (!bl) {
            return;
        }
        this.bEnableAGC = true;
        this.nGainLevel = 8000;
    }
}

