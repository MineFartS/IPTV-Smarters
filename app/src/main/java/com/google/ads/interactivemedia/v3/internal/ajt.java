package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajt extends ajb implements ajh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ajz f19946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ajz f19947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ajl f19948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HttpURLConnection f19949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f19950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19951i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19954l;

    @Deprecated
    public ajt() {
        this(null, 8000, 8000, null);
    }

    private ajt(String str, int i2, int i3, ajz ajzVar) {
        super(true);
        this.f19945c = str;
        this.f19943a = 8000;
        this.f19944b = 8000;
        this.f19946d = ajzVar;
        this.f19947e = new ajz();
    }

    public /* synthetic */ ajt(String str, int i2, int i3, ajz ajzVar, byte[] bArr) {
        this(str, 8000, 8000, ajzVar);
    }

    private final void k() {
        HttpURLConnection httpURLConnection = this.f19949g;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                alj.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f19949g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.ads.interactivemedia.v3.internal.ajl r17) throws com.google.ads.interactivemedia.v3.internal.ajx {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ajt.a(com.google.ads.interactivemedia.v3.internal.ajl):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aje
    public final int b(byte[] bArr, int i2, int i3) throws ajx {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f19953k;
            if (j2 != -1) {
                long j3 = j2 - this.f19954l;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.f19950h;
            int i4 = amn.f20135a;
            int i5 = inputStream.read(bArr, i2, i3);
            if (i5 == -1) {
                return -1;
            }
            this.f19954l += (long) i5;
            g(i5);
            return i5;
        } catch (IOException e2) {
            int i6 = amn.f20135a;
            throw new ajx(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    public final Uri c() {
        HttpURLConnection httpURLConnection = this.f19949g;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajb, com.google.ads.interactivemedia.v3.internal.ajh
    public final Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.f19949g;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[Catch: Exception -> 0x006d, all -> 0x0089, TRY_LEAVE, TryCatch #0 {Exception -> 0x006d, blocks: (B:17:0x0022, B:19:0x002a, B:25:0x0039, B:27:0x0049, B:29:0x0051), top: B:45:0x0022 }] */
    @Override // com.google.ads.interactivemedia.v3.internal.ajh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.f19950h     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L7a
            long r3 = r10.f19953k     // Catch: java.lang.Throwable -> L89
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            r3 = r5
            goto L13
        L10:
            long r7 = r10.f19954l     // Catch: java.lang.Throwable -> L89
            long r3 = r3 - r7
        L13:
            java.net.HttpURLConnection r7 = r10.f19949g     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L6d
            int r8 = com.google.ads.interactivemedia.v3.internal.amn.f20135a     // Catch: java.lang.Throwable -> L89
            r9 = 19
            if (r8 < r9) goto L6d
            r9 = 20
            if (r8 <= r9) goto L22
            goto L6d
        L22:
            java.io.InputStream r7 = r7.getInputStream()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L32
            int r3 = r7.read()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            r4 = -1
            if (r3 == r4) goto L6d
            goto L39
        L32:
            r5 = 2048(0x800, double:1.012E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L39
            goto L6d
        L39:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            if (r4 != 0) goto L51
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            if (r3 == 0) goto L6d
        L51:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            com.google.ads.interactivemedia.v3.internal.ajr.b(r3)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
            r3.invoke(r7, r4)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L89
        L6d:
            r2.close()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> L89
            goto L7a
        L71:
            r2 = move-exception
            com.google.ads.interactivemedia.v3.internal.ajx r3 = new com.google.ads.interactivemedia.v3.internal.ajx     // Catch: java.lang.Throwable -> L89
            int r4 = com.google.ads.interactivemedia.v3.internal.amn.f20135a     // Catch: java.lang.Throwable -> L89
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L89
            throw r3     // Catch: java.lang.Throwable -> L89
        L7a:
            r10.f19950h = r0
            r10.k()
            boolean r0 = r10.f19951i
            if (r0 == 0) goto L88
            r10.f19951i = r1
            r10.h()
        L88:
            return
        L89:
            r2 = move-exception
            r10.f19950h = r0
            r10.k()
            boolean r0 = r10.f19951i
            if (r0 == 0) goto L98
            r10.f19951i = r1
            r10.h()
        L98:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ajt.f():void");
    }
}
