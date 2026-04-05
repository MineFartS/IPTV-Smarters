package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sl implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22955a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f22956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f22957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f22958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f22959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f22961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f22969o;
    private rm p;
    private sf q;
    private sc r;
    private boolean s;

    static {
        sk skVar = new rp() { // from class: com.google.ads.interactivemedia.v3.internal.sk
            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final rj[] a() {
                int i2 = sl.f22955a;
                return new rj[]{new sl()};
            }

            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final /* synthetic */ rj[] b(Uri uri, Map map) {
                return ro.a(this);
            }
        };
        f22956b = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f22957c = iArr;
        f22958d = amn.W("#!AMR\n");
        f22959e = amn.W("#!AMR-WB\n");
        f22960f = iArr[8];
    }

    public sl() {
        this(null);
    }

    public sl(byte[] bArr) {
        this.f22961g = new byte[1];
        this.f22967m = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[Catch: EOFException -> 0x0096, TryCatch #0 {EOFException -> 0x0096, blocks: (B:4:0x0007, B:6:0x0017, B:20:0x0035, B:22:0x003e, B:21:0x003a, B:28:0x0051, B:31:0x005a, B:32:0x007c, B:33:0x007d, B:34:0x0095), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[Catch: EOFException -> 0x0096, TryCatch #0 {EOFException -> 0x0096, blocks: (B:4:0x0007, B:6:0x0017, B:20:0x0035, B:22:0x003e, B:21:0x003a, B:28:0x0051, B:31:0x005a, B:32:0x007c, B:33:0x007d, B:34:0x0095), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int e(com.google.ads.interactivemedia.v3.internal.rk r10) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            r9 = this;
            int r0 = r9.f22965k
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L97
            r10.i()     // Catch: java.io.EOFException -> L96
            byte[] r0 = r9.f22961g     // Catch: java.io.EOFException -> L96
            r10.g(r0, r1, r3)     // Catch: java.io.EOFException -> L96
            byte[] r0 = r9.f22961g     // Catch: java.io.EOFException -> L96
            r0 = r0[r1]     // Catch: java.io.EOFException -> L96
            r4 = r0 & 131(0x83, float:1.84E-43)
            if (r4 > 0) goto L7d
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r9.f22962h     // Catch: java.io.EOFException -> L96
            if (r4 == 0) goto L28
            r5 = 10
            if (r0 < r5) goto L33
            r5 = 13
            if (r0 <= r5) goto L28
            goto L33
        L28:
            if (r4 != 0) goto L51
            r5 = 12
            if (r0 < r5) goto L33
            r5 = 14
            if (r0 > r5) goto L33
            goto L51
        L33:
            if (r4 == 0) goto L3a
            int[] r4 = com.google.ads.interactivemedia.v3.internal.sl.f22957c     // Catch: java.io.EOFException -> L96
            r0 = r4[r0]     // Catch: java.io.EOFException -> L96
            goto L3e
        L3a:
            int[] r4 = com.google.ads.interactivemedia.v3.internal.sl.f22956b     // Catch: java.io.EOFException -> L96
            r0 = r4[r0]     // Catch: java.io.EOFException -> L96
        L3e:
            r9.f22964j = r0     // Catch: java.io.EOFException -> L96
            r9.f22965k = r0
            int r4 = r9.f22967m
            if (r4 != r2) goto L49
            r9.f22967m = r0
            r4 = r0
        L49:
            if (r4 != r0) goto L97
            int r0 = r9.f22968n
            int r0 = r0 + r3
            r9.f22968n = r0
            goto L97
        L51:
            com.google.ads.interactivemedia.v3.internal.lb r10 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch: java.io.EOFException -> L96
            java.lang.String r1 = "WB"
            java.lang.String r5 = "NB"
            if (r3 == r4) goto L5a
            r1 = r5
        L5a:
            int r3 = r1.length()     // Catch: java.io.EOFException -> L96
            int r3 = r3 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L96
            r4.<init>(r3)     // Catch: java.io.EOFException -> L96
            java.lang.String r3 = "Illegal AMR "
            r4.append(r3)     // Catch: java.io.EOFException -> L96
            r4.append(r1)     // Catch: java.io.EOFException -> L96
            java.lang.String r1 = " frame type "
            r4.append(r1)     // Catch: java.io.EOFException -> L96
            r4.append(r0)     // Catch: java.io.EOFException -> L96
            java.lang.String r0 = r4.toString()     // Catch: java.io.EOFException -> L96
            r10.<init>(r0)     // Catch: java.io.EOFException -> L96
            throw r10     // Catch: java.io.EOFException -> L96
        L7d:
            com.google.ads.interactivemedia.v3.internal.lb r10 = new com.google.ads.interactivemedia.v3.internal.lb     // Catch: java.io.EOFException -> L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L96
            r3 = 42
            r1.<init>(r3)     // Catch: java.io.EOFException -> L96
            java.lang.String r3 = "Invalid padding bits for frame header "
            r1.append(r3)     // Catch: java.io.EOFException -> L96
            r1.append(r0)     // Catch: java.io.EOFException -> L96
            java.lang.String r0 = r1.toString()     // Catch: java.io.EOFException -> L96
            r10.<init>(r0)     // Catch: java.io.EOFException -> L96
            throw r10     // Catch: java.io.EOFException -> L96
        L96:
            return r2
        L97:
            com.google.ads.interactivemedia.v3.internal.sf r0 = r9.q
            int r4 = r9.f22965k
            int r10 = r0.a(r10, r4, r3)
            if (r10 != r2) goto La2
            return r2
        La2:
            int r0 = r9.f22965k
            int r0 = r0 - r10
            r9.f22965k = r0
            if (r0 <= 0) goto Laa
            return r1
        Laa:
            com.google.ads.interactivemedia.v3.internal.sf r2 = r9.q
            long r3 = r9.f22969o
            long r5 = r9.f22963i
            long r3 = r3 + r5
            r5 = 1
            int r6 = r9.f22964j
            r7 = 0
            r8 = 0
            r2.d(r3, r5, r6, r7, r8)
            long r2 = r9.f22963i
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.f22963i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.sl.e(com.google.ads.interactivemedia.v3.internal.rk):int");
    }

    private static boolean g(rk rkVar, byte[] bArr) {
        rkVar.i();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        rkVar.g(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean h(rk rkVar) {
        int length;
        byte[] bArr = f22958d;
        if (g(rkVar, bArr)) {
            this.f22962h = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f22959e;
            if (!g(rkVar, bArr2)) {
                return false;
            }
            this.f22962h = true;
            length = bArr2.length;
        }
        rkVar.j(length);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) throws lb {
        ajr.c(this.q);
        int i2 = amn.f20135a;
        if (rkVar.e() == 0 && !h(rkVar)) {
            throw new lb("Could not find AMR header.");
        }
        if (!this.s) {
            this.s = true;
            boolean z = this.f22962h;
            String str = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i3 = true != z ? 8000 : 16000;
            sf sfVar = this.q;
            kd kdVar = new kd();
            kdVar.ae(str);
            kdVar.W(f22960f);
            kdVar.H(1);
            kdVar.af(i3);
            sfVar.b(kdVar.s());
        }
        int iE = e(rkVar);
        if (!this.f22966l) {
            sb sbVar = new sb(-9223372036854775807L);
            this.r = sbVar;
            this.p.bb(sbVar);
            this.f22966l = true;
        }
        return iE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.p = rmVar;
        this.q = rmVar.aZ(0, 1);
        rmVar.ba();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.f22963i = 0L;
        this.f22964j = 0;
        this.f22965k = 0;
        this.f22969o = 0L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        return h(rkVar);
    }
}
