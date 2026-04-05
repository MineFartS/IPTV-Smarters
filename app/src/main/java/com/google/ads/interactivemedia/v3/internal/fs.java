package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fs extends fr<Integer, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21810e;

    public fs() {
        this.f21806a = "E";
        this.f21807b = -1L;
        this.f21808c = "E";
        this.f21809d = "E";
        this.f21810e = "E";
    }

    public fs(String str) {
        this.f21806a = "E";
        this.f21807b = -1L;
        this.f21808c = "E";
        this.f21809d = "E";
        this.f21810e = "E";
        HashMap mapA = fr.a(str);
        if (mapA != null) {
            this.f21806a = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f21807b = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f21808c = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f21809d = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f21810e = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.fr
    public final HashMap<Integer, Object> b() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f21806a);
        map.put(4, this.f21810e);
        map.put(3, this.f21809d);
        map.put(2, this.f21808c);
        map.put(1, Long.valueOf(this.f21807b));
        return map;
    }
}
