package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ati<K, V> extends asn<V, K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final atq<K, V> f20517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f20518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20519c;

    public ati(atq<K, V> atqVar, int i2) {
        this.f20517a = atqVar;
        this.f20518b = atqVar.f20532b[i2];
        this.f20519c = i2;
    }

    private final void a() {
        int i2 = this.f20519c;
        if (i2 != -1) {
            atq<K, V> atqVar = this.f20517a;
            if (i2 <= atqVar.f20533c && auv.w(this.f20518b, atqVar.f20532b[i2])) {
                return;
            }
        }
        this.f20519c = this.f20517a.e(this.f20518b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final V getKey() {
        return this.f20518b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final K getValue() {
        a();
        int i2 = this.f20519c;
        if (i2 == -1) {
            return null;
        }
        return this.f20517a.f20531a[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asn, java.util.Map.Entry
    public final K setValue(K k2) {
        a();
        int i2 = this.f20519c;
        if (i2 == -1) {
            return this.f20517a.q(this.f20518b, k2);
        }
        K k3 = this.f20517a.f20531a[i2];
        if (auv.w(k3, k2)) {
            return k2;
        }
        this.f20517a.B(this.f20519c, k2);
        return k3;
    }
}
