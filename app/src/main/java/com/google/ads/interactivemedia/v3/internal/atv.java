package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class atv<E> extends avu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aty<E> f20552a;

    public atv(aty<E> atyVar, int i2) {
        super(atyVar.size(), i2);
        this.f20552a = atyVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avu
    public final E a(int i2) {
        return this.f20552a.get(i2);
    }
}
