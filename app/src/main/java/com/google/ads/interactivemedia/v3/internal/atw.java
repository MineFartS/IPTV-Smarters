package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class atw implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f20553a;

    public atw(Object[] objArr) {
        this.f20553a = objArr;
    }

    public Object readResolve() {
        return aty.m(this.f20553a);
    }
}
