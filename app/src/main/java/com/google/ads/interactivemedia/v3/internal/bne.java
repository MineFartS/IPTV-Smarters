package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class bne extends bng {
    public bne(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final double a(Object obj, long j2) {
        return Double.longBitsToDouble(k(obj, j2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final float b(Object obj, long j2) {
        return Float.intBitsToFloat(j(obj, j2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final void c(Object obj, long j2, boolean z) {
        if (bnh.f21449b) {
            bnh.F(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            bnh.G(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final void d(Object obj, long j2, byte b2) {
        if (bnh.f21449b) {
            bnh.F(obj, j2, b2);
        } else {
            bnh.G(obj, j2, b2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final void e(Object obj, long j2, double d2) {
        n(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final void f(Object obj, long j2, float f2) {
        m(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bng
    public final boolean g(Object obj, long j2) {
        return bnh.f21449b ? bnh.u(obj, j2) : bnh.v(obj, j2);
    }
}
