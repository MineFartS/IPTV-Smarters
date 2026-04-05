package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class ape extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20332a;

    public ape(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("Signal SDK error code: ");
        sb.append(i2);
        super(sb.toString());
        this.f20332a = i2;
    }

    public final int a() {
        return this.f20332a;
    }
}
