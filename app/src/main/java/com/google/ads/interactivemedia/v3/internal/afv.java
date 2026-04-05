package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class afv extends ahw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19517d;

    public afv(acr acrVar, int[] iArr) {
        super(acrVar, iArr);
        this.f19517d = m(acrVar.b(iArr[0]));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final int a() {
        return this.f19517d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final int b() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aii
    public final void d(long j2, long j3, List<? extends adn> list, adp[] adpVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (s(this.f19517d, jElapsedRealtime)) {
            int i2 = this.f19753b;
            do {
                i2--;
                if (i2 < 0) {
                    throw new IllegalStateException();
                }
            } while (s(i2, jElapsedRealtime));
            this.f19517d = i2;
        }
    }
}
