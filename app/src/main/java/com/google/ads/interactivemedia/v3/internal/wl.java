package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class wl implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alw f23571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private sf f23572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ke f23574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23583o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private int t;
    private String u;

    public wl(String str) {
        this.f23569a = str;
        alx alxVar = new alx(1024);
        this.f23570b = alxVar;
        this.f23571c = new alw(alxVar.K());
    }

    private final int f(alw alwVar) throws lb {
        int iA = alwVar.a();
        no noVarC = np.c(alwVar, true);
        this.u = noVarC.f22544c;
        this.r = noVarC.f22542a;
        this.t = noVarC.f22543b;
        return iA - alwVar.a();
    }

    private static long g(alw alwVar) {
        return alwVar.c((alwVar.c(2) + 1) * 8);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void a(alx alxVar) throws lb {
        int i2;
        int i3;
        int iC;
        boolean zK;
        ajr.c(this.f23572d);
        while (alxVar.a() > 0) {
            int i4 = this.f23575g;
            if (i4 != 0) {
                if (i4 == 1) {
                    int iK = alxVar.k();
                    if ((iK & 224) == 224) {
                        this.f23578j = iK;
                        this.f23575g = 2;
                    } else if (iK != 86) {
                        this.f23575g = 0;
                    }
                } else if (i4 != 2) {
                    int iMin = Math.min(alxVar.a(), this.f23577i - this.f23576h);
                    alxVar.D(this.f23571c.f20082a, this.f23576h, iMin);
                    int i5 = this.f23576h + iMin;
                    this.f23576h = i5;
                    if (i5 == this.f23577i) {
                        this.f23571c.g(0);
                        alw alwVar = this.f23571c;
                        if (alwVar.k()) {
                            if (this.f23580l) {
                            }
                            this.f23575g = 0;
                        } else {
                            this.f23580l = true;
                            int iC2 = alwVar.c(1);
                            if (iC2 == 1) {
                                iC = alwVar.c(1);
                                i3 = 1;
                            } else {
                                i3 = iC2;
                                iC = 0;
                            }
                            this.f23581m = iC;
                            if (iC != 0) {
                                throw new lb();
                            }
                            if (i3 == 1) {
                                g(alwVar);
                            }
                            if (!alwVar.k()) {
                                throw new lb();
                            }
                            this.f23582n = alwVar.c(6);
                            int iC3 = alwVar.c(4);
                            int iC4 = alwVar.c(3);
                            if (iC3 != 0 || iC4 != 0) {
                                throw new lb();
                            }
                            if (i3 == 0) {
                                int iB = alwVar.b();
                                int iF = f(alwVar);
                                alwVar.g(iB);
                                byte[] bArr = new byte[(iF + 7) / 8];
                                alwVar.m(bArr, iF);
                                kd kdVar = new kd();
                                kdVar.S(this.f23573e);
                                kdVar.ae("audio/mp4a-latm");
                                kdVar.I(this.u);
                                kdVar.H(this.t);
                                kdVar.af(this.r);
                                kdVar.T(Collections.singletonList(bArr));
                                kdVar.V(this.f23569a);
                                ke keVarS = kdVar.s();
                                if (!keVarS.equals(this.f23574f)) {
                                    this.f23574f = keVarS;
                                    this.s = 1024000000 / ((long) keVarS.z);
                                    this.f23572d.b(keVarS);
                                }
                            } else {
                                alwVar.i(((int) g(alwVar)) - f(alwVar));
                            }
                            int iC5 = alwVar.c(3);
                            this.f23583o = iC5;
                            if (iC5 == 0) {
                                alwVar.i(8);
                            } else if (iC5 == 1) {
                                alwVar.i(9);
                            } else if (iC5 == 3 || iC5 == 4 || iC5 == 5) {
                                alwVar.i(6);
                            } else {
                                if (iC5 != 6 && iC5 != 7) {
                                    throw new IllegalStateException();
                                }
                                alwVar.i(1);
                            }
                            boolean zK2 = alwVar.k();
                            this.p = zK2;
                            this.q = 0L;
                            if (zK2) {
                                if (i3 != 1) {
                                    do {
                                        zK = alwVar.k();
                                        this.q = (this.q << 8) + ((long) alwVar.c(8));
                                    } while (zK);
                                } else {
                                    this.q = g(alwVar);
                                }
                            }
                            if (alwVar.k()) {
                                alwVar.i(8);
                            }
                        }
                        if (this.f23581m != 0) {
                            throw new lb();
                        }
                        if (this.f23582n != 0) {
                            throw new lb();
                        }
                        if (this.f23583o != 0) {
                            throw new lb();
                        }
                        int i6 = 0;
                        while (true) {
                            int iC6 = alwVar.c(8);
                            i2 = i6 + iC6;
                            if (iC6 != 255) {
                                break;
                            } else {
                                i6 = i2;
                            }
                        }
                        int iB2 = alwVar.b();
                        if ((iB2 & 7) == 0) {
                            this.f23570b.I(iB2 >> 3);
                        } else {
                            alwVar.m(this.f23570b.K(), i2 * 8);
                            this.f23570b.I(0);
                        }
                        this.f23572d.c(this.f23570b, i2);
                        this.f23572d.d(this.f23579k, 1, i2, 0, null);
                        this.f23579k += this.s;
                        if (this.p) {
                            alwVar.i((int) this.q);
                        }
                        this.f23575g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iK2 = ((this.f23578j & (-225)) << 8) | alxVar.k();
                    this.f23577i = iK2;
                    if (iK2 > this.f23570b.K().length) {
                        this.f23570b.E(this.f23577i);
                        this.f23571c.e(this.f23570b.K());
                    }
                    this.f23576h = 0;
                    this.f23575g = 3;
                }
            } else if (alxVar.k() == 86) {
                this.f23575g = 1;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        this.f23572d = rmVar.aZ(xgVar.a(), 1);
        this.f23573e = xgVar.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        this.f23579k = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        this.f23575g = 0;
        this.f23580l = false;
    }
}
