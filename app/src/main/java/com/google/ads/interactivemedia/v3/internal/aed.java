package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public final class aed implements akl<Long> {
    private aed() {
    }

    public /* synthetic */ aed(byte[] bArr) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akl
    public final /* bridge */ /* synthetic */ Long a(Uri uri, InputStream inputStream) {
        return Long.valueOf(amn.o(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
