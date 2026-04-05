package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final az f21501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f21502b = new ArrayList<>();

    public bp(az azVar, String str) {
        this.f21501a = azVar;
        c(str);
    }

    public final az a() {
        return this.f21501a;
    }

    public final ArrayList<String> b() {
        return this.f21502b;
    }

    public final void c(String str) {
        this.f21502b.add(str);
    }
}
