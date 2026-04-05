package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f23465d = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f23468c = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23470f;

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f23469e) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f23468c;
            int length = bArr2.length;
            int i5 = this.f23466a + i4;
            if (length < i5) {
                this.f23468c = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.f23468c, this.f23466a, i4);
            this.f23466a += i4;
        }
    }

    public final void b() {
        this.f23469e = false;
        this.f23466a = 0;
        this.f23470f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.f23470f
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L45
            r4 = 181(0xb5, float:2.54E-43)
            r5 = 2
            java.lang.String r6 = "Unexpected start code value"
            java.lang.String r7 = "H263Reader"
            if (r0 == r3) goto L39
            if (r0 == r5) goto L31
            if (r0 == r2) goto L22
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r0) goto L1a
            if (r9 != r4) goto L4d
        L1a:
            int r9 = r8.f23466a
            int r9 = r9 - r10
            r8.f23466a = r9
            r8.f23469e = r1
            return r3
        L22:
            r9 = r9 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L29
            goto L3b
        L29:
            int r9 = r8.f23466a
            r8.f23467b = r9
            r9 = 4
            r8.f23470f = r9
            goto L4d
        L31:
            r10 = 31
            if (r9 <= r10) goto L36
            goto L3b
        L36:
            r8.f23470f = r2
            goto L4d
        L39:
            if (r9 == r4) goto L42
        L3b:
            android.util.Log.w(r7, r6)
            r8.b()
            goto L4d
        L42:
            r8.f23470f = r5
            goto L4d
        L45:
            r10 = 176(0xb0, float:2.47E-43)
            if (r9 != r10) goto L4d
            r8.f23470f = r3
            r8.f23469e = r3
        L4d:
            byte[] r9 = com.google.ads.interactivemedia.v3.internal.wc.f23465d
            r8.a(r9, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.wc.c(int, int):boolean");
    }
}
