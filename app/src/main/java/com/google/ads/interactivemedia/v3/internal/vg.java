package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f23325g = new int[255];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final alx f23326h = new alx(255);

    private static boolean e(rk rkVar, byte[] bArr, int i2, boolean z) throws EOFException {
        try {
            return rkVar.l(bArr, 0, i2, z);
        } catch (EOFException e2) {
            if (z) {
                return false;
            }
            throw e2;
        }
    }

    public final void a() {
        this.f23319a = 0;
        this.f23320b = 0;
        this.f23321c = 0L;
        this.f23322d = 0;
        this.f23323e = 0;
        this.f23324f = 0;
    }

    public final boolean b(rk rkVar, boolean z) throws lb {
        a();
        this.f23326h.E(27);
        if (!e(rkVar, this.f23326h.K(), 27, z) || this.f23326h.s() != 1332176723) {
            return false;
        }
        int iK = this.f23326h.k();
        this.f23319a = iK;
        if (iK != 0) {
            if (z) {
                return false;
            }
            throw new lb("unsupported bit stream revision");
        }
        this.f23320b = this.f23326h.k();
        this.f23321c = this.f23326h.p();
        this.f23326h.q();
        this.f23326h.q();
        this.f23326h.q();
        int iK2 = this.f23326h.k();
        this.f23322d = iK2;
        this.f23323e = iK2 + 27;
        this.f23326h.E(iK2);
        rkVar.g(this.f23326h.K(), 0, this.f23322d);
        for (int i2 = 0; i2 < this.f23322d; i2++) {
            this.f23325g[i2] = this.f23326h.k();
            this.f23324f += this.f23325g[i2];
        }
        return true;
    }

    public final boolean c(rk rkVar) {
        return d(rkVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r12 == (-1)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r11.e() >= r12) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r11.n() != (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.google.ads.interactivemedia.v3.internal.rk r11, long r12) {
        /*
            r10 = this;
            long r0 = r11.e()
            long r2 = r11.d()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.ads.interactivemedia.v3.internal.ajr.d(r0)
            com.google.ads.interactivemedia.v3.internal.alx r0 = r10.f23326h
            r1 = 4
            r0.E(r1)
        L1a:
            r2 = -1
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r6 = r11.e()
            r8 = 4
            long r6 = r6 + r8
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 < 0) goto L2c
            goto L52
        L2c:
            com.google.ads.interactivemedia.v3.internal.alx r0 = r10.f23326h
            byte[] r0 = r0.K()
            boolean r0 = e(r11, r0, r1, r5)
            if (r0 == 0) goto L52
            com.google.ads.interactivemedia.v3.internal.alx r0 = r10.f23326h
            r0.I(r4)
            com.google.ads.interactivemedia.v3.internal.alx r0 = r10.f23326h
            long r2 = r0.s()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            r11.i()
            return r5
        L4e:
            r11.j(r5)
            goto L1a
        L52:
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L5e
            long r0 = r11.e()
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 >= 0) goto L65
        L5e:
            int r0 = r11.n()
            r1 = -1
            if (r0 != r1) goto L52
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vg.d(com.google.ads.interactivemedia.v3.internal.rk, long):boolean");
    }
}
