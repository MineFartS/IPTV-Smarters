package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class baa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final awu f20758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final awx f20759b;

    public baa(awu awuVar) {
        this.f20758a = awuVar;
        this.f20759b = null;
    }

    public baa(awx awxVar) {
        this.f20758a = null;
        this.f20759b = awxVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        awu awuVar = this.f20758a;
        return awuVar != null ? awuVar.a(bArr, bArr2) : this.f20759b.a(bArr, bArr2);
    }
}
