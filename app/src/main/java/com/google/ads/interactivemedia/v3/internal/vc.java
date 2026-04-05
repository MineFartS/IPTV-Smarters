package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vc extends vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ru f23307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private vb f23308b;

    private static boolean d(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final long a(alx alxVar) {
        if (!d(alxVar.K())) {
            return -1L;
        }
        int i2 = (alxVar.K()[2] & 255) >> 4;
        if (i2 == 6) {
            alxVar.J(4);
            alxVar.u();
        } else if (i2 == 7) {
            i2 = 7;
            alxVar.J(4);
            alxVar.u();
        }
        int iL = us.l(alxVar, i2);
        alxVar.I(0);
        return iL;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.f23307a = null;
            this.f23308b = null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vl
    public final boolean c(alx alxVar, long j2, vj vjVar) {
        byte[] bArrK = alxVar.K();
        ru ruVar = this.f23307a;
        if (ruVar == null) {
            ru ruVar2 = new ru(bArrK, 17);
            this.f23307a = ruVar2;
            vjVar.f23329a = ruVar2.c(Arrays.copyOfRange(bArrK, 9, alxVar.d()), null);
            return true;
        }
        if ((bArrK[0] & 127) == 3) {
            rt rtVarJ = us.j(alxVar);
            ru ruVarE = ruVar.e(rtVarJ);
            this.f23307a = ruVarE;
            this.f23308b = new vb(ruVarE, rtVarJ);
            return true;
        }
        if (!d(bArrK)) {
            return true;
        }
        vb vbVar = this.f23308b;
        if (vbVar != null) {
            vbVar.a(j2);
            vjVar.f23330b = this.f23308b;
        }
        ajr.b(vjVar.f23329a);
        return false;
    }
}
