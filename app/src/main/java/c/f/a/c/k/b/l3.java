package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l3<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f14046a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3<V> f14048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f14049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f14050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14051f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile V f14052g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile V f14053h = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l3(String str, Object obj, Object obj2, j3 j3Var, i3 i3Var) {
        this.f14047b = str;
        this.f14049d = obj;
        this.f14050e = obj2;
        this.f14048c = j3Var;
    }

    public final String a() {
        return this.f14047b;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V b(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14051f
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L7
            return r4
        L7:
            c.f.a.c.k.b.va r4 = c.f.a.c.k.b.k3.f14019a
            if (r4 == 0) goto L6b
            java.lang.Object r4 = c.f.a.c.k.b.l3.f14046a
            monitor-enter(r4)
            boolean r0 = c.f.a.c.k.b.va.a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L1f
            V r0 = r3.f14053h     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L1b
            V r0 = r3.f14049d     // Catch: java.lang.Throwable -> L68
            goto L1d
        L1b:
            V r0 = r3.f14053h     // Catch: java.lang.Throwable -> L68
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            return r0
        L1f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            java.util.List r4 = c.f.a.c.k.b.m3.c()     // Catch: java.lang.SecurityException -> L55
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L55
        L28:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L55
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L55
            c.f.a.c.k.b.l3 r0 = (c.f.a.c.k.b.l3) r0     // Catch: java.lang.SecurityException -> L55
            boolean r1 = c.f.a.c.k.b.va.a()     // Catch: java.lang.SecurityException -> L55
            if (r1 != 0) goto L4d
            r1 = 0
            c.f.a.c.k.b.j3<V> r2 = r0.f14048c     // Catch: java.lang.IllegalStateException -> L43 java.lang.SecurityException -> L55
            if (r2 == 0) goto L43
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L43 java.lang.SecurityException -> L55
        L43:
            java.lang.Object r2 = c.f.a.c.k.b.l3.f14046a     // Catch: java.lang.SecurityException -> L55
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L55
            r0.f14053h = r1     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            goto L28
        L4a:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4a
            throw r4     // Catch: java.lang.SecurityException -> L55
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L55
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L55
            throw r4     // Catch: java.lang.SecurityException -> L55
        L55:
        L56:
            c.f.a.c.k.b.j3<V> r4 = r3.f14048c
            if (r4 != 0) goto L5d
            V r4 = r3.f14049d
            return r4
        L5d:
            java.lang.Object r4 = r4.zza()     // Catch: java.lang.IllegalStateException -> L62 java.lang.SecurityException -> L65
            return r4
        L62:
            V r4 = r3.f14049d
            return r4
        L65:
            V r4 = r3.f14049d
            return r4
        L68:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L68
            throw r0
        L6b:
            V r4 = r3.f14049d
            return r4
        L6e:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            goto L72
        L71:
            throw r4
        L72:
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.k.b.l3.b(java.lang.Object):java.lang.Object");
    }
}
