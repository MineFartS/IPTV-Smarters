package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wj implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ww f23549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sf f23551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private wi f23552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23553e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23561m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f23554f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wn f23555g = new wn(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wn f23556h = new wn(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wn f23557i = new wn(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wn f23558j = new wn(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wn f23559k = new wn(40);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final alx f23562n = new alx();

    public wj(ww wwVar) {
        this.f23549a = wwVar;
    }

    private final void f(byte[] bArr, int i2, int i3) {
        this.f23552d.b(bArr, i2, i3);
        if (!this.f23553e) {
            this.f23555g.a(bArr, i2, i3);
            this.f23556h.a(bArr, i2, i3);
            this.f23557i.a(bArr, i2, i3);
        }
        this.f23558j.a(bArr, i2, i3);
        this.f23559k.a(bArr, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x030b  */
    @Override // com.google.ads.interactivemedia.v3.internal.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.alx r30) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.wj.a(com.google.ads.interactivemedia.v3.internal.alx):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        this.f23550b = xgVar.b();
        sf sfVarAZ = rmVar.aZ(xgVar.a(), 2);
        this.f23551c = sfVarAZ;
        this.f23552d = new wi(sfVarAZ);
        this.f23549a.b(rmVar, xgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        this.f23561m = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        this.f23560l = 0L;
        alr.d(this.f23554f);
        this.f23555g.b();
        this.f23556h.b();
        this.f23557i.b();
        this.f23558j.b();
        this.f23559k.b();
        wi wiVar = this.f23552d;
        if (wiVar != null) {
            wiVar.c();
        }
    }
}
