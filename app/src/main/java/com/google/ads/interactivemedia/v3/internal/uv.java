package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class uv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ke f23249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f23251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f23252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f23253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final uw[] f23254k;

    public uv(int i2, int i3, long j2, long j3, long j4, ke keVar, int i4, uw[] uwVarArr, int i5, long[] jArr, long[] jArr2) {
        this.f23244a = i2;
        this.f23245b = i3;
        this.f23246c = j2;
        this.f23247d = j3;
        this.f23248e = j4;
        this.f23249f = keVar;
        this.f23250g = i4;
        this.f23254k = uwVarArr;
        this.f23253j = i5;
        this.f23251h = jArr;
        this.f23252i = jArr2;
    }

    public final uw a(int i2) {
        uw[] uwVarArr = this.f23254k;
        if (uwVarArr == null) {
            return null;
        }
        return uwVarArr[i2];
    }
}
