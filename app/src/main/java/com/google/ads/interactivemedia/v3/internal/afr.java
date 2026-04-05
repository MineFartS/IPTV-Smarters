package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class afr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f19510a = new afq();

    public final byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f19510a.get(uri);
    }

    public final byte[] b(Uri uri) {
        return this.f19510a.remove(uri);
    }

    public final void c(Uri uri, byte[] bArr) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.f19510a;
        ajr.b(uri);
        linkedHashMap.put(uri, (byte[]) ajr.b(bArr));
    }
}
