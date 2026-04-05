package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.event.ProgressEvent;

/* JADX INFO: loaded from: classes.dex */
public final class wm implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final alx f23584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pl f23585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private sf f23587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23595l;

    public wm() {
        this(null);
    }

    public wm(String str) {
        this.f23589f = 0;
        alx alxVar = new alx(4);
        this.f23584a = alxVar;
        alxVar.K()[0] = -1;
        this.f23585b = new pl();
        this.f23586c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void a(alx alxVar) {
        ajr.c(this.f23587d);
        while (alxVar.a() > 0) {
            int i2 = this.f23589f;
            if (i2 == 0) {
                byte[] bArrK = alxVar.K();
                int iD = alxVar.d();
                for (int iC = alxVar.c(); iC < iD; iC++) {
                    byte b2 = bArrK[iC];
                    boolean z = (b2 & 255) == 255;
                    boolean z2 = this.f23592i && (b2 & 224) == 224;
                    this.f23592i = z;
                    if (z2) {
                        alxVar.I(iC + 1);
                        this.f23592i = false;
                        this.f23584a.K()[1] = bArrK[iC];
                        this.f23590g = 2;
                        this.f23589f = 1;
                        break;
                        break;
                    }
                }
                alxVar.I(iD);
            } else if (i2 != 1) {
                int iMin = Math.min(alxVar.a(), this.f23594k - this.f23590g);
                this.f23587d.c(alxVar, iMin);
                int i3 = this.f23590g + iMin;
                this.f23590g = i3;
                int i4 = this.f23594k;
                if (i3 >= i4) {
                    this.f23587d.d(this.f23595l, 1, i4, 0, null);
                    this.f23595l += this.f23593j;
                    this.f23590g = 0;
                    this.f23589f = 0;
                }
            } else {
                int iMin2 = Math.min(alxVar.a(), 4 - this.f23590g);
                alxVar.D(this.f23584a.K(), this.f23590g, iMin2);
                int i5 = this.f23590g + iMin2;
                this.f23590g = i5;
                if (i5 >= 4) {
                    this.f23584a.I(0);
                    if (!this.f23585b.a(this.f23584a.e())) {
                        this.f23590g = 0;
                        this.f23589f = 1;
                        break;
                    }
                    pl plVar = this.f23585b;
                    this.f23594k = plVar.f22724c;
                    if (!this.f23591h) {
                        this.f23593j = (((long) plVar.f22728g) * 1000000) / ((long) plVar.f22725d);
                        kd kdVar = new kd();
                        kdVar.S(this.f23588e);
                        kdVar.ae(this.f23585b.f22723b);
                        kdVar.W(ProgressEvent.PART_FAILED_EVENT_CODE);
                        kdVar.H(this.f23585b.f22726e);
                        kdVar.af(this.f23585b.f22725d);
                        kdVar.V(this.f23586c);
                        this.f23587d.b(kdVar.s());
                        this.f23591h = true;
                    }
                    this.f23584a.I(0);
                    this.f23587d.c(this.f23584a, 4);
                    this.f23589f = 2;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        this.f23588e = xgVar.b();
        this.f23587d = rmVar.aZ(xgVar.a(), 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        this.f23595l = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        this.f23589f = 0;
        this.f23590g = 0;
        this.f23592i = false;
    }
}
