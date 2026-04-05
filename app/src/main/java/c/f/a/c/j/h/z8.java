package c.f.a.c.j.h;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class z8 extends b9 {
    public z8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // c.f.a.c.j.h.b9
    public final byte a(Object obj, long j2) {
        return c9.f13246i ? c9.h(obj, j2) : c9.i(obj, j2);
    }

    @Override // c.f.a.c.j.h.b9
    public final void b(Object obj, long j2, byte b2) {
        if (c9.f13246i) {
            c9.j(obj, j2, b2);
        } else {
            c9.k(obj, j2, b2);
        }
    }

    @Override // c.f.a.c.j.h.b9
    public final boolean c(Object obj, long j2) {
        return c9.f13246i ? c9.J(obj, j2) : c9.K(obj, j2);
    }

    /* JADX WARN: Failed to inline method: c.f.a.c.j.h.c9.a(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: c.f.a.c.j.h.c9.b(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: c.f.a.c.j.h.c9.a(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: c.f.a.c.j.h.c9.b(java.lang.Object, long, boolean):void */
    @Override // c.f.a.c.j.h.b9
    public final void d(Object obj, long j2, boolean z) {
        if (c9.f13246i) {
            c9.a(obj, j2, z);
        } else {
            c9.b(obj, j2, z);
        }
    }

    @Override // c.f.a.c.j.h.b9
    public final float e(Object obj, long j2) {
        return Float.intBitsToFloat(n(obj, j2));
    }

    @Override // c.f.a.c.j.h.b9
    public final void f(Object obj, long j2, float f2) {
        o(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // c.f.a.c.j.h.b9
    public final double g(Object obj, long j2) {
        return Double.longBitsToDouble(p(obj, j2));
    }

    @Override // c.f.a.c.j.h.b9
    public final void h(Object obj, long j2, double d2) {
        q(obj, j2, Double.doubleToLongBits(d2));
    }
}
