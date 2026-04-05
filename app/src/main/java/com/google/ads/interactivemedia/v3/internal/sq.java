package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sq implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22975a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f22976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f22977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rq f22978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private rm f22979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private sf f22980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ys f22982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ru f22983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f22985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private so f22986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f22987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f22988n;

    static {
        sp spVar = new rp() { // from class: com.google.ads.interactivemedia.v3.internal.sp
            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final rj[] a() {
                int i2 = sq.f22975a;
                return new rj[]{new sq(null)};
            }

            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final /* synthetic */ rj[] b(Uri uri, Map map) {
                return ro.a(this);
            }
        };
    }

    public sq() {
        this(null);
    }

    public sq(byte[] bArr) {
        this.f22976b = new byte[42];
        this.f22977c = new alx(new byte[32768], 0);
        this.f22978d = new rq();
        this.f22981g = 0;
    }

    private final long e(alx alxVar, boolean z) {
        boolean zN;
        ajr.b(this.f22983i);
        int iC = alxVar.c();
        while (true) {
            if (iC > alxVar.d() - 16) {
                if (!z) {
                    alxVar.I(iC);
                    return -1L;
                }
                while (iC <= alxVar.d() - this.f22984j) {
                    alxVar.I(iC);
                    try {
                        zN = us.n(alxVar, this.f22983i, this.f22985k, this.f22978d);
                    } catch (IndexOutOfBoundsException unused) {
                        zN = false;
                    }
                    if (alxVar.c() > alxVar.d() || !zN) {
                        iC++;
                    }
                }
                alxVar.I(alxVar.d());
                return -1L;
            }
            alxVar.I(iC);
            if (us.n(alxVar, this.f22983i, this.f22985k, this.f22978d)) {
                break;
            }
            iC++;
        }
        alxVar.I(iC);
        return this.f22978d.f22902a;
    }

    private final void g() {
        long j2 = this.f22988n;
        ru ruVar = this.f22983i;
        int i2 = amn.f20135a;
        this.f22980f.d((j2 * 1000000) / ((long) ruVar.f22912e), 1, this.f22987m, 0, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) throws lb {
        boolean zK;
        ru ruVarD;
        ru ruVar;
        sc sbVar;
        boolean z;
        int i2 = this.f22981g;
        if (i2 == 0) {
            rkVar.i();
            long jD = rkVar.d();
            ys ysVarK = us.k(rkVar, true);
            rkVar.j((int) (rkVar.d() - jD));
            this.f22982h = ysVarK;
            this.f22981g = 1;
            return 0;
        }
        if (i2 == 1) {
            rkVar.g(this.f22976b, 0, 42);
            rkVar.i();
            this.f22981g = 2;
            return 0;
        }
        if (i2 == 2) {
            alx alxVar = new alx(4);
            rkVar.h(alxVar.K(), 0, 4);
            if (alxVar.s() != 1716281667) {
                throw new lb("Failed to read FLAC stream marker.");
            }
            this.f22981g = 3;
            return 0;
        }
        if (i2 == 3) {
            rr rrVar = new rr(this.f22983i);
            do {
                rkVar.i();
                alw alwVar = new alw(new byte[4]);
                rkVar.g(alwVar.f20082a, 0, 4);
                zK = alwVar.k();
                int iC = alwVar.c(7);
                int iC2 = alwVar.c(24) + 4;
                if (iC == 0) {
                    byte[] bArr = new byte[38];
                    rkVar.h(bArr, 0, 38);
                    ruVarD = new ru(bArr, 4);
                } else {
                    ru ruVar2 = rrVar.f22903a;
                    if (ruVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iC == 3) {
                        alx alxVar2 = new alx(iC2);
                        rkVar.h(alxVar2.K(), 0, iC2);
                        ruVarD = ruVar2.e(us.j(alxVar2));
                    } else if (iC == 4) {
                        alx alxVar3 = new alx(iC2);
                        rkVar.h(alxVar3.K(), 0, iC2);
                        alxVar3.J(4);
                        ruVarD = ruVar2.f(Arrays.asList(us.e(alxVar3, false, false).f22945a));
                    } else if (iC == 6) {
                        alx alxVar4 = new alx(iC2);
                        rkVar.h(alxVar4.K(), 0, iC2);
                        alxVar4.J(4);
                        int iE = alxVar4.e();
                        String strZ = alxVar4.z(alxVar4.e(), arm.f20426a);
                        String strY = alxVar4.y(alxVar4.e());
                        int iE2 = alxVar4.e();
                        int iE3 = alxVar4.e();
                        int iE4 = alxVar4.e();
                        int iE5 = alxVar4.e();
                        int iE6 = alxVar4.e();
                        byte[] bArr2 = new byte[iE6];
                        alxVar4.D(bArr2, 0, iE6);
                        ruVarD = ruVar2.d(Collections.singletonList(new yy(iE, strZ, strY, iE2, iE3, iE4, iE5, bArr2)));
                    } else {
                        rkVar.j(iC2);
                        ruVar = rrVar.f22903a;
                        int i3 = amn.f20135a;
                        this.f22983i = ruVar;
                    }
                }
                rrVar.f22903a = ruVarD;
                ruVar = rrVar.f22903a;
                int i32 = amn.f20135a;
                this.f22983i = ruVar;
            } while (!zK);
            ajr.b(ruVar);
            this.f22984j = Math.max(this.f22983i.f22910c, 6);
            this.f22980f.b(this.f22983i.c(this.f22976b, this.f22982h));
            this.f22981g = 4;
            return 0;
        }
        if (i2 == 4) {
            rkVar.i();
            alx alxVar5 = new alx(2);
            rkVar.g(alxVar5.K(), 0, 2);
            int iO = alxVar5.o();
            int i4 = iO >> 2;
            rkVar.i();
            if (i4 != 16382) {
                throw new lb("First frame does not start with sync code.");
            }
            this.f22985k = iO;
            rm rmVar = this.f22979e;
            int i5 = amn.f20135a;
            long jE = rkVar.e();
            long jC = rkVar.c();
            ajr.b(this.f22983i);
            ru ruVar3 = this.f22983i;
            if (ruVar3.f22918k != null) {
                sbVar = new rs(ruVar3, jE);
            } else if (jC == -1 || ruVar3.f22917j <= 0) {
                sbVar = new sb(ruVar3.a());
            } else {
                so soVar = new so(ruVar3, this.f22985k, jE, jC);
                this.f22986l = soVar;
                sbVar = soVar.b();
            }
            rmVar.bb(sbVar);
            this.f22981g = 5;
            return 0;
        }
        ajr.b(this.f22980f);
        ajr.b(this.f22983i);
        so soVar2 = this.f22986l;
        if (soVar2 != null && soVar2.d()) {
            return this.f22986l.a(rkVar, rzVar);
        }
        if (this.f22988n == -1) {
            this.f22988n = us.m(rkVar, this.f22983i);
            return 0;
        }
        int iD = this.f22977c.d();
        if (iD < 32768) {
            int iB = rkVar.b(this.f22977c.K(), iD, 32768 - iD);
            z = iB == -1;
            if (!z) {
                this.f22977c.H(iD + iB);
            } else if (this.f22977c.a() == 0) {
                g();
                return -1;
            }
        } else {
            z = false;
        }
        int iC3 = this.f22977c.c();
        int i6 = this.f22987m;
        int i7 = this.f22984j;
        if (i6 < i7) {
            alx alxVar6 = this.f22977c;
            alxVar6.J(Math.min(i7 - i6, alxVar6.a()));
        }
        long jE2 = e(this.f22977c, z);
        int iC4 = this.f22977c.c() - iC3;
        this.f22977c.I(iC3);
        this.f22980f.c(this.f22977c, iC4);
        this.f22987m += iC4;
        if (jE2 != -1) {
            g();
            this.f22987m = 0;
            this.f22988n = jE2;
        }
        if (this.f22977c.a() >= 16) {
            return 0;
        }
        int iA = this.f22977c.a();
        System.arraycopy(this.f22977c.K(), this.f22977c.c(), this.f22977c.K(), 0, iA);
        this.f22977c.I(0);
        this.f22977c.H(iA);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f22979e = rmVar;
        this.f22980f = rmVar.aZ(0, 1);
        rmVar.ba();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        if (j2 == 0) {
            this.f22981g = 0;
        } else {
            so soVar = this.f22986l;
            if (soVar != null) {
                soVar.c(j3);
            }
        }
        this.f22988n = j3 != 0 ? -1L : 0L;
        this.f22987m = 0;
        this.f22977c.E(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        us.k(rkVar, false);
        alx alxVar = new alx(4);
        rkVar.g(alxVar.K(), 0, 4);
        return alxVar.s() == 1716281667;
    }
}
