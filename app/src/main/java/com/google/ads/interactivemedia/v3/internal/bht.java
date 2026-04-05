package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bht implements bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bjh<?> f21162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bfr<?> f21164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bfk<?> f21165d;

    public bht(Object obj, bjh<?> bjhVar, boolean z) {
        bfr<?> bfrVar = obj instanceof bfr ? (bfr) obj : null;
        this.f21164c = bfrVar;
        bfk<?> bfkVar = obj instanceof bfk ? (bfk) obj : null;
        this.f21165d = bfkVar;
        boolean z2 = true;
        if (bfrVar == null && bfkVar == null) {
            z2 = false;
        }
        art.e(z2);
        this.f21162a = bjhVar;
        this.f21163b = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final <T> bfv<T> a(bfg bfgVar, bjh<T> bjhVar) {
        if (this.f21162a.equals(bjhVar) || (this.f21163b && this.f21162a.d() == bjhVar.c())) {
            return new bhu(this.f21164c, this.f21165d, bfgVar, bjhVar, this);
        }
        return null;
    }
}
