/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

public class WebRTCAudioPreprocessor {
    public Preamplifier preamplifier = new Preamplifier();
    public EchoCanceller echocanceller = new EchoCanceller();
    public GainController2 gaincontroller2 = new GainController2();
    public NoiseSuppression noisesuppression = new NoiseSuppression();

    public WebRTCAudioPreprocessor() {
    }

    public WebRTCAudioPreprocessor(boolean bl) {
        if (bl) {
            this.preamplifier.bEnable = false;
            this.preamplifier.fFixedGainFactor = 1.0f;
            this.echocanceller.bEnable = false;
            this.noisesuppression.bEnable = false;
            this.noisesuppression.nLevel = 2;
            this.gaincontroller2.bEnable = false;
            this.gaincontroller2.fixeddigital.fGainDB = 0.0f;
            this.gaincontroller2.adaptivedigital.bEnable = false;
            this.gaincontroller2.adaptivedigital.fHeadRoomDB = 5.0f;
            this.gaincontroller2.adaptivedigital.fMaxGainDB = 50.0f;
            this.gaincontroller2.adaptivedigital.fInitialGainDB = 15.0f;
            this.gaincontroller2.adaptivedigital.fMaxGainChangeDBPerSecond = 6.0f;
            this.gaincontroller2.adaptivedigital.fMaxOutputNoiseLevelDBFS = -50.0f;
        }
    }

    public class Preamplifier {
        public boolean bEnable;
        public float fFixedGainFactor;
    }

    public class EchoCanceller {
        public boolean bEnable;
    }

    public class GainController2 {
        public boolean bEnable;
        public FixedDigital fixeddigital = new FixedDigital();
        public AdaptiveDigital adaptivedigital = new AdaptiveDigital();

        public class FixedDigital {
            public float fGainDB;
        }

        public class AdaptiveDigital {
            public boolean bEnable;
            public float fHeadRoomDB;
            public float fMaxGainDB;
            public float fInitialGainDB;
            public float fMaxGainChangeDBPerSecond;
            public float fMaxOutputNoiseLevelDBFS;
        }
    }

    public class NoiseSuppression {
        public boolean bEnable;
        public int nLevel;
    }
}

