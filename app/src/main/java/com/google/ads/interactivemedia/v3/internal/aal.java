package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aal implements acm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final acm[] f18986a;

    public aal(acm[] acmVarArr) {
        this.f18986a = acmVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        long jMin = Long.MAX_VALUE;
        for (acm acmVar : this.f18986a) {
            long jBc = acmVar.bc();
            if (jBc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jBc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        long jMin = Long.MAX_VALUE;
        for (acm acmVar : this.f18986a) {
            long jC = acmVar.c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        for (acm acmVar : this.f18986a) {
            acmVar.l(j2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        boolean zM;
        boolean z = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                break;
            }
            zM = false;
            for (acm acmVar : this.f18986a) {
                long jC2 = acmVar.c();
                boolean z2 = jC2 != Long.MIN_VALUE && jC2 <= j2;
                if (jC2 == jC || z2) {
                    zM |= acmVar.m(j2);
                }
            }
            z |= zM;
        } while (zM);
        return z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        for (acm acmVar : this.f18986a) {
            if (acmVar.n()) {
                return true;
            }
        }
        return false;
    }
}
