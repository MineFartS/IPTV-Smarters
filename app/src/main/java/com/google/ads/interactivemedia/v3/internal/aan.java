package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class aan extends im {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f18990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f18991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final mg[] f18992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f18993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<Object, Integer> f18994h;

    public aan(Collection collection, acn acnVar) {
        super(acnVar);
        int size = collection.size();
        this.f18990d = new int[size];
        this.f18991e = new int[size];
        this.f18992f = new mg[size];
        this.f18993g = new Object[size];
        this.f18994h = new HashMap<>();
        Iterator it = collection.iterator();
        int iT = 0;
        int iS = 0;
        int i2 = 0;
        while (it.hasNext()) {
            aap aapVar = (aap) it.next();
            this.f18992f[i2] = aapVar.f18995a.D();
            this.f18991e[i2] = iT;
            this.f18990d[i2] = iS;
            iT += this.f18992f[i2].t();
            iS += this.f18992f[i2].s();
            Object[] objArr = this.f18993g;
            Object obj = aapVar.f18996b;
            objArr[i2] = obj;
            this.f18994h.put(obj, Integer.valueOf(i2));
            i2++;
        }
        this.f18988b = iT;
        this.f18989c = iS;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int a(Object obj) {
        Integer num = this.f18994h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int b(int i2) {
        return amn.aj(this.f18990d, i2 + 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int c(int i2) {
        return amn.aj(this.f18991e, i2 + 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int d(int i2) {
        return this.f18990d[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final int f(int i2) {
        return this.f18991e[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final mg m(int i2) {
        return this.f18992f[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.im
    public final Object p(int i2) {
        return this.f18993g[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int s() {
        return this.f18989c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.mg
    public final int t() {
        return this.f18988b;
    }
}
