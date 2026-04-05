package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bff<T> extends bfv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private bfv<T> f21029a;

    public final void a(bfv<T> bfvVar) {
        if (this.f21029a != null) {
            throw new AssertionError();
        }
        this.f21029a = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final T read(bjj bjjVar) {
        bfv<T> bfvVar = this.f21029a;
        if (bfvVar != null) {
            return bfvVar.read(bjjVar);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, T t) {
        bfv<T> bfvVar = this.f21029a;
        if (bfvVar == null) {
            throw new IllegalStateException();
        }
        bfvVar.write(bjlVar, t);
    }
}
