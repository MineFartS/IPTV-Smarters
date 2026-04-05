package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class iv implements lq, lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21984a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ls f21986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ack f21989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ke[] f21990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21991h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21994k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kf f21985b = new kf();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21992i = Long.MIN_VALUE;

    public iv(int i2) {
        this.f21984a = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void A() {
        this.f21993j = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void B(int i2) {
        this.f21987d = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public /* synthetic */ void C(float f2, float f3) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void D() {
        ajr.f(this.f21988e == 1);
        this.f21988e = 2;
        v();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void E() {
        ajr.f(this.f21988e == 2);
        this.f21988e = 1;
        w();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final boolean F() {
        return this.f21992i == Long.MIN_VALUE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final boolean G() {
        return this.f21993j;
    }

    public final boolean H() {
        if (F()) {
            return this.f21993j;
        }
        ack ackVar = this.f21989f;
        ajr.b(ackVar);
        return ackVar.e();
    }

    public final ke[] I() {
        return (ke[]) ajr.b(this.f21990g);
    }

    public void J(long j2, long j3) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final int aW() {
        return this.f21988e;
    }

    public final int aX(kf kfVar, pz pzVar, int i2) {
        ack ackVar = this.f21989f;
        ajr.b(ackVar);
        int iA = ackVar.a(kfVar, pzVar, i2);
        if (iA == -4) {
            if (pzVar.g()) {
                this.f21992i = Long.MIN_VALUE;
                return this.f21993j ? -4 : -3;
            }
            long j2 = pzVar.f22803d + this.f21991h;
            pzVar.f22803d = j2;
            this.f21992i = Math.max(this.f21992i, j2);
        } else if (iA == -5) {
            ke keVar = kfVar.f22161b;
            ajr.b(keVar);
            if (keVar.p != Long.MAX_VALUE) {
                kd kdVarB = keVar.b();
                kdVarB.ai(keVar.p + this.f21991h);
                kfVar.f22161b = kdVarB.s();
                return -5;
            }
        }
        return iA;
    }

    public final jb aY(Throwable th, ke keVar) {
        return h(th, keVar, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq, com.google.ads.interactivemedia.v3.internal.lr
    public final int b() {
        return this.f21984a;
    }

    public final int d(long j2) {
        ack ackVar = this.f21989f;
        ajr.b(ackVar);
        return ackVar.b(j2 - this.f21991h);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lr
    public int e() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final long f() {
        return this.f21992i;
    }

    public final jb h(Throwable th, ke keVar, boolean z) {
        int i2;
        if (keVar == null || this.f21994k) {
            i2 = 4;
        } else {
            this.f21994k = true;
            try {
                int iD = fq.d(O(keVar));
                this.f21994k = false;
                i2 = iD;
            } catch (jb unused) {
                this.f21994k = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.f21994k = false;
                throw th2;
            }
        }
        return jb.c(th, K(), this.f21987d, keVar, i2, z);
    }

    public final kf i() {
        this.f21985b.a();
        return this.f21985b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final lr j() {
        return this;
    }

    public final ls k() {
        ls lsVar = this.f21986c;
        ajr.b(lsVar);
        return lsVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final ack l() {
        return this.f21989f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public all m() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void n() {
        ajr.f(this.f21988e == 1);
        this.f21985b.a();
        this.f21988e = 0;
        this.f21989f = null;
        this.f21990g = null;
        this.f21993j = false;
        r();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void o(ls lsVar, ke[] keVarArr, ack ackVar, long j2, boolean z, boolean z2, long j3, long j4) {
        ajr.f(this.f21988e == 0);
        this.f21986c = lsVar;
        this.f21988e = 1;
        s(z, z2);
        x(keVarArr, ackVar, j3, j4);
        t(j2, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lm
    public void p(int i2, Object obj) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void q() {
        ack ackVar = this.f21989f;
        ajr.b(ackVar);
        ackVar.d();
    }

    public void r() {
        throw null;
    }

    public void s(boolean z, boolean z2) {
    }

    public void t(long j2, boolean z) {
        throw null;
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void x(ke[] keVarArr, ack ackVar, long j2, long j3) {
        ajr.f(!this.f21993j);
        this.f21989f = ackVar;
        if (this.f21992i == Long.MIN_VALUE) {
            this.f21992i = j2;
        }
        this.f21990g = keVarArr;
        this.f21991h = j3;
        J(j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void y() {
        ajr.f(this.f21988e == 0);
        this.f21985b.a();
        u();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq
    public final void z(long j2) {
        this.f21993j = false;
        this.f21992i = j2;
        t(j2, false);
    }
}
