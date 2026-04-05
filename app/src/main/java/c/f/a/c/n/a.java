package c.f.a.c.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import c.f.a.c.f.q.o;
import c.f.a.c.f.t.n;
import c.f.a.c.f.t.p;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes2.dex */
@ThreadSafe
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ScheduledExecutorService f14550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile InterfaceC0162a f14551b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f14553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkSource f14554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f14559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, Integer[]> f14561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<Future<?>> f14562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AtomicInteger f14564o;

    /* JADX INFO: renamed from: c.f.a.c.n.a$a, reason: collision with other inner class name */
    public interface InterfaceC0162a {
    }

    public a(Context context, int i2, String str) {
        this(context, i2, str, null, context == null ? null : context.getPackageName());
    }

    public a(Context context, int i2, String str, String str2, String str3) {
        this(context, i2, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public a(Context context, int i2, String str, String str2, String str3, String str4) {
        this.f14552c = this;
        this.f14560k = true;
        this.f14561l = new HashMap();
        this.f14562m = Collections.synchronizedSet(new HashSet());
        this.f14564o = new AtomicInteger(0);
        o.j(context, "WakeLock: context must not be null");
        o.f(str, "WakeLock: wakeLockName must not be empty");
        this.f14555f = i2;
        this.f14557h = null;
        this.f14558i = null;
        Context applicationContext = context.getApplicationContext();
        this.f14559j = applicationContext;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f14556g = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f14556g = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i2, str);
        this.f14553d = wakeLockNewWakeLock;
        if (p.c(context)) {
            WorkSource workSourceA = p.a(context, n.a(str3) ? context.getPackageName() : str3);
            this.f14554e = workSourceA;
            if (workSourceA != null && p.c(applicationContext)) {
                WorkSource workSource = this.f14554e;
                if (workSource != null) {
                    workSource.add(workSourceA);
                } else {
                    this.f14554e = workSourceA;
                }
                try {
                    wakeLockNewWakeLock.setWorkSource(this.f14554e);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (f14550a == null) {
            f14550a = c.f.a.c.f.r.a.a().a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f14564o
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.d(r0)
            java.lang.Object r0 = r13.f14552c
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14561l     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.f14563n     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f14553d     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14561l     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.f14563n = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.f14560k     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14561l     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f14561l     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.f14560k     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.f14563n     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            c.f.a.c.f.s.c r1 = c.f.a.c.f.s.c.a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.f14559j     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f14553d     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = c.f.a.c.f.s.b.a(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.f14556g     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.f14555f     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.e()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.f14563n     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.f14563n = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f14553d
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = c.f.a.c.n.a.f14550a
            c.f.a.c.n.c r1 = new c.f.a.c.n.c
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.n.a.a(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:30:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:30:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f14564o
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f14556g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            r0 = 0
            java.lang.String r6 = r12.d(r0)
            java.lang.Object r0 = r12.f14552c
            monitor-enter(r0)
            boolean r1 = r12.f14560k     // Catch: java.lang.Throwable -> L7e
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f14561l     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L33
        L31:
            r1 = 0
            goto L50
        L33:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r10) goto L42
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f14561l     // Catch: java.lang.Throwable -> L7e
            r1.remove(r6)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            goto L50
        L42:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            r1[r11] = r2     // Catch: java.lang.Throwable -> L7e
            goto L31
        L50:
            if (r1 != 0) goto L5a
        L52:
            boolean r1 = r12.f14560k     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L79
            int r1 = r12.f14563n     // Catch: java.lang.Throwable -> L7e
            if (r1 != r10) goto L79
        L5a:
            c.f.a.c.f.s.c r1 = c.f.a.c.f.s.c.a()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r12.f14559j     // Catch: java.lang.Throwable -> L7e
            android.os.PowerManager$WakeLock r3 = r12.f14553d     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = c.f.a.c.f.s.b.a(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r4 = 8
            java.lang.String r5 = r12.f14556g     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r8 = r12.f14555f     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r12.e()     // Catch: java.lang.Throwable -> L7e
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            int r1 = r12.f14563n     // Catch: java.lang.Throwable -> L7e
            int r1 = r1 - r10
            r12.f14563n = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r12.f(r11)
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            goto L82
        L81:
            throw r1
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.n.a.b():void");
    }

    public void c(boolean z) {
        this.f14553d.setReferenceCounted(z);
        this.f14560k = z;
    }

    public final String d(String str) {
        return (!this.f14560k || TextUtils.isEmpty(str)) ? this.f14557h : str;
    }

    public final List<String> e() {
        return p.b(this.f14554e);
    }

    public final void f(int i2) {
        if (this.f14553d.isHeld()) {
            try {
                this.f14553d.release();
            } catch (RuntimeException e2) {
                if (!e2.getClass().equals(RuntimeException.class)) {
                    throw e2;
                }
                Log.e("WakeLock", String.valueOf(this.f14556g).concat(" was already released!"), e2);
            }
            this.f14553d.isHeld();
        }
    }
}
