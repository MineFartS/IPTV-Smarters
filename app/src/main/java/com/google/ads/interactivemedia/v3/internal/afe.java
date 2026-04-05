package com.google.ads.interactivemedia.v3.internal;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afe extends afc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final afk f19478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final afk f19479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19480g;

    public afe(aey aeyVar, long j2, long j3, long j4, long j5, long j6, List<aff> list, long j7, afk afkVar, afk afkVar2, long j8, long j9) {
        super(aeyVar, j2, j3, j4, j6, list, j7, j8, j9);
        this.f19478e = afkVar;
        this.f19479f = afkVar2;
        this.f19480g = j5;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afc
    public final long c(long j2) {
        if (this.f19473c != null) {
            return r0.size();
        }
        long j3 = this.f19480g;
        if (j3 != -1) {
            return (j3 - this.f19471a) + 1;
        }
        if (j2 != -9223372036854775807L) {
            return avv.a(BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.f19486i)), BigInteger.valueOf(this.f19472b).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afc
    public final aey g(afb afbVar, long j2) {
        List<aff> list = this.f19473c;
        long j3 = list != null ? list.get((int) (j2 - this.f19471a)).f19481a : (j2 - this.f19471a) * this.f19472b;
        afk afkVar = this.f19479f;
        ke keVar = afbVar.f19467b;
        return new aey(afkVar.b(keVar.f22145a, j2, keVar.f22152h, j3), 0L, -1L);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.afh
    public final aey i(afb afbVar) {
        afk afkVar = this.f19478e;
        if (afkVar == null) {
            return this.f19485h;
        }
        ke keVar = afbVar.f19467b;
        return new aey(afkVar.b(keVar.f22145a, 0L, keVar.f22152h, 0L), 0L, -1L);
    }
}
