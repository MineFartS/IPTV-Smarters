package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class r extends bkx<r, q> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f22853a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22854e;
    private long u;
    private long v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22855f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22856g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22857h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22858i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22859j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22860k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22861l = 1000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22862m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f22863n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f22864o = -1;
    private int p = 1000;
    private long q = -1;
    private long r = -1;
    private long s = -1;
    private long t = -1;
    private long w = -1;
    private long x = -1;
    private long y = -1;
    private long z = -1;

    static {
        r rVar = new r();
        f22853a = rVar;
        bkx.at(r.class, rVar);
    }

    private r() {
    }

    public static q a() {
        return f22853a.ak();
    }

    public static /* synthetic */ void d(r rVar, long j2) {
        rVar.f22854e |= 1;
        rVar.f22855f = j2;
    }

    public static /* synthetic */ void e(r rVar, long j2) {
        rVar.f22854e |= 2;
        rVar.f22856g = j2;
    }

    public static /* synthetic */ void f(r rVar, long j2) {
        rVar.f22854e |= 4;
        rVar.f22857h = j2;
    }

    public static /* synthetic */ void g(r rVar, long j2) {
        rVar.f22854e |= 8;
        rVar.f22858i = j2;
    }

    public static /* synthetic */ void h(r rVar) {
        rVar.f22854e &= -9;
        rVar.f22858i = -1L;
    }

    public static /* synthetic */ void i(r rVar, long j2) {
        rVar.f22854e |= 16;
        rVar.f22859j = j2;
    }

    public static /* synthetic */ void j(r rVar, long j2) {
        rVar.f22854e |= 32;
        rVar.f22860k = j2;
    }

    public static /* synthetic */ void k(r rVar, ab abVar) {
        rVar.f22861l = abVar.a();
        rVar.f22854e |= 64;
    }

    public static /* synthetic */ void l(r rVar, long j2) {
        rVar.f22854e |= 128;
        rVar.f22862m = j2;
    }

    public static /* synthetic */ void m(r rVar, long j2) {
        rVar.f22854e |= 256;
        rVar.f22863n = j2;
    }

    public static /* synthetic */ void n(r rVar, long j2) {
        rVar.f22854e |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        rVar.f22864o = j2;
    }

    public static /* synthetic */ void o(r rVar, ab abVar) {
        rVar.p = abVar.a();
        rVar.f22854e |= 1024;
    }

    public static /* synthetic */ void p(r rVar, long j2) {
        rVar.f22854e |= 2048;
        rVar.q = j2;
    }

    public static /* synthetic */ void q(r rVar, long j2) {
        rVar.f22854e |= ProgressEvent.PART_FAILED_EVENT_CODE;
        rVar.r = j2;
    }

    public static /* synthetic */ void r(r rVar, long j2) {
        rVar.f22854e |= 8192;
        rVar.s = j2;
    }

    public static /* synthetic */ void s(r rVar, long j2) {
        rVar.f22854e |= 16384;
        rVar.t = j2;
    }

    public static /* synthetic */ void t(r rVar, long j2) {
        rVar.f22854e |= 32768;
        rVar.u = j2;
    }

    public static /* synthetic */ void u(r rVar, long j2) {
        rVar.f22854e |= 65536;
        rVar.v = j2;
    }

    public static /* synthetic */ void v(r rVar, long j2) {
        rVar.f22854e |= 131072;
        rVar.w = j2;
    }

    public static /* synthetic */ void w(r rVar, long j2) {
        rVar.f22854e |= 262144;
        rVar.x = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f22853a, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"e", "f", "g", "h", "i", "j", "k", "l", ab.c(), "m", "n", "o", "p", ab.c(), "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"});
        }
        if (i3 == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new q(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f22853a;
    }
}
