package c.f.a.d.p;

import c.f.a.d.j0.f;
import c.f.a.d.j0.m;

/* JADX INFO: loaded from: classes2.dex */
public class a extends f implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15209f;

    @Override // c.f.a.d.j0.f
    public void b(float f2, float f3, float f4, m mVar) {
        float f5 = this.f15207d;
        if (f5 == 0.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f6 = ((this.f15206c * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f15205b;
        float f8 = f3 + this.f15209f;
        float f9 = (this.f15208e * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float fSqrt = (float) Math.sqrt((f10 * f10) - (f11 * f11));
        float f12 = f8 - fSqrt;
        float f13 = f8 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f11));
        float f14 = 90.0f - degrees;
        mVar.m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        mVar.a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        mVar.m(f2, 0.0f);
    }

    public float c() {
        return this.f15208e;
    }

    public float e() {
        return this.f15206c;
    }

    public float f() {
        return this.f15205b;
    }

    public float g() {
        return this.f15207d;
    }

    public void h(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f15208e = f2;
    }

    public void j(float f2) {
        this.f15206c = f2;
    }

    public void k(float f2) {
        this.f15205b = f2;
    }

    public void l(float f2) {
        this.f15207d = f2;
    }

    public void m(float f2) {
        this.f15209f = f2;
    }
}
