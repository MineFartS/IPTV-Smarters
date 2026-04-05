package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class avg extends aty<Map.Entry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ avh f20602a;

    public avg(avh avhVar) {
        this.f20602a = avhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        ars.f(i2, this.f20602a.f20605c);
        int i3 = i2 + i2;
        return new AbstractMap.SimpleImmutableEntry(this.f20602a.f20604b[i3], this.f20602a.f20604b[i3 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20602a.f20605c;
    }
}
