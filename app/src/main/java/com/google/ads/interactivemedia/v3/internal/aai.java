package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class aai implements abp, ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aak f18976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private abo f18978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qk f18979d;

    public aai(aak aakVar, Object obj) {
        this.f18976a = aakVar;
        this.f18978c = aakVar.d(null);
        this.f18979d = aakVar.b(null);
        this.f18977b = obj;
    }

    private final boolean g(int i2, abg abgVar) {
        abg abgVarW;
        if (abgVar != null) {
            abgVarW = this.f18976a.w(this.f18977b, abgVar);
            if (abgVarW == null) {
                return false;
            }
        } else {
            abgVarW = null;
        }
        int iV = this.f18976a.v(this.f18977b, i2);
        abo aboVar = this.f18978c;
        if (aboVar.f19081a != iV || !amn.O(aboVar.f19082b, abgVarW)) {
            this.f18978c = this.f18976a.u(iV, abgVarW);
        }
        qk qkVar = this.f18979d;
        if (qkVar.f22827a == iV && amn.O(qkVar.f22828b, abgVarW)) {
            return true;
        }
        this.f18979d = this.f18976a.c(iV, abgVarW);
        return true;
    }

    private static final abc h(abc abcVar) {
        return abcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void a(int i2, abg abgVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f18978c.c(h(abcVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ag(int i2, abg abgVar, aax aaxVar, abc abcVar, IOException iOException, boolean z) {
        if (g(i2, abgVar)) {
            this.f18978c.i(aaxVar, h(abcVar), iOException, z);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ah(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f18978c.k(aaxVar, h(abcVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ak(int i2, abg abgVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f18978c.m(h(abcVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void b(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f18978c.e(aaxVar, h(abcVar));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void c(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f18978c.g(aaxVar, h(abcVar));
        }
    }
}
