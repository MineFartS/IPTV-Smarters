package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class agp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<aml> f19619a = new SparseArray<>();

    public final aml a(int i2) {
        aml amlVar = this.f19619a.get(i2);
        if (amlVar != null) {
            return amlVar;
        }
        aml amlVar2 = new aml(Long.MAX_VALUE);
        this.f19619a.put(i2, amlVar2);
        return amlVar2;
    }

    public final void b() {
        this.f19619a.clear();
    }
}
