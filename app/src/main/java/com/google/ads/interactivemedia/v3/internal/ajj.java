package com.google.ads.interactivemedia.v3.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ajj extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ajh f19884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ajl f19885b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19889f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19887d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19888e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f19886c = new byte[1];

    public ajj(ajh ajhVar, ajl ajlVar) {
        this.f19884a = ajhVar;
        this.f19885b = ajlVar;
    }

    private final void b() {
        if (this.f19887d) {
            return;
        }
        this.f19884a.a(this.f19885b);
        this.f19887d = true;
    }

    public final void a() {
        b();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19888e) {
            return;
        }
        this.f19884a.f();
        this.f19888e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.f19886c) == -1) {
            return -1;
        }
        return this.f19886c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        ajr.f(!this.f19888e);
        b();
        int iB = this.f19884a.b(bArr, i2, i3);
        if (iB == -1) {
            return -1;
        }
        this.f19889f += (long) iB;
        return iB;
    }
}
