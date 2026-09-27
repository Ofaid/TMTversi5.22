/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package dk.bearware;

import dk.bearware.ClientErrorMsg;
import dk.bearware.User;
import dk.bearware.UserAccount;

public class ServerCallback {
    public void userLogin(ClientErrorMsg clientErrorMsg, User user, UserAccount userAccount) {
    }

    public void userChangeNickname(ClientErrorMsg clientErrorMsg, User user, String string) {
    }

    public void userChangeStatus(ClientErrorMsg clientErrorMsg, User user, int n, String string) {
    }

    public void userCreateUserAccount(ClientErrorMsg clientErrorMsg, User user, UserAccount userAccount) {
    }

    public void userDeleteUserAccount(ClientErrorMsg clientErrorMsg, User user, String string) {
    }

    public void userAddServerBan(ClientErrorMsg clientErrorMsg, User user, User user2) {
    }

    public void userAddServerBanIPAddress(ClientErrorMsg clientErrorMsg, User user, String string) {
    }

    public void userDeleteServerBan(ClientErrorMsg clientErrorMsg, User user, String string) {
    }
}

