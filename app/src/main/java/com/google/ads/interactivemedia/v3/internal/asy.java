package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class asy extends asn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ata f20489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20491c;

    public asy(ata ataVar, int i2) {
        this.f20489a = ataVar;
        this.f20490b = ataVar.f20500b[i2];
        this.f20491c = i2;
    }

    private final void a() {
        int i2 = this.f20491c;
        if (i2 == -1 || i2 >= this.f20489a.size() || !auv.w(this.f20490b, this.f20489a.f20500b[this.f20491c])) {
            this.f20491c = this.f20489a.r(this.f20490b);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final Object getKey() {
        return this.f20490b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final Object getValue() {
        Map mapK = this.f20489a.k();
        if (mapK != null) {
            return mapK.get(this.f20490b);
        }
        a();
        int i2 = this.f20491c;
        if (i2 == -1) {
            return null;
        }
        return this.f20489a.f20501c[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapK = this.f20489a.k();
        if (mapK != null) {
            return mapK.put(this.f20490b, obj);
        }
        a();
        int i2 = this.f20491c;
        if (i2 == -1) {
            this.f20489a.put(this.f20490b, obj);
            return null;
        }
        Object[] objArr = this.f20489a.f20501c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
