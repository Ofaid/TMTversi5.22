/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package dk.bearware;

import dk.bearware.DesktopInput;

public class PlatformHelper {
    public static native int desktopInputKeyTranslate(int var0, DesktopInput[] var1, DesktopInput[] var2);

    public static native int desktopInputExecute(DesktopInput[] var0);
}

