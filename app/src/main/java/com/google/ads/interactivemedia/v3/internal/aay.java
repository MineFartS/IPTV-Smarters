package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aay implements abe, abd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abg f19024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f19025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private abi f19026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private abe f19027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private abd f19028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19029f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ajm f19030g;

    public aay(abg abgVar, ajm ajmVar, long j2) {
        this.f19024a = abgVar;
        this.f19030g = ajmVar;
        this.f19025b = j2;
    }

    private final long v(long j2) {
        long j3 = this.f19029f;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long a(long j2, lt ltVar) {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.a(j2, ltVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.bc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long d() {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long e(long j2) {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.e(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long f(aii[] aiiVarArr, boolean[] zArr, ack[] ackVarArr, boolean[] zArr2, long j2) {
        long j3;
        long j4 = this.f19029f;
        if (j4 == -9223372036854775807L || j2 != this.f19025b) {
            j3 = j2;
        } else {
            this.f19029f = -9223372036854775807L;
            j3 = j4;
        }
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.f(aiiVarArr, zArr, ackVarArr, zArr2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acl
    public final /* bridge */ /* synthetic */ void g(acm acmVar) {
        abd abdVar = this.f19028e;
        int i2 = amn.f20135a;
        abdVar.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final act h() {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        return abeVar.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abd
    public final void i(abe abeVar) {
        abd abdVar = this.f19028e;
        int i2 = amn.f20135a;
        abdVar.i(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void j() throws IOException {
        try {
            abe abeVar = this.f19027d;
            if (abeVar != null) {
                abeVar.j();
                return;
            }
            abi abiVar = this.f19026c;
            if (abiVar != null) {
                abiVar.z();
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void k(abd abdVar, long j2) {
        this.f19028e = abdVar;
        abe abeVar = this.f19027d;
        if (abeVar != null) {
            abeVar.k(this, v(this.f19025b));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        abeVar.l(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        abe abeVar = this.f19027d;
        return abeVar != null && abeVar.m(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        abe abeVar = this.f19027d;
        return abeVar != null && abeVar.n();
    }

    public final long o() {
        return this.f19029f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void p(long j2) {
        abe abeVar = this.f19027d;
        int i2 = amn.f20135a;
        abeVar.p(j2);
    }

    public final long q() {
        return this.f19025b;
    }

    public final void r(abg abgVar) {
        long jV = v(this.f19025b);
        abi abiVar = this.f19026c;
        ajr.b(abiVar);
        abe abeVarX = abiVar.X(abgVar, this.f19030g, jV);
        this.f19027d = abeVarX;
        if (this.f19028e != null) {
            abeVarX.k(this, jV);
        }
    }

    public final void s(long j2) {
        this.f19029f = j2;
    }

    public final void t() {
        if (this.f19027d != null) {
            abi abiVar = this.f19026c;
            ajr.b(abiVar);
            abiVar.W(this.f19027d);
        }
    }

    public final void u(abi abiVar) {
        ajr.f(this.f19026c == null);
        this.f19026c = abiVar;
    }
}
