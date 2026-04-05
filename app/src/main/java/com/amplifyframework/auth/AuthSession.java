package com.amplifyframework.auth;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public class AuthSession {
    private final boolean isSignedIn;

    public AuthSession(boolean z) {
        this.isSignedIn = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d.a(Boolean.valueOf(isSignedIn()), Boolean.valueOf(((AuthSession) obj).isSignedIn()));
    }

    public int hashCode() {
        return d.b(Boolean.valueOf(isSignedIn()));
    }

    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public String toString() {
        return "AuthSession{isSignedIn=" + this.isSignedIn + '}';
    }
}
