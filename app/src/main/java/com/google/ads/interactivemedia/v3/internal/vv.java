package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vv implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f23411a = {73, 68, 51};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alw f23413c = new alw(new byte[7]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final alx f23414d = new alx(Arrays.copyOf(f23411a, 10));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f23416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private sf f23417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sf f23418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23425o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private sf u;
    private long v;

    public vv(boolean z, String str) {
        h();
        this.f23424n = -1;
        this.f23425o = -1;
        this.r = -9223372036854775807L;
        this.f23412b = z;
        this.f23415e = str;
    }

    public static boolean f(int i2) {
        return (i2 & 65526) == 65520;
    }

    private final void g() {
        this.f23423m = false;
        h();
    }

    private final void h() {
        this.f23419i = 0;
        this.f23420j = 0;
        this.f23421k = 256;
    }

    private final void i() {
        this.f23419i = 3;
        this.f23420j = 0;
    }

    private final void j(sf sfVar, long j2, int i2, int i3) {
        this.f23419i = 4;
        this.f23420j = i2;
        this.u = sfVar;
        this.v = j2;
        this.s = i3;
    }

    private final boolean k(alx alxVar, byte[] bArr, int i2) {
        int iMin = Math.min(alxVar.a(), i2 - this.f23420j);
        alxVar.D(bArr, this.f23420j, iMin);
        int i3 = this.f23420j + iMin;
        this.f23420j = i3;
        return i3 == i2;
    }

    private static final boolean l(byte b2) {
        return f((b2 & 255) | 65280);
    }

    private static final boolean m(alx alxVar, byte[] bArr, int i2) {
        if (alxVar.a() < i2) {
            return false;
        }
        alxVar.D(bArr, 0, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203  */
    @Override // com.google.ads.interactivemedia.v3.internal.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.alx r17) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.vv.a(com.google.ads.interactivemedia.v3.internal.alx):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        this.f23416f = xgVar.b();
        sf sfVarAZ = rmVar.aZ(xgVar.a(), 1);
        this.f23417g = sfVarAZ;
        this.u = sfVarAZ;
        if (!this.f23412b) {
            this.f23418h = new ri();
            return;
        }
        xgVar.c();
        sf sfVarAZ2 = rmVar.aZ(xgVar.a(), 5);
        this.f23418h = sfVarAZ2;
        kd kdVar = new kd();
        kdVar.S(xgVar.b());
        kdVar.ae("application/id3");
        sfVarAZ2.b(kdVar.s());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        this.t = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        g();
    }
}
