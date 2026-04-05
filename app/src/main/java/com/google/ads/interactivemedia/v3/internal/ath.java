package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ath extends asn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ atq f20516c;

    public ath(atq atqVar, int i2) {
        this.f20516c = atqVar;
        this.f20514a = atqVar.f20531a[i2];
        this.f20515b = i2;
    }

    public final void a() {
        int i2 = this.f20515b;
        if (i2 != -1) {
            atq atqVar = this.f20516c;
            if (i2 <= atqVar.f20533c && auv.w(atqVar.f20531a[i2], this.f20514a)) {
                return;
            }
        }
        this.f20515b = this.f20516c.c(this.f20514a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final Object getKey() {
        return this.f20514a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i2 = this.f20515b;
        if (i2 == -1) {
            return null;
        }
        return this.f20516c.f20532b[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i2 = this.f20515b;
        if (i2 == -1) {
            return this.f20516c.put(this.f20514a, obj);
        }
        Object obj2 = this.f20516c.f20532b[i2];
        if (auv.w(obj2, obj)) {
            return obj;
        }
        this.f20516c.C(this.f20515b, obj);
        return obj2;
    }
}
