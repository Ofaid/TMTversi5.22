/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package dk.bearware;

public class TextMessage {
    public int nMsgType;
    public int nFromUserID;
    public String szFromUsername;
    public int nToUserID;
    public int nChannelID;
    public String szMessage;
    public boolean bMore;

    public TextMessage() {
    }

    public TextMessage(TextMessage textMessage) {
        this.nMsgType = textMessage.nMsgType;
        this.nFromUserID = textMessage.nFromUserID;
        this.szFromUsername = textMessage.szFromUsername;
        this.nToUserID = textMessage.nToUserID;
        this.nChannelID = textMessage.nChannelID;
        this.szMessage = textMessage.szMessage;
        this.bMore = textMessage.bMore;
    }
}

