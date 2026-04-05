package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;
import c.f.a.b.z2.m0.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f11138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11139b = new c.f.a.b.j3.i0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11143f;

    public d0(c0 c0Var) {
        this.f11138a = c0Var;
    }

    @Override // c.f.a.b.z2.m0.i0
    public void a(u0 u0Var, c.f.a.b.z2.l lVar, i0.d dVar) {
        this.f11138a.a(u0Var, lVar, dVar);
        this.f11143f = true;
    }

    @Override // c.f.a.b.z2.m0.i0
    public void b(c.f.a.b.j3.i0 i0Var, int i2) {
        boolean z = (i2 & 1) != 0;
        int iE = z ? i0Var.e() + i0Var.D() : -1;
        if (this.f11143f) {
            if (!z) {
                return;
            }
            this.f11143f = false;
            i0Var.P(iE);
            this.f11141d = 0;
        }
        while (i0Var.a() > 0) {
            int i3 = this.f11141d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iD = i0Var.D();
                    i0Var.P(i0Var.e() - 1);
                    if (iD == 255) {
                        this.f11143f = true;
                        return;
                    }
                }
                int iMin = Math.min(i0Var.a(), 3 - this.f11141d);
                i0Var.j(this.f11139b.d(), this.f11141d, iMin);
                int i4 = this.f11141d + iMin;
                this.f11141d = i4;
                if (i4 == 3) {
                    this.f11139b.P(0);
                    this.f11139b.O(3);
                    this.f11139b.Q(1);
                    int iD2 = this.f11139b.D();
                    int iD3 = this.f11139b.D();
                    this.f11142e = (iD2 & 128) != 0;
                    this.f11140c = (((iD2 & 15) << 8) | iD3) + 3;
                    int iB = this.f11139b.b();
                    int i5 = this.f11140c;
                    if (iB < i5) {
                        this.f11139b.c(Math.min(4098, Math.max(i5, this.f11139b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i0Var.a(), this.f11140c - this.f11141d);
                i0Var.j(this.f11139b.d(), this.f11141d, iMin2);
                int i6 = this.f11141d + iMin2;
                this.f11141d = i6;
                int i7 = this.f11140c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f11142e) {
                        this.f11139b.O(i7);
                    } else {
                        if (x0.u(this.f11139b.d(), 0, this.f11140c, -1) != 0) {
                            this.f11143f = true;
                            return;
                        }
                        this.f11139b.O(this.f11140c - 4);
                    }
                    this.f11139b.P(0);
                    this.f11138a.b(this.f11139b);
                    this.f11141d = 0;
                }
            }
        }
    }

    @Override // c.f.a.b.z2.m0.i0
    public void c() {
        this.f11143f = true;
    }
}
