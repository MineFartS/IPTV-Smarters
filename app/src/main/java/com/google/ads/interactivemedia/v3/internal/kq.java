package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class kq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abe f22214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ack[] f22216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kr f22219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f22221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final lr[] f22222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aip f22223j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final la f22224k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private kq f22225l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private act f22226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private aiq f22227n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f22228o;

    public kq(lr[] lrVarArr, long j2, aip aipVar, ajm ajmVar, la laVar, kr krVar, aiq aiqVar) {
        this.f22222i = lrVarArr;
        this.f22228o = j2;
        this.f22223j = aipVar;
        this.f22224k = laVar;
        abg abgVar = krVar.f22229a;
        this.f22215b = abgVar.f19056a;
        this.f22219f = krVar;
        this.f22226m = act.f19206a;
        this.f22227n = aiqVar;
        this.f22216c = new ack[2];
        this.f22221h = new boolean[2];
        long j3 = krVar.f22230b;
        long j4 = krVar.f22232d;
        abe abeVarM = laVar.m(abgVar, ajmVar, j3);
        this.f22214a = j4 != -9223372036854775807L ? new aag(abeVarM, j4) : abeVarM;
    }

    private final void u() {
        if (!w()) {
            return;
        }
        int i2 = 0;
        while (true) {
            aiq aiqVar = this.f22227n;
            if (i2 >= aiqVar.f19845a) {
                return;
            }
            boolean zB = aiqVar.b(i2);
            aii aiiVar = this.f22227n.f19847c[i2];
            if (zB && aiiVar != null) {
                aiiVar.g();
            }
            i2++;
        }
    }

    private final void v() {
        if (!w()) {
            return;
        }
        int i2 = 0;
        while (true) {
            aiq aiqVar = this.f22227n;
            if (i2 >= aiqVar.f19845a) {
                return;
            }
            boolean zB = aiqVar.b(i2);
            aii aiiVar = this.f22227n.f19847c[i2];
            if (zB && aiiVar != null) {
                aiiVar.h();
            }
            i2++;
        }
    }

    private final boolean w() {
        return this.f22225l == null;
    }

    public final long a(aiq aiqVar, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= aiqVar.f19845a) {
                break;
            }
            boolean[] zArr2 = this.f22221h;
            if (z || !aiqVar.a(this.f22227n, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            lr[] lrVarArr = this.f22222i;
            if (i3 >= 2) {
                break;
            }
            lrVarArr[i3].b();
            i3++;
        }
        u();
        this.f22227n = aiqVar;
        v();
        long jF = this.f22214a.f(aiqVar.f19847c, this.f22221h, this.f22216c, zArr, j2);
        int i4 = 0;
        while (true) {
            lr[] lrVarArr2 = this.f22222i;
            if (i4 >= 2) {
                break;
            }
            lrVarArr2[i4].b();
            i4++;
        }
        this.f22218e = false;
        int i5 = 0;
        while (true) {
            ack[] ackVarArr = this.f22216c;
            if (i5 >= 2) {
                return jF;
            }
            if (ackVarArr[i5] != null) {
                ajr.f(aiqVar.b(i5));
                this.f22222i[i5].b();
                this.f22218e = true;
            } else {
                ajr.f(aiqVar.f19847c[i5] == null);
            }
            i5++;
        }
    }

    public final long b() {
        if (!this.f22217d) {
            return this.f22219f.f22230b;
        }
        long jBc = this.f22218e ? this.f22214a.bc() : Long.MIN_VALUE;
        return jBc == Long.MIN_VALUE ? this.f22219f.f22233e : jBc;
    }

    public final long c() {
        if (this.f22217d) {
            return this.f22214a.c();
        }
        return 0L;
    }

    public final long d() {
        return this.f22228o;
    }

    public final long e() {
        return this.f22219f.f22230b + this.f22228o;
    }

    public final long f(long j2) {
        return j2 - this.f22228o;
    }

    public final long g(long j2) {
        return j2 + this.f22228o;
    }

    public final kq h() {
        return this.f22225l;
    }

    public final act i() {
        return this.f22226m;
    }

    public final aiq j() {
        return this.f22227n;
    }

    public final aiq k(float f2, mg mgVar) {
        aiq aiqVarH = this.f22223j.h(this.f22222i, this.f22226m, this.f22219f.f22229a, mgVar);
        for (aii aiiVar : aiqVarH.f19847c) {
            if (aiiVar != null) {
                aiiVar.i(f2);
            }
        }
        return aiqVarH;
    }

    public final void l(long j2) {
        ajr.f(w());
        this.f22214a.m(f(j2));
    }

    public final void m(float f2, mg mgVar) {
        this.f22217d = true;
        this.f22226m = this.f22214a.h();
        aiq aiqVarK = k(f2, mgVar);
        kr krVar = this.f22219f;
        long jMax = krVar.f22230b;
        long j2 = krVar.f22233e;
        if (j2 != -9223372036854775807L && jMax >= j2) {
            jMax = Math.max(0L, j2 - 1);
        }
        long jS = s(aiqVarK, jMax);
        long j3 = this.f22228o;
        kr krVar2 = this.f22219f;
        this.f22228o = j3 + (krVar2.f22230b - jS);
        this.f22219f = krVar2.b(jS);
    }

    public final void n(long j2) {
        ajr.f(w());
        if (this.f22217d) {
            this.f22214a.l(f(j2));
        }
    }

    public final void o() {
        u();
        la laVar = this.f22224k;
        abe abeVar = this.f22214a;
        try {
            if (abeVar instanceof aag) {
                laVar.g(((aag) abeVar).f18969a);
            } else {
                laVar.g(abeVar);
            }
        } catch (RuntimeException e2) {
            alj.a("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void p(kq kqVar) {
        if (kqVar == this.f22225l) {
            return;
        }
        u();
        this.f22225l = kqVar;
        v();
    }

    public final void q() {
        abe abeVar = this.f22214a;
        if (abeVar instanceof aag) {
            long j2 = this.f22219f.f22232d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((aag) abeVar).q(j2);
        }
    }

    public final boolean r() {
        return this.f22217d && (!this.f22218e || this.f22214a.bc() == Long.MIN_VALUE);
    }

    public final long s(aiq aiqVar, long j2) {
        return a(aiqVar, j2, false, new boolean[2]);
    }

    public final void t() {
        this.f22228o = 0L;
    }
}
