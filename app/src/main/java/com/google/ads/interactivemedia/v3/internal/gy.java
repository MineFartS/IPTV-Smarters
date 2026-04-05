package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gy extends fr<Integer, Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f21881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f21882b;

    public gy() {
    }

    public gy(String str) {
        HashMap mapA = fr.a(str);
        if (mapA != null) {
            this.f21881a = (Long) mapA.get(0);
            this.f21882b = (Long) mapA.get(1);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fr
    public final HashMap<Integer, Long> b() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f21881a);
        map.put(1, this.f21882b);
        return map;
    }
}
