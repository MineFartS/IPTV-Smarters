package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ahw implements aii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final acr f19752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f19754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ke[] f19755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f19756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19757f;

    public ahw(acr acrVar, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        ajr.f(length > 0);
        ajr.b(acrVar);
        this.f19752a = acrVar;
        this.f19753b = length;
        this.f19755d = new ke[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f19755d[i3] = acrVar.b(iArr[i3]);
        }
        Arrays.sort(this.f19755d, ahx.f19759b);
        this.f19754c = new int[this.f19753b];
        while (true) {
            int i4 = this.f19753b;
            if (i2 >= i4) {
                this.f19756e = new long[i4];
                return;
            } else {
                this.f19754c[i2] = acrVar.a(this.f19755d[i2]);
                i2++;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public int e(long j2, List<? extends adn> list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ahw ahwVar = (ahw) obj;
            if (this.f19752a == ahwVar.f19752a && Arrays.equals(this.f19754c, ahwVar.f19754c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public void g() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public void h() {
    }

    public final int hashCode() {
        int i2 = this.f19757f;
        if (i2 != 0) {
            return i2;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f19752a) * 31) + Arrays.hashCode(this.f19754c);
        this.f19757f = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public void i(float f2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ail
    public final int j(int i2) {
        return this.f19754c[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final int k() {
        return this.f19754c[a()];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ail
    public final int l(int i2) {
        for (int i3 = 0; i3 < this.f19753b; i3++) {
            if (this.f19754c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ail
    public final int m(ke keVar) {
        for (int i2 = 0; i2 < this.f19753b; i2++) {
            if (this.f19755d[i2] == keVar) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ail
    public final int n() {
        return this.f19754c.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ail
    public final ke o(int i2) {
        return this.f19755d[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final ke p() {
        return this.f19755d[a()];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ail
    public final acr q() {
        return this.f19752a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final boolean r(int i2, long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zS = s(i2, jElapsedRealtime);
        int i3 = 0;
        while (true) {
            if (i3 < this.f19753b) {
                if (zS) {
                    break;
                }
                zS = (i3 == i2 || s(i3, jElapsedRealtime)) ? false : true;
                i3++;
            } else if (!zS) {
                return false;
            }
        }
        long[] jArr = this.f19756e;
        jArr[i2] = Math.max(jArr[i2], amn.ag(jElapsedRealtime, j2));
        return true;
    }

    public final boolean s(int i2, long j2) {
        return this.f19756e[i2] > j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final /* synthetic */ void t() {
    }
}
