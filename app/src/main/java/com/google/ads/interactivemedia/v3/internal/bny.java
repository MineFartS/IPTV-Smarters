package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bny<L, R> extends bnz<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R f21497b;

    static {
        new bny(null, null);
    }

    public bny(L l2, R r) {
        this.f21496a = l2;
        this.f21497b = r;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final L a() {
        return this.f21496a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnz
    public final R b() {
        return this.f21497b;
    }

    @Override // java.util.Map.Entry
    public final R setValue(R r) {
        throw new UnsupportedOperationException();
    }
}
