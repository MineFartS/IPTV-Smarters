package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ael implements ack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ke f19384a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f19386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private aev f19388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19390g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yx f19385b = new yx();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19391h = -9223372036854775807L;

    public ael(aev aevVar, ke keVar, boolean z) {
        this.f19384a = keVar;
        this.f19388e = aevVar;
        this.f19386c = aevVar.f19444b;
        g(aevVar, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int a(kf kfVar, pz pzVar, int i2) {
        if ((i2 & 2) != 0 || !this.f19389f) {
            kfVar.f22161b = this.f19384a;
            this.f19389f = true;
            return -5;
        }
        int i3 = this.f19390g;
        if (i3 == this.f19386c.length) {
            if (this.f19387d) {
                return -3;
            }
            pzVar.c(4);
            return -4;
        }
        this.f19390g = i3 + 1;
        byte[] bArrA = this.f19385b.a(this.f19388e.f19443a[i3]);
        pzVar.i(bArrA.length);
        pzVar.f22801b.put(bArrA);
        pzVar.f22803d = this.f19386c[i3];
        pzVar.c(1);
        return -4;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int b(long j2) {
        int iMax = Math.max(this.f19390g, amn.ah(this.f19386c, j2, true));
        int i2 = this.f19390g;
        this.f19390g = iMax;
        return iMax - i2;
    }

    public final String c() {
        return this.f19388e.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final void d() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final boolean e() {
        return true;
    }

    public final void f(long j2) {
        int iAh = amn.ah(this.f19386c, j2, true);
        this.f19390g = iAh;
        if (!this.f19387d || iAh != this.f19386c.length) {
            j2 = -9223372036854775807L;
        }
        this.f19391h = j2;
    }

    public final void g(aev aevVar, boolean z) {
        int i2 = this.f19390g;
        long j2 = i2 == 0 ? -9223372036854775807L : this.f19386c[i2 - 1];
        this.f19387d = z;
        this.f19388e = aevVar;
        long[] jArr = aevVar.f19444b;
        this.f19386c = jArr;
        long j3 = this.f19391h;
        if (j3 != -9223372036854775807L) {
            f(j3);
        } else if (j2 != -9223372036854775807L) {
            this.f19390g = amn.ah(jArr, j2, false);
        }
    }
}
