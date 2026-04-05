package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vz f23626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aml f23627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alw f23628c = new alw(new byte[64]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23633h;

    public ws(vz vzVar, aml amlVar) {
        this.f23626a = vzVar;
        this.f23627b = amlVar;
    }

    public final void a(alx alxVar) {
        alxVar.D(this.f23628c.f20082a, 0, 3);
        this.f23628c.g(0);
        this.f23628c.i(8);
        this.f23629d = this.f23628c.k();
        this.f23630e = this.f23628c.k();
        this.f23628c.i(6);
        int iC = this.f23628c.c(8);
        this.f23632g = iC;
        alxVar.D(this.f23628c.f20082a, 0, iC);
        this.f23628c.g(0);
        long jB = 0;
        this.f23633h = 0L;
        if (this.f23629d) {
            this.f23628c.i(4);
            int iC2 = this.f23628c.c(3);
            this.f23628c.i(1);
            int iC3 = this.f23628c.c(15);
            this.f23628c.i(1);
            long jC = (((long) iC2) << 30) | ((long) (iC3 << 15)) | ((long) this.f23628c.c(15));
            this.f23628c.i(1);
            if (!this.f23631f && this.f23630e) {
                this.f23628c.i(4);
                int iC4 = this.f23628c.c(3);
                this.f23628c.i(1);
                int iC5 = this.f23628c.c(15);
                this.f23628c.i(1);
                int iC6 = this.f23628c.c(15);
                this.f23628c.i(1);
                this.f23627b.b((((long) iC4) << 30) | ((long) (iC5 << 15)) | ((long) iC6));
                this.f23631f = true;
            }
            jB = this.f23627b.b(jC);
            this.f23633h = jB;
        }
        this.f23626a.d(jB, 4);
        this.f23626a.a(alxVar);
        this.f23626a.c();
    }

    public final void b() {
        this.f23631f = false;
        this.f23626a.e();
    }
}
