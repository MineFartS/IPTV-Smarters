package c.f.a.b.e3.g1;

import android.os.SystemClock;
import c.f.a.b.z2.x;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.e3.g1.o0.e f7596a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7599d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.z2.l f7602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7603h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7606k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f7597b = new c.f.a.b.j3.i0(65507);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f7598c = new c.f.a.b.j3.i0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7600e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f7601f = new p();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f7604i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f7605j = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7607l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7608m = -9223372036854775807L;

    public n(q qVar, int i2) {
        this.f7599d = i2;
        this.f7596a = (c.f.a.b.e3.g1.o0.e) c.f.a.b.j3.g.e(new c.f.a.b.e3.g1.o0.a().a(qVar));
    }

    public static long b(long j2) {
        return j2 - 30;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        synchronized (this.f7600e) {
            this.f7607l = j2;
            this.f7608m = j3;
        }
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.f7596a.d(lVar, this.f7599d);
        lVar.p();
        lVar.i(new x.b(-9223372036854775807L));
        this.f7602g = lVar;
    }

    public boolean d() {
        return this.f7603h;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public void f() {
        synchronized (this.f7600e) {
            this.f7606k = true;
        }
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) {
        c.f.a.b.j3.g.e(this.f7602g);
        int iB = kVar.b(this.f7597b.d(), 0, 65507);
        if (iB == -1) {
            return -1;
        }
        if (iB == 0) {
            return 0;
        }
        this.f7597b.P(0);
        this.f7597b.O(iB);
        o oVarB = o.b(this.f7597b);
        if (oVarB == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jB = b(jElapsedRealtime);
        this.f7601f.e(oVarB, jElapsedRealtime);
        o oVarF = this.f7601f.f(jB);
        if (oVarF == null) {
            return 0;
        }
        if (!this.f7603h) {
            if (this.f7604i == -9223372036854775807L) {
                this.f7604i = oVarF.f7618i;
            }
            if (this.f7605j == -1) {
                this.f7605j = oVarF.f7617h;
            }
            this.f7596a.c(this.f7604i, this.f7605j);
            this.f7603h = true;
        }
        synchronized (this.f7600e) {
            if (!this.f7606k) {
                do {
                    this.f7598c.M(oVarF.f7621l);
                    this.f7596a.b(this.f7598c, oVarF.f7618i, oVarF.f7617h, oVarF.f7615f);
                    oVarF = this.f7601f.f(jB);
                } while (oVarF != null);
            } else if (this.f7607l != -9223372036854775807L && this.f7608m != -9223372036854775807L) {
                this.f7601f.h();
                this.f7596a.a(this.f7607l, this.f7608m);
                this.f7606k = false;
                this.f7607l = -9223372036854775807L;
                this.f7608m = -9223372036854775807L;
            }
        }
        return 0;
    }

    public void h(int i2) {
        this.f7605j = i2;
    }

    public void i(long j2) {
        this.f7604i = j2;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
