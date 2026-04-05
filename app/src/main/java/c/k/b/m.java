package c.k.b;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class m implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap<String, Bitmap> f18728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18734h;

    public m(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.f18729c = i2;
        this.f18728b = new LinkedHashMap<>(0, 0.75f, true);
    }

    public m(Context context) {
        this(g0.b(context));
    }

    @Override // c.k.b.d
    public final synchronized int a() {
        return this.f18729c;
    }

    @Override // c.k.b.d
    public void b(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f18731e++;
            this.f18730d += g0.k(bitmap);
            Bitmap bitmapPut = this.f18728b.put(str, bitmap);
            if (bitmapPut != null) {
                this.f18730d -= g0.k(bitmapPut);
            }
        }
        c(this.f18729c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f18730d     // Catch: java.lang.Throwable -> L71
            if (r0 < 0) goto L52
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f18728b     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L11
            int r0 = r3.f18730d     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L52
        L11:
            int r0 = r3.f18730d     // Catch: java.lang.Throwable -> L71
            if (r0 <= r4) goto L50
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f18728b     // Catch: java.lang.Throwable -> L71
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L1e
            goto L50
        L1e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f18728b     // Catch: java.lang.Throwable -> L71
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L71
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L71
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L71
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L71
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f18728b     // Catch: java.lang.Throwable -> L71
            r2.remove(r1)     // Catch: java.lang.Throwable -> L71
            int r1 = r3.f18730d     // Catch: java.lang.Throwable -> L71
            int r0 = c.k.b.g0.k(r0)     // Catch: java.lang.Throwable -> L71
            int r1 = r1 - r0
            r3.f18730d = r1     // Catch: java.lang.Throwable -> L71
            int r0 = r3.f18732f     // Catch: java.lang.Throwable -> L71
            int r0 = r0 + 1
            r3.f18732f = r0     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L0
        L50:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            return
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L71
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L71
            throw r4     // Catch: java.lang.Throwable -> L71
        L71:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            goto L75
        L74:
            throw r4
        L75:
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: c.k.b.m.c(int):void");
    }

    @Override // c.k.b.d
    public Bitmap get(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Bitmap bitmap = this.f18728b.get(str);
            if (bitmap != null) {
                this.f18733g++;
                return bitmap;
            }
            this.f18734h++;
            return null;
        }
    }

    @Override // c.k.b.d
    public final synchronized int size() {
        return this.f18730d;
    }
}
