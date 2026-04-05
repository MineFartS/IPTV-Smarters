package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class ud implements ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23165c;

    public ud(ty tyVar, ke keVar) {
        alx alxVar = tyVar.f23136a;
        this.f23165c = alxVar;
        alxVar.I(12);
        int iN = alxVar.n();
        if ("audio/raw".equals(keVar.f22156l)) {
            int iH = amn.h(keVar.A, keVar.y);
            if (iN == 0 || iN % iH != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iH);
                sb.append(", stsz sample size: ");
                sb.append(iN);
                Log.w("AtomParsers", sb.toString());
                iN = iH;
            }
        }
        this.f23163a = iN == 0 ? -1 : iN;
        this.f23164b = alxVar.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int a() {
        return this.f23163a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int b() {
        return this.f23164b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ub
    public final int c() {
        int i2 = this.f23163a;
        return i2 == -1 ? this.f23165c.n() : i2;
    }
}
