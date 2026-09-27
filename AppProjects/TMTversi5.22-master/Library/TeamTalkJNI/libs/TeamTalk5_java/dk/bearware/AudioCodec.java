/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

import dk.bearware.OpusCodec;
import dk.bearware.SpeexCodec;
import dk.bearware.SpeexVBRCodec;

public class AudioCodec {
    public int nCodec;
    public SpeexCodec speex = new SpeexCodec(true);
    public SpeexVBRCodec speex_vbr = new SpeexVBRCodec(true);
    public OpusCodec opus = new OpusCodec(true);

    public AudioCodec() {
        this.nCodec = 0;
    }

    public AudioCodec(boolean bl) {
        if (!bl) {
            return;
        }
        this.nCodec = 3;
        this.opus = new OpusCodec(true);
    }
}

