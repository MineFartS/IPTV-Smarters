package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class biq implements bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bjh f21178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bfv f21179b;

    public biq(bjh bjhVar, bfv bfvVar) {
        this.f21178a = bjhVar;
        this.f21179b = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final <T> bfv<T> a(bfg bfgVar, bjh<T> bjhVar) {
        if (bjhVar.equals(this.f21178a)) {
            return this.f21179b;
        }
        return null;
    }
}
