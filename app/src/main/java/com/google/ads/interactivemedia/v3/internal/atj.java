package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class atj extends atp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ atq f20520a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atj(atq atqVar) {
        super(atqVar);
        this.f20520a = atqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atp
    public final /* bridge */ /* synthetic */ Object a(int i2) {
        return new ath(this.f20520a, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iC = this.f20520a.c(key);
            if (iC != -1 && auv.w(value, this.f20520a.f20532b[iC])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iU = auv.u(key);
        int iD = this.f20520a.d(key, iU);
        if (iD == -1 || !auv.w(value, this.f20520a.f20532b[iD])) {
            return false;
        }
        this.f20520a.j(iD, iU);
        return true;
    }
}
