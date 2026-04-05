package com.amazonaws.mobile.client.internal.oauth2;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizeResponse {
    public String code;
    public Uri responseUri;

    public String getCode() {
        return this.code;
    }

    public Uri getResponseUri() {
        return this.responseUri;
    }
}
