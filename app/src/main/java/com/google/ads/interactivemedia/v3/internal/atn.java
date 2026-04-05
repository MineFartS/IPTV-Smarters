package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class atn extends atp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ atq f20524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atn(atq atqVar) {
        super(atqVar);
        this.f20524a = atqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atp
    public final Object a(int i2) {
        return this.f20524a.f20532b[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20524a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iU = auv.u(obj);
        int iF = this.f20524a.f(obj, iU);
        if (iF == -1) {
            return false;
        }
        this.f20524a.k(iF, iU);
        return true;
    }
}
