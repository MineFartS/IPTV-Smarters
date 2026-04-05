package c.f.c.s.r;

import c.f.c.s.o;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f16325a = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f16326b = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f16327c = o.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16329e;

    public static boolean c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    public static boolean d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    public final synchronized long a(int i2) {
        if (!c(i2)) {
            return f16325a;
        }
        double dPow = Math.pow(2.0d, this.f16329e);
        double dE = this.f16327c.e();
        Double.isNaN(dE);
        return (long) Math.min(dPow + dE, f16326b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f16329e     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            c.f.c.s.o r0 = r5.f16327c     // Catch: java.lang.Throwable -> L17
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.f16328d     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r5)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.c.s.r.e.b():boolean");
    }

    public final synchronized void e() {
        this.f16329e = 0;
    }

    public synchronized void f(int i2) {
        if (d(i2)) {
            e();
            return;
        }
        this.f16329e++;
        this.f16328d = this.f16327c.a() + a(i2);
    }
}
