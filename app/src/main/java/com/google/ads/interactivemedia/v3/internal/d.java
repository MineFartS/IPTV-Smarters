package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class d extends bkx<d, a> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f21597a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21598e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f21600g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f21604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21605l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f21607n;
    private int r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f21599f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21601h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f21602i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f21603j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f21606m = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f21608o = BuildConfig.FLAVOR;
    private String p = BuildConfig.FLAVOR;
    private blc<b> q = bkx.ap();

    static {
        d dVar = new d();
        f21597a = dVar;
        bkx.at(d.class, dVar);
    }

    private d() {
    }

    public static a a() {
        return f21597a.ak();
    }

    public static /* synthetic */ void d(d dVar, long j2) {
        dVar.f21598e |= 2;
        dVar.f21600g = j2;
    }

    public static /* synthetic */ void e(d dVar, String str) {
        str.getClass();
        dVar.f21598e |= 4;
        dVar.f21601h = str;
    }

    public static /* synthetic */ void f(d dVar, String str) {
        str.getClass();
        dVar.f21598e |= 8;
        dVar.f21602i = str;
    }

    public static /* synthetic */ void g(d dVar, String str) {
        dVar.f21598e |= 16;
        dVar.f21603j = str;
    }

    public static /* synthetic */ void h(d dVar, String str) {
        str.getClass();
        dVar.f21598e |= 1;
        dVar.f21599f = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f21597a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", b.class, "r", c.b()});
        }
        if (i3 == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new a(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f21597a;
    }
}
