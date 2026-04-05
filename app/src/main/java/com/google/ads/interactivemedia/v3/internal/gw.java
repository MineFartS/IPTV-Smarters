package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gw extends fr<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f21877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f21878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f21879c;

    public gw() {
    }

    public gw(String str) {
        HashMap mapA = fr.a(str);
        if (mapA != null) {
            this.f21877a = (Long) mapA.get(0);
            this.f21878b = (Boolean) mapA.get(1);
            this.f21879c = (Boolean) mapA.get(2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fr
    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f21877a);
        map.put(1, this.f21878b);
        map.put(2, this.f21879c);
        return map;
    }
}
