package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ark;

/* JADX INFO: loaded from: classes.dex */
@ark(a = s.class)
public abstract class au {
    private static au create(double d2, double d3, boolean z) {
        return new s(d2, d3, z);
    }

    public abstract double end();

    public abstract boolean played();

    public abstract double start();
}
