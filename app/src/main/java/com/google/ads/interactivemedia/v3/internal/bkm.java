package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bkm f21292a = new bkm(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f21293b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile bkm f21294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<bkl, blt> f21295d;

    public bkm() {
        this.f21295d = new HashMap();
    }

    public bkm(byte[] bArr) {
        this.f21295d = Collections.emptyMap();
    }

    public static bkm a() {
        bkm bkmVar = f21294c;
        if (bkmVar == null) {
            synchronized (bkm.class) {
                bkmVar = f21294c;
                if (bkmVar == null) {
                    bkmVar = f21292a;
                    f21294c = bkmVar;
                }
            }
        }
        return bkmVar;
    }

    public final <ContainingType extends blz> blt b(ContainingType containingtype, int i2) {
        return this.f21295d.get(new bkl(containingtype, i2));
    }
}
