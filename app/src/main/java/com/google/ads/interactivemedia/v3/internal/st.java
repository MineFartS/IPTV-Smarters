package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class st implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22994a = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private rm f23000g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23008o;
    private sr p;
    private sx q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f22995b = new alx(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f22996c = new alx(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final alx f22997d = new alx(11);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alx f22998e = new alx();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final su f22999f = new su();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23001h = 1;

    static {
        ss ssVar = new rp() { // from class: com.google.ads.interactivemedia.v3.internal.ss
            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final rj[] a() {
                int i2 = st.f22994a;
                return new rj[]{new st()};
            }

            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final /* synthetic */ rj[] b(Uri uri, Map map) {
                return ro.a(this);
            }
        };
    }

    private final alx e(rk rkVar) {
        if (this.f23006m > this.f22998e.b()) {
            alx alxVar = this.f22998e;
            int iB = alxVar.b();
            alxVar.G(new byte[Math.max(iB + iB, this.f23006m)], 0);
        } else {
            this.f22998e.I(0);
        }
        this.f22998e.H(this.f23006m);
        rkVar.h(this.f22998e.K(), 0, this.f23006m);
        return this.f22998e;
    }

    private final void g() {
        if (this.f23008o) {
            return;
        }
        this.f23000g.bb(new sb(-9223372036854775807L));
        this.f23008o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.ads.interactivemedia.v3.internal.rk r17, com.google.ads.interactivemedia.v3.internal.rz r18) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.st.a(com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.rz):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23000g = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        if (j2 == 0) {
            this.f23001h = 1;
            this.f23002i = false;
        } else {
            this.f23001h = 3;
        }
        this.f23004k = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        rkVar.g(this.f22995b.K(), 0, 3);
        this.f22995b.I(0);
        if (this.f22995b.m() != 4607062) {
            return false;
        }
        rkVar.g(this.f22995b.K(), 0, 2);
        this.f22995b.I(0);
        if ((this.f22995b.o() & 250) != 0) {
            return false;
        }
        rkVar.g(this.f22995b.K(), 0, 4);
        this.f22995b.I(0);
        int iE = this.f22995b.e();
        rkVar.i();
        rkVar.f(iE);
        rkVar.g(this.f22995b.K(), 0, 4);
        this.f22995b.I(0);
        return this.f22995b.e() == 0;
    }
}
