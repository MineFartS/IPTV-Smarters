package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class bgf implements bgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bfi f21066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Type f21067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21068c;

    public bgf(bfi bfiVar, Type type) {
        this.f21066a = bfiVar;
        this.f21067b = type;
    }

    public bgf(bfi bfiVar, Type type, int i2) {
        this.f21068c = i2;
        this.f21066a = bfiVar;
        this.f21067b = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgw
    public final Object a() {
        int i2 = this.f21068c;
        return this.f21066a.a();
    }
}
