package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class akz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f20025a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20026b;

    public final ala a() {
        ajr.f(!this.f20026b);
        this.f20026b = true;
        return new ala(this.f20025a);
    }

    public final void b(int i2) {
        ajr.f(!this.f20026b);
        this.f20025a.append(i2, true);
    }
}
