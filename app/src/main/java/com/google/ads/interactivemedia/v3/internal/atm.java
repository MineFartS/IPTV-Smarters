package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class atm extends atp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ atq f20523a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atm(atq atqVar) {
        super(atqVar);
        this.f20523a = atqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atp
    public final Object a(int i2) {
        return this.f20523a.f20531a[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20523a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iU = auv.u(obj);
        int iD = this.f20523a.d(obj, iU);
        if (iD == -1) {
            return false;
        }
        this.f20523a.j(iD, iU);
        return true;
    }
}
