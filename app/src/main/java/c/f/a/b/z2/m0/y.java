package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.z2.m0.i0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f11435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.h0 f11436b = new c.f.a.b.j3.h0(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11437c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f11439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11446l;

    public y(o oVar) {
        this.f11435a = oVar;
    }

    @Override // c.f.a.b.z2.m0.i0
    public void a(u0 u0Var, c.f.a.b.z2.l lVar, i0.d dVar) {
        this.f11439e = u0Var;
        this.f11435a.e(lVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007a -> B:35:0x007c). Please report as a decompilation issue!!! */
    @Override // c.f.a.b.z2.m0.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(c.f.a.b.j3.i0 r8, int r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.y.b(c.f.a.b.j3.i0, int):void");
    }

    @Override // c.f.a.b.z2.m0.i0
    public final void c() {
        this.f11437c = 0;
        this.f11438d = 0;
        this.f11442h = false;
        this.f11435a.c();
    }

    public final boolean d(c.f.a.b.j3.i0 i0Var, byte[] bArr, int i2) {
        int iMin = Math.min(i0Var.a(), i2 - this.f11438d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            i0Var.Q(iMin);
        } else {
            i0Var.j(bArr, this.f11438d, iMin);
        }
        int i3 = this.f11438d + iMin;
        this.f11438d = i3;
        return i3 == i2;
    }

    public final boolean e() {
        this.f11436b.p(0);
        int iH = this.f11436b.h(24);
        if (iH != 1) {
            c.f.a.b.j3.z.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f11444j = -1;
            return false;
        }
        this.f11436b.r(8);
        int iH2 = this.f11436b.h(16);
        this.f11436b.r(5);
        this.f11445k = this.f11436b.g();
        this.f11436b.r(2);
        this.f11440f = this.f11436b.g();
        this.f11441g = this.f11436b.g();
        this.f11436b.r(6);
        int iH3 = this.f11436b.h(8);
        this.f11443i = iH3;
        if (iH2 == 0) {
            this.f11444j = -1;
        } else {
            int i2 = ((iH2 + 6) - 9) - iH3;
            this.f11444j = i2;
            if (i2 < 0) {
                c.f.a.b.j3.z.i("PesReader", "Found negative packet payload size: " + this.f11444j);
                this.f11444j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    public final void f() {
        this.f11436b.p(0);
        this.f11446l = -9223372036854775807L;
        if (this.f11440f) {
            this.f11436b.r(4);
            long jH = ((long) this.f11436b.h(3)) << 30;
            this.f11436b.r(1);
            long jH2 = jH | ((long) (this.f11436b.h(15) << 15));
            this.f11436b.r(1);
            long jH3 = jH2 | ((long) this.f11436b.h(15));
            this.f11436b.r(1);
            if (!this.f11442h && this.f11441g) {
                this.f11436b.r(4);
                long jH4 = ((long) this.f11436b.h(3)) << 30;
                this.f11436b.r(1);
                long jH5 = jH4 | ((long) (this.f11436b.h(15) << 15));
                this.f11436b.r(1);
                long jH6 = jH5 | ((long) this.f11436b.h(15));
                this.f11436b.r(1);
                this.f11439e.b(jH6);
                this.f11442h = true;
            }
            this.f11446l = this.f11439e.b(jH3);
        }
    }

    public final void g(int i2) {
        this.f11437c = i2;
        this.f11438d = 0;
    }
}
