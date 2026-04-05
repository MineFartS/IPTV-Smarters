package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bfo extends bfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bgv<String, bfl> f21047a = new bgv<>();

    public final Set<Map.Entry<String, bfl>> a() {
        return this.f21047a.entrySet();
    }

    public final void b(String str, bfl bflVar) {
        this.f21047a.put(str, bflVar);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof bfo) && ((bfo) obj).f21047a.equals(this.f21047a));
    }

    public final int hashCode() {
        return this.f21047a.hashCode();
    }
}
