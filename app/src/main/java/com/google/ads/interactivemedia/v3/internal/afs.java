package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class afs extends adl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f19511a;

    public afs(ajh ajhVar, ajl ajlVar, ke keVar, int i2, byte[] bArr) {
        super(ajhVar, ajlVar, keVar, i2, bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.adl
    public final void a(byte[] bArr, int i2) {
        this.f19511a = Arrays.copyOf(bArr, i2);
    }

    public final byte[] c() {
        return this.f19511a;
    }
}
