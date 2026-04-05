package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ky implements ku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abb f22262a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22266e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<abg> f22264c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22263b = new Object();

    public ky(abi abiVar, boolean z) {
        this.f22262a = new abb(abiVar, z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ku
    public final mg a() {
        return this.f22262a.D();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ku
    public final Object b() {
        return this.f22263b;
    }

    public final void c(int i2) {
        this.f22265d = i2;
        this.f22266e = false;
        this.f22264c.clear();
    }
}
