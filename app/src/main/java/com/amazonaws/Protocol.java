package com.amazonaws;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;

/* JADX INFO: loaded from: classes.dex */
public enum Protocol {
    HTTP("http"),
    HTTPS(ClientConstants.DOMAIN_SCHEME);

    private final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
