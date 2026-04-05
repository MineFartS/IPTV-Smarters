package com.amazonaws.mobile.client.internal.oauth2;

/* JADX INFO: loaded from: classes.dex */
public class OAuth2Tokens {
    public String accessToken;
    public Long createDate;
    public Long expiresIn;
    public String idToken;
    public String refreshToken;
    public String scopes;
    public String tokenType;

    public OAuth2Tokens(String str, String str2, String str3, String str4, Long l2, Long l3, String str5) {
        this.accessToken = str;
        this.idToken = str2;
        this.refreshToken = str3;
        this.tokenType = str4;
        this.expiresIn = l2;
        this.createDate = l3;
        this.scopes = str5;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Long getCreateDate() {
        return this.createDate;
    }

    public Long getExpiresIn() {
        return this.expiresIn;
    }

    public String getIdToken() {
        return this.idToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getScopes() {
        return this.scopes;
    }

    public String getTokenType() {
        return this.tokenType;
    }
}
