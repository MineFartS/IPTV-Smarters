package c.f.a.b.e3;

import android.net.Uri;
import c.f.a.b.p1;
import c.f.a.b.p2;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7989c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1 f7990d = new p1.c().v("SinglePeriodTimeline").B(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f8001o;
    public final p1 p;
    public final p1.f q;

    public v0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, Object obj, p1 p1Var, p1.f fVar) {
        this.f7991e = j2;
        this.f7992f = j3;
        this.f7993g = j4;
        this.f7994h = j5;
        this.f7995i = j6;
        this.f7996j = j7;
        this.f7997k = j8;
        this.f7998l = z;
        this.f7999m = z2;
        this.f8000n = z3;
        this.f8001o = obj;
        this.p = (p1) c.f.a.b.j3.g.e(p1Var);
        this.q = fVar;
    }

    public v0(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj, p1 p1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2, false, obj, p1Var, z3 ? p1Var.f9644e : null);
    }

    public v0(long j2, boolean z, boolean z2, boolean z3, Object obj, p1 p1Var) {
        this(j2, j2, 0L, 0L, z, z2, z3, obj, p1Var);
    }

    @Override // c.f.a.b.p2
    public int b(Object obj) {
        return f7989c.equals(obj) ? 0 : -1;
    }

    @Override // c.f.a.b.p2
    public p2.b g(int i2, p2.b bVar, boolean z) {
        c.f.a.b.j3.g.c(i2, 0, 1);
        return bVar.s(null, z ? f7989c : null, 0, this.f7994h, -this.f7996j);
    }

    @Override // c.f.a.b.p2
    public int i() {
        return 1;
    }

    @Override // c.f.a.b.p2
    public Object m(int i2) {
        c.f.a.b.j3.g.c(i2, 0, 1);
        return f7989c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[PHI: r1
  0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0016, B:7:0x001c, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // c.f.a.b.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.p2.c o(int r25, c.f.a.b.p2.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            c.f.a.b.j3.g.c(r3, r1, r2)
            long r1 = r0.f7997k
            boolean r14 = r0.f7999m
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f8000n
            if (r5 != 0) goto L2e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L2e
            long r5 = r0.f7995i
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = c.f.a.b.p2.c.f9709a
            c.f.a.b.p1 r5 = r0.p
            java.lang.Object r6 = r0.f8001o
            long r7 = r0.f7991e
            long r9 = r0.f7992f
            long r11 = r0.f7993g
            boolean r13 = r0.f7998l
            c.f.a.b.p1$f r15 = r0.q
            long r1 = r0.f7995i
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f7996j
            r22 = r1
            r3 = r26
            c.f.a.b.p2$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.v0.o(int, c.f.a.b.p2$c, long):c.f.a.b.p2$c");
    }

    @Override // c.f.a.b.p2
    public int p() {
        return 1;
    }
}
