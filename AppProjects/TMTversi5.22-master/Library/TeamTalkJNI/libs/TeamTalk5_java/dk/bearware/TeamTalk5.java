/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package dk.bearware;

import dk.bearware.TeamTalkBase;

public class TeamTalk5
extends TeamTalkBase {
    public TeamTalk5() {
        super(true);
    }

    private TeamTalk5(boolean bl) {
        super(bl);
    }

    public static void loadLibrary() {
        new TeamTalk5(false);
    }

    static {
        System.loadLibrary((String)"TeamTalk5-jni");
    }
}

