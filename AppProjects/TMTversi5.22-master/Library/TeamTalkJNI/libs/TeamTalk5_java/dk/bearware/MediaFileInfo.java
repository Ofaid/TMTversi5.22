/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package dk.bearware;

import dk.bearware.AudioFormat;
import dk.bearware.VideoFormat;

public class MediaFileInfo {
    public int nStatus;
    public String szFileName;
    public AudioFormat audioFmt = new AudioFormat();
    public VideoFormat videoFmt = new VideoFormat();
    public int uDurationMSec;
    public int uElapsedMSec;
}

