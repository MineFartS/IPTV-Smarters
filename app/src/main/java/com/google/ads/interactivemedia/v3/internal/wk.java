package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class wk implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f23563a = new alx(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private sf f23564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f23566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23568f;

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void a(alx alxVar) {
        ajr.c(this.f23564b);
        if (this.f23565c) {
            int iA = alxVar.a();
            int i2 = this.f23568f;
            if (i2 < 10) {
                int iMin = Math.min(iA, 10 - i2);
                System.arraycopy(alxVar.K(), alxVar.c(), this.f23563a.K(), this.f23568f, iMin);
                if (this.f23568f + iMin == 10) {
                    this.f23563a.I(0);
                    if (this.f23563a.k() != 73 || this.f23563a.k() != 68 || this.f23563a.k() != 51) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f23565c = false;
                        return;
                    } else {
                        this.f23563a.J(3);
                        this.f23567e = this.f23563a.j() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f23567e - this.f23568f);
            this.f23564b.c(alxVar, iMin2);
            this.f23568f += iMin2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        sf sfVarAZ = rmVar.aZ(xgVar.a(), 5);
        this.f23564b = sfVarAZ;
        kd kdVar = new kd();
        kdVar.S(xgVar.b());
        kdVar.ae("application/id3");
        sfVarAZ.b(kdVar.s());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
        int i2;
        ajr.c(this.f23564b);
        if (this.f23565c && (i2 = this.f23567e) != 0 && this.f23568f == i2) {
            this.f23564b.d(this.f23566d, 1, i2, 0, null);
            this.f23565c = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f23565c = true;
        this.f23566d = j2;
        this.f23567e = 0;
        this.f23568f = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        this.f23565c = false;
    }
}
