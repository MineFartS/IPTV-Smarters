package com.amplifyframework.auth.cognito;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoUserPoolTokens {
    private final String accessToken;
    private final String idToken;
    private final String refreshToken;

    public AWSCognitoUserPoolTokens(String str, String str2, String str3) {
        str.getClass();
        this.accessToken = str;
        str2.getClass();
        this.idToken = str2;
        str3.getClass();
        this.refreshToken = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoUserPoolTokens.class != obj.getClass()) {
            return false;
        }
        AWSCognitoUserPoolTokens aWSCognitoUserPoolTokens = (AWSCognitoUserPoolTokens) obj;
        return d.a(getAccessToken(), aWSCognitoUserPoolTokens.getAccessToken()) && d.a(getIdToken(), aWSCognitoUserPoolTokens.getIdToken()) && d.a(getRefreshToken(), aWSCognitoUserPoolTokens.getRefreshToken());
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getIdToken() {
        return this.idToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        return d.b(getAccessToken(), getIdToken(), getRefreshToken());
    }

    public String toString() {
        return "AWSCognitoUserPoolTokens{accessToken=" + getAccessToken() + ", idToken=" + getIdToken() + ", refreshToken=" + getRefreshToken() + '}';
    }
}
