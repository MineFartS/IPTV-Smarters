package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gu extends fr<Integer, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21876b;

    public gu() {
        this.f21875a = -1L;
        this.f21876b = -1L;
    }

    public gu(String str) {
        this.f21875a = -1L;
        this.f21876b = -1L;
        HashMap mapA = fr.a(str);
        if (mapA != null) {
            this.f21875a = ((Long) mapA.get(0)).longValue();
            this.f21876b = ((Long) mapA.get(1)).longValue();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fr
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.f21875a));
        map.put(1, Long.valueOf(this.f21876b));
        return map;
    }
}
