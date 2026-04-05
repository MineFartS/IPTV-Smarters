package c.f.a.b.e3.g1;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f7525c;

    public h0(long j2, int i2, Uri uri) {
        this.f7523a = j2;
        this.f7524b = i2;
        this.f7525c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.b.b.t<c.f.a.b.e3.g1.h0> a(java.lang.String r18) throws c.f.a.b.w1 {
        /*
            c.f.b.b.t$a r0 = new c.f.b.b.t$a
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = c.f.a.b.j3.x0.U0(r2, r1)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L10:
            if (r4 >= r2) goto Lc2
            r5 = r1[r4]
            java.lang.String r6 = ";"
            java.lang.String[] r6 = c.f.a.b.j3.x0.U0(r5, r6)
            int r7 = r6.length
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 0
            r14 = -1
        L23:
            if (r12 >= r7) goto L93
            r15 = r6[r12]
            java.lang.String r11 = "="
            java.lang.String[] r11 = c.f.a.b.j3.x0.V0(r15, r11)     // Catch: java.lang.Exception -> L8d
            r10 = r11[r3]     // Catch: java.lang.Exception -> L8d
            r3 = 1
            r11 = r11[r3]     // Catch: java.lang.Exception -> L8d
            int r3 = r10.hashCode()     // Catch: java.lang.Exception -> L8d
            r16 = r1
            r1 = 113759(0x1bc5f, float:1.5941E-40)
            r17 = r2
            r2 = 2
            if (r3 == r1) goto L5f
            r1 = 116079(0x1c56f, float:1.62661E-40)
            if (r3 == r1) goto L55
            r1 = 1524180539(0x5ad9263b, float:3.0561052E16)
            if (r3 == r1) goto L4b
            goto L69
        L4b:
            java.lang.String r1 = "rtptime"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> L8d
            if (r1 == 0) goto L69
            r1 = 2
            goto L6a
        L55:
            java.lang.String r1 = "url"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> L8d
            if (r1 == 0) goto L69
            r1 = 0
            goto L6a
        L5f:
            java.lang.String r1 = "seq"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> L8d
            if (r1 == 0) goto L69
            r1 = 1
            goto L6a
        L69:
            r1 = -1
        L6a:
            if (r1 == 0) goto L81
            r3 = 1
            if (r1 == r3) goto L7c
            if (r1 != r2) goto L76
            long r8 = java.lang.Long.parseLong(r11)     // Catch: java.lang.Exception -> L8d
            goto L85
        L76:
            r0 = 0
            c.f.a.b.w1 r0 = c.f.a.b.w1.c(r10, r0)     // Catch: java.lang.Exception -> L8d
            throw r0     // Catch: java.lang.Exception -> L8d
        L7c:
            int r14 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L8d
            goto L85
        L81:
            android.net.Uri r13 = android.net.Uri.parse(r11)     // Catch: java.lang.Exception -> L8d
        L85:
            int r12 = r12 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L23
        L8d:
            r0 = move-exception
            c.f.a.b.w1 r0 = c.f.a.b.w1.c(r15, r0)
            throw r0
        L93:
            r16 = r1
            r17 = r2
            if (r13 == 0) goto Lbc
            java.lang.String r1 = r13.getScheme()
            if (r1 == 0) goto Lbc
            r1 = -1
            if (r14 != r1) goto Lab
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto Lbc
        Lab:
            c.f.a.b.e3.g1.h0 r1 = new c.f.a.b.e3.g1.h0
            r1.<init>(r8, r14, r13)
            r0.d(r1)
            int r4 = r4 + 1
            r1 = r16
            r2 = r17
            r3 = 0
            goto L10
        Lbc:
            r0 = 0
            c.f.a.b.w1 r0 = c.f.a.b.w1.c(r5, r0)
            throw r0
        Lc2:
            c.f.b.b.t r0 = r0.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.g1.h0.a(java.lang.String):c.f.b.b.t");
    }
}
