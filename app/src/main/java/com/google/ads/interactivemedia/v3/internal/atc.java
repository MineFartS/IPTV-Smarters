package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class atc extends ate {
    public static final ate f(int i2) {
        return i2 < 0 ? ate.f20511b : i2 > 0 ? ate.f20512c : ate.f20510a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ate
    public final int a() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ate
    public final ate b(int i2, int i3) {
        return f(i2 < i3 ? -1 : i2 > i3 ? 1 : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ate
    public final <T> ate c(T t, T t2, Comparator<T> comparator) {
        return f(comparator.compare(t, t2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ate
    public final ate d(boolean z, boolean z2) {
        return f(avq.f(z, z2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ate
    public final ate e(boolean z, boolean z2) {
        return f(avq.f(z2, z));
    }
}
