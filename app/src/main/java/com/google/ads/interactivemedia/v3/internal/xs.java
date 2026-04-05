package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class xs extends pz {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23750h;

    public xs() {
        super(2);
        this.f23750h = 32;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.pz, com.google.ads.interactivemedia.v3.internal.pt
    public final void b() {
        super.b();
        this.f23749g = 0;
    }

    public final int l() {
        return this.f23749g;
    }

    public final long m() {
        return this.f23748f;
    }

    public final void n(int i2) {
        ajr.d(true);
        this.f23750h = i2;
    }

    public final boolean o(pz pzVar) {
        ByteBuffer byteBuffer;
        ajr.d(!pzVar.k());
        ajr.d(!pzVar.e());
        ajr.d(!pzVar.g());
        if (p()) {
            if (this.f23749g >= this.f23750h || pzVar.f() != f()) {
                return false;
            }
            ByteBuffer byteBuffer2 = pzVar.f22801b;
            if (byteBuffer2 != null && (byteBuffer = this.f22801b) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i2 = this.f23749g;
        this.f23749g = i2 + 1;
        if (i2 == 0) {
            this.f22803d = pzVar.f22803d;
            if (pzVar.h()) {
                c(1);
            }
        }
        if (pzVar.f()) {
            c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = pzVar.f22801b;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f22801b.put(byteBuffer3);
        }
        this.f23748f = pzVar.f22803d;
        return true;
    }

    public final boolean p() {
        return this.f23749g > 0;
    }
}
