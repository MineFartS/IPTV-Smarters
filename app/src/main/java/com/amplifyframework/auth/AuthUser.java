package com.amplifyframework.auth;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class AuthUser {
    private String userId;
    private String username;

    public AuthUser(String str, String str2) {
        str.getClass();
        this.userId = str;
        str2.getClass();
        this.username = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUser.class != obj.getClass()) {
            return false;
        }
        AuthUser authUser = (AuthUser) obj;
        return d.a(getUserId(), authUser.getUserId()) && d.a(getUsername(), authUser.getUsername());
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return d.b(getUserId(), getUsername());
    }

    public String toString() {
        return "AuthUser{userId='" + this.userId + "', username='" + this.username + "'}";
    }
}
