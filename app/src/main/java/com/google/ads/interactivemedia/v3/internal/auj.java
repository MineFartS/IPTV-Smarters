package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class auj implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f20576a;

    public auj(Object[] objArr) {
        this.f20576a = objArr;
    }

    public Object readResolve() {
        return auk.k(this.f20576a);
    }
}
