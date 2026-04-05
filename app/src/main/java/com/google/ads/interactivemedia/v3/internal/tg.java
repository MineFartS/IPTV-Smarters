package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f23052a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<tf> f23053b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final to f23054c = new to();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private th f23055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23058g;

    private final long d(rk rkVar, int i2) {
        rkVar.h(this.f23052a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (this.f23052a[i3] & 255));
        }
        return j2;
    }

    public final void a(th thVar) {
        this.f23055d = thVar;
    }

    public final void b() {
        this.f23056e = 0;
        this.f23053b.clear();
        this.f23054c.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[LOOP:0: B:3:0x0005->B:36:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0167 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.ads.interactivemedia.v3.internal.rk r13) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tg.c(com.google.ads.interactivemedia.v3.internal.rk):boolean");
    }
}
