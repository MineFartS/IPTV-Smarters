package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class atx extends aty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f20554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f20555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aty f20556c;

    public atx(aty atyVar, int i2, int i3) {
        this.f20556c = atyVar;
        this.f20554a = i2;
        this.f20555b = i3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int b() {
        return this.f20556c.c() + this.f20554a + this.f20555b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final int c() {
        return this.f20556c.c() + this.f20554a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final Object[] g() {
        return this.f20556c.g();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        ars.f(i2, this.f20555b);
        return this.f20556c.get(i2 + this.f20554a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aty
    /* JADX INFO: renamed from: h */
    public final aty subList(int i2, int i3) {
        ars.d(i2, i3, this.f20555b);
        aty atyVar = this.f20556c;
        int i4 = this.f20554a;
        return atyVar.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20555b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aty, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
