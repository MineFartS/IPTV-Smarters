package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class kw implements abp, ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la f22255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ky f22256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private abo f22257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qk f22258d;

    public kw(la laVar, ky kyVar) {
        this.f22255a = laVar;
        this.f22257c = laVar.f22280e;
        this.f22258d = laVar.f22281f;
        this.f22256b = kyVar;
    }

    private final boolean g(int i2, abg abgVar) {
        abg abgVarC = null;
        if (abgVar != null) {
            ky kyVar = this.f22256b;
            int i3 = 0;
            while (true) {
                if (i3 >= kyVar.f22264c.size()) {
                    break;
                }
                if (kyVar.f22264c.get(i3).f19059d == abgVar.f19059d) {
                    abgVarC = abgVar.c(Pair.create(kyVar.f22263b, abgVar.f19056a));
                    break;
                }
                i3++;
            }
            if (abgVarC == null) {
                return false;
            }
        }
        int i4 = i2 + this.f22256b.f22265d;
        abo aboVar = this.f22257c;
        if (aboVar.f19081a != i4 || !amn.O(aboVar.f19082b, abgVarC)) {
            this.f22257c = this.f22255a.f22280e.a(i4, abgVarC, 0L);
        }
        qk qkVar = this.f22258d;
        if (qkVar.f22827a == i4 && amn.O(qkVar.f22828b, abgVarC)) {
            return true;
        }
        this.f22258d = this.f22255a.f22281f.a(i4, abgVarC);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void a(int i2, abg abgVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f22257c.c(abcVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ag(int i2, abg abgVar, aax aaxVar, abc abcVar, IOException iOException, boolean z) {
        if (g(i2, abgVar)) {
            this.f22257c.i(aaxVar, abcVar, iOException, z);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ah(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f22257c.k(aaxVar, abcVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ak(int i2, abg abgVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f22257c.m(abcVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void b(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f22257c.e(aaxVar, abcVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void c(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        if (g(i2, abgVar)) {
            this.f22257c.g(aaxVar, abcVar);
        }
    }
}
