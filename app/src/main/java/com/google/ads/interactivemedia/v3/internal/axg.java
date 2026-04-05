package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class axg<PrimitiveT, KeyT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<PrimitiveT> f20683a;

    public axg(Class<PrimitiveT> cls) {
        this.f20683a = cls;
    }

    public final Class<PrimitiveT> a() {
        return this.f20683a;
    }

    public abstract PrimitiveT b(KeyT keyt);
}
