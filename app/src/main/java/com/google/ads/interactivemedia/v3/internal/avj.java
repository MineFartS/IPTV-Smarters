package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class avj extends aty<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Object[] f20608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f20609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f20610c;

    public avj(Object[] objArr, int i2, int i3) {
        this.f20608a = objArr;
        this.f20609b = i2;
        this.f20610c = i3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        ars.f(i2, this.f20610c);
        return this.f20608a[i2 + i2 + this.f20609b];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20610c;
    }
}
