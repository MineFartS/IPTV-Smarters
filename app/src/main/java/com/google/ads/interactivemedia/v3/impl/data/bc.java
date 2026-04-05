package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ark;

/* JADX INFO: loaded from: classes.dex */
@ark(a = z.class)
public abstract class bc {
    public static bc create(bb bbVar, String str, String str2, String str3, String str4, int i2, int i3) {
        return new z(bbVar, str, str2, str4, str3, i2, i3);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract bb requestType();

    public abstract String url();

    public abstract String userAgent();
}
