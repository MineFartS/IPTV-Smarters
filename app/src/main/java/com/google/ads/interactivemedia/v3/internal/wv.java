package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wv implements xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wu f23646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23647b = new alx(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23651f;

    public wv(wu wuVar) {
        this.f23646a = wuVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xh
    public final void a(alx alxVar, int i2) {
        int i3 = i2 & 1;
        int iC = i3 != 0 ? alxVar.c() + alxVar.k() : -1;
        if (this.f23651f) {
            if (i3 == 0) {
                return;
            }
            this.f23651f = false;
            alxVar.I(iC);
            this.f23649d = 0;
        }
        while (alxVar.a() > 0) {
            int i4 = this.f23649d;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iK = alxVar.k();
                    alxVar.I(alxVar.c() - 1);
                    if (iK == 255) {
                        this.f23651f = true;
                        return;
                    }
                }
                int iMin = Math.min(alxVar.a(), 3 - this.f23649d);
                alxVar.D(this.f23647b.K(), this.f23649d, iMin);
                int i5 = this.f23649d + iMin;
                this.f23649d = i5;
                if (i5 == 3) {
                    this.f23647b.I(0);
                    this.f23647b.H(3);
                    this.f23647b.J(1);
                    int iK2 = this.f23647b.k();
                    int iK3 = this.f23647b.k();
                    this.f23650e = (iK2 & 128) != 0;
                    this.f23648c = (((iK2 & 15) << 8) | iK3) + 3;
                    int iB = this.f23647b.b();
                    int i6 = this.f23648c;
                    if (iB < i6) {
                        int iB2 = this.f23647b.b();
                        this.f23647b.B(Math.min(4098, Math.max(i6, iB2 + iB2)));
                    }
                }
            } else {
                int iMin2 = Math.min(alxVar.a(), this.f23648c - this.f23649d);
                alxVar.D(this.f23647b.K(), this.f23649d, iMin2);
                int i7 = this.f23649d + iMin2;
                this.f23649d = i7;
                int i8 = this.f23648c;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.f23650e) {
                        this.f23647b.H(i8);
                    } else {
                        if (amn.al(this.f23647b.K(), this.f23648c) != 0) {
                            this.f23651f = true;
                            return;
                        }
                        this.f23647b.H(this.f23648c - 4);
                    }
                    this.f23647b.I(0);
                    this.f23646a.a(this.f23647b);
                    this.f23649d = 0;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xh
    public final void b(aml amlVar, rm rmVar, xg xgVar) {
        this.f23646a.b(amlVar, rmVar, xgVar);
        this.f23651f = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xh
    public final void c() {
        this.f23651f = true;
    }
}
