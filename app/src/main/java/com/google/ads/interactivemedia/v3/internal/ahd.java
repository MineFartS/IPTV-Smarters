package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public class ahd implements Comparable<Long> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ahc f19690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qg f19694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f19696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f19698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19699m;

    public /* synthetic */ ahd(String str, ahc ahcVar, long j2, int i2, long j3, qg qgVar, String str2, String str3, long j4, long j5, boolean z) {
        this.f19689c = str;
        this.f19690d = ahcVar;
        this.f19691e = j2;
        this.f19692f = i2;
        this.f19693g = j3;
        this.f19694h = qgVar;
        this.f19695i = str2;
        this.f19696j = str3;
        this.f19697k = j4;
        this.f19698l = j5;
        this.f19699m = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Long l2) {
        Long l3 = l2;
        if (this.f19693g > l3.longValue()) {
            return 1;
        }
        return this.f19693g >= l3.longValue() ? 0 : -1;
    }
}
