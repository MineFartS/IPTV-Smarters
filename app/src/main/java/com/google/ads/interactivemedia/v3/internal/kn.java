package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km f22193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kl f22194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kp f22195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kj f22196e;

    public /* synthetic */ kn(String str, kj kjVar, km kmVar, kl klVar, kp kpVar) {
        this.f22192a = str;
        this.f22193b = kmVar;
        this.f22194c = klVar;
        this.f22195d = kpVar;
        this.f22196e = kjVar;
    }

    public final ki a() {
        return new ki(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return amn.O(this.f22192a, knVar.f22192a) && this.f22196e.equals(knVar.f22196e) && amn.O(this.f22193b, knVar.f22193b) && amn.O(this.f22194c, knVar.f22194c) && amn.O(this.f22195d, knVar.f22195d);
    }

    public final int hashCode() {
        int iHashCode = this.f22192a.hashCode() * 31;
        km kmVar = this.f22193b;
        return ((((((iHashCode + (kmVar != null ? kmVar.hashCode() : 0)) * 31) + this.f22194c.hashCode()) * 31) + this.f22196e.hashCode()) * 31) + this.f22195d.hashCode();
    }
}
