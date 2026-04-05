package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.t2.h0;
import c.f.a.b.z2.m0.i0;
import com.amazonaws.event.ProgressEvent;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.a f11416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f11424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11426l;

    public v() {
        this(null);
    }

    public v(String str) {
        this.f11420f = 0;
        c.f.a.b.j3.i0 i0Var = new c.f.a.b.j3.i0(4);
        this.f11415a = i0Var;
        i0Var.d()[0] = -1;
        this.f11416b = new h0.a();
        this.f11417c = str;
    }

    public final void a(c.f.a.b.j3.i0 i0Var) {
        byte[] bArrD = i0Var.d();
        int iF = i0Var.f();
        for (int iE = i0Var.e(); iE < iF; iE++) {
            boolean z = (bArrD[iE] & 255) == 255;
            boolean z2 = this.f11423i && (bArrD[iE] & 224) == 224;
            this.f11423i = z;
            if (z2) {
                i0Var.P(iE + 1);
                this.f11423i = false;
                this.f11415a.d()[1] = bArrD[iE];
                this.f11421g = 2;
                this.f11420f = 1;
                return;
            }
        }
        i0Var.P(iF);
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.j3.g.i(this.f11418d);
        while (i0Var.a() > 0) {
            int i2 = this.f11420f;
            if (i2 == 0) {
                a(i0Var);
            } else if (i2 == 1) {
                h(i0Var);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException();
                }
                g(i0Var);
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11420f = 0;
        this.f11421g = 0;
        this.f11423i = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11419e = dVar.b();
        this.f11418d = lVar.e(dVar.c(), 1);
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11426l = j2;
    }

    @RequiresNonNull({"output"})
    public final void g(c.f.a.b.j3.i0 i0Var) {
        int iMin = Math.min(i0Var.a(), this.f11425k - this.f11421g);
        this.f11418d.c(i0Var, iMin);
        int i2 = this.f11421g + iMin;
        this.f11421g = i2;
        int i3 = this.f11425k;
        if (i2 < i3) {
            return;
        }
        this.f11418d.d(this.f11426l, 1, i3, 0, null);
        this.f11426l += this.f11424j;
        this.f11421g = 0;
        this.f11420f = 0;
    }

    @RequiresNonNull({"output"})
    public final void h(c.f.a.b.j3.i0 i0Var) {
        int iMin = Math.min(i0Var.a(), 4 - this.f11421g);
        i0Var.j(this.f11415a.d(), this.f11421g, iMin);
        int i2 = this.f11421g + iMin;
        this.f11421g = i2;
        if (i2 < 4) {
            return;
        }
        this.f11415a.P(0);
        if (!this.f11416b.a(this.f11415a.n())) {
            this.f11421g = 0;
            this.f11420f = 1;
            return;
        }
        h0.a aVar = this.f11416b;
        this.f11425k = aVar.f10074c;
        if (!this.f11422h) {
            this.f11424j = (((long) aVar.f10078g) * 1000000) / ((long) aVar.f10075d);
            this.f11418d.e(new k1.b().S(this.f11419e).e0(this.f11416b.f10073b).W(ProgressEvent.PART_FAILED_EVENT_CODE).H(this.f11416b.f10076e).f0(this.f11416b.f10075d).V(this.f11417c).E());
            this.f11422h = true;
        }
        this.f11415a.P(0);
        this.f11418d.c(this.f11415a, 4);
        this.f11420f = 2;
    }
}
