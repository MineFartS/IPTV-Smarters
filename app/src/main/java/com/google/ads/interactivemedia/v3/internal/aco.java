package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class aco extends mg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f19184b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f19187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f19189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f19190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f19192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f19193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final kn f19194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final kl f19195m;

    static {
        ki kiVar = new ki();
        kiVar.c("SinglePeriodTimeline");
        kiVar.f(Uri.EMPTY);
        kiVar.a();
    }

    public aco(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, kn knVar, kl klVar) {
        this.f19185c = j2;
        this.f19186d = j3;
        this.f19187e = j4;
        this.f19188f = j5;
        this.f19189g = j6;
        this.f19190h = j7;
        this.f19191i = z;
        this.f19192j = z2;
        this.f19193k = obj;
        this.f19194l = knVar;
        this.f19195m = klVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int g(Object obj) {
        return f19184b.equals(obj) ? 0 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final me j(int i2, me meVar, boolean z) {
        ajr.g(i2, 1);
        return meVar.k(null, z ? f19184b : null, this.f19187e, -this.f19189g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
  0x0029: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x0011, B:5:0x0017, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.ads.interactivemedia.v3.internal.mg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.mf l(int r24, com.google.ads.interactivemedia.v3.internal.mf r25, long r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = 1
            r2 = r24
            com.google.ads.interactivemedia.v3.internal.ajr.g(r2, r1)
            long r1 = r0.f19190h
            boolean r14 = r0.f19192j
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L29
            r5 = 0
            int r7 = (r26 > r5 ? 1 : (r26 == r5 ? 0 : -1))
            if (r7 == 0) goto L29
            long r5 = r0.f19188f
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L22
        L1f:
            r16 = r3
            goto L2b
        L22:
            long r1 = r1 + r26
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L29
            goto L1f
        L29:
            r16 = r1
        L2b:
            java.lang.Object r4 = com.google.ads.interactivemedia.v3.internal.mf.f22401a
            com.google.ads.interactivemedia.v3.internal.kn r5 = r0.f19194l
            java.lang.Object r6 = r0.f19193k
            long r7 = r0.f19185c
            long r9 = r0.f19186d
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.f19191i
            com.google.ads.interactivemedia.v3.internal.kl r15 = r0.f19195m
            long r1 = r0.f19188f
            r18 = r1
            r20 = 0
            long r1 = r0.f19189g
            r21 = r1
            r3 = r25
            r3.c(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aco.l(int, com.google.ads.interactivemedia.v3.internal.mf, long):com.google.ads.interactivemedia.v3.internal.mf");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final Object q(int i2) {
        ajr.g(i2, 1);
        return f19184b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int s() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int t() {
        return 1;
    }
}
