package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lo extends im {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f22336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f22337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mg[] f22338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f22339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<Object, Integer> f22340h;

    public lo(Collection collection, acn acnVar) {
        super(acnVar);
        int size = collection.size();
        this.f22336d = new int[size];
        this.f22337e = new int[size];
        this.f22338f = new mg[size];
        this.f22339g = new Object[size];
        this.f22340h = new HashMap<>();
        Iterator it = collection.iterator();
        int iT = 0;
        int iS = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ku kuVar = (ku) it.next();
            this.f22338f[i2] = kuVar.a();
            this.f22337e[i2] = iT;
            this.f22336d[i2] = iS;
            iT += this.f22338f[i2].t();
            iS += this.f22338f[i2].s();
            this.f22339g[i2] = kuVar.b();
            this.f22340h.put(this.f22339g[i2], Integer.valueOf(i2));
            i2++;
        }
        this.f22334b = iT;
        this.f22335c = iS;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int a(Object obj) {
        Integer num = this.f22340h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int b(int i2) {
        return amn.aj(this.f22336d, i2 + 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int c(int i2) {
        return amn.aj(this.f22337e, i2 + 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int d(int i2) {
        return this.f22336d[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int f(int i2) {
        return this.f22337e[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final mg m(int i2) {
        return this.f22338f[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final Object p(int i2) {
        return this.f22339g[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int s() {
        return this.f22335c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int t() {
        return this.f22334b;
    }

    public final List<mg> u() {
        return Arrays.asList(this.f22338f);
    }
}
