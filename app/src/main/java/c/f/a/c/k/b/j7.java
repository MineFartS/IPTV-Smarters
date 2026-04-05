package c.f.a.c.k.b;

import java.net.URL;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f14004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k7 f14006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a5 f14007e;

    public j7(k7 k7Var, String str, URL url, byte[] bArr, Map map, a5 a5Var, byte[] bArr2) {
        this.f14006d = k7Var;
        c.f.a.c.f.q.o.e(str);
        c.f.a.c.f.q.o.i(url);
        c.f.a.c.f.q.o.i(a5Var);
        this.f14004b = url;
        this.f14007e = a5Var;
        this.f14005c = str;
    }

    public final /* synthetic */ void a(int i2, Exception exc, byte[] bArr, Map map) {
        this.f14007e.a(this.f14005c, i2, exc, bArr, map);
    }

    public final void b(final int i2, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f14006d.f14413a.d().r(new Runnable(this, i2, exc, bArr, map) { // from class: c.f.a.c.k.b.i7

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j7 f13969b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f13970c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Exception f13971d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final byte[] f13972e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final Map f13973f;

            {
                this.f13969b = this;
                this.f13970c = i2;
                this.f13971d = exc;
                this.f13972e = bArr;
                this.f13973f = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f13969b.a(this.f13970c, this.f13971d, this.f13972e, this.f13973f);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r9 = this;
            c.f.a.c.k.b.k7 r0 = r9.f14006d
            r0.f()
            r0 = 0
            r1 = 0
            c.f.a.c.k.b.k7 r2 = r9.f14006d     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            java.net.URL r3 = r9.f14004b     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            java.net.HttpURLConnection r2 = r2.o(r3)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L68
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L55
            java.util.Map r4 = r2.getHeaderFields()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.io.InputStream r6 = r2.getInputStream()     // Catch: java.lang.Throwable -> L3e
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L3c
        L24:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L3c
            if (r8 <= 0) goto L2e
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L3c
            goto L24
        L2e:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L3c
            r6.close()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r2.disconnect()
            r9.b(r3, r1, r0, r4)
            return
        L3c:
            r0 = move-exception
            goto L40
        L3e:
            r0 = move-exception
            r6 = r1
        L40:
            if (r6 == 0) goto L45
            r6.close()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L45:
            throw r0     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
        L46:
            r0 = move-exception
            goto L5f
        L48:
            r0 = move-exception
            goto L6d
        L4a:
            r0 = move-exception
            r4 = r1
            goto L5f
        L4d:
            r0 = move-exception
            r4 = r1
            goto L6d
        L50:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L5f
        L55:
            r3 = move-exception
            r4 = r1
            r0 = r3
            r3 = 0
            goto L6d
        L5a:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L5f:
            if (r2 == 0) goto L64
            r2.disconnect()
        L64:
            r9.b(r3, r1, r1, r4)
            throw r0
        L68:
            r2 = move-exception
            r4 = r1
            r0 = r2
            r3 = 0
            r2 = r4
        L6d:
            if (r2 == 0) goto L72
            r2.disconnect()
        L72:
            r9.b(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.j7.run():void");
    }
}
