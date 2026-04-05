package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class wp implements xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vz f23604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alw f23605b = new alw(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23606c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private aml f23608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23615l;

    public wp(vz vzVar) {
        this.f23604a = vzVar;
    }

    private final void d(int i2) {
        this.f23606c = i2;
        this.f23607d = 0;
    }

    private final boolean e(alx alxVar, byte[] bArr, int i2) {
        int iMin = Math.min(alxVar.a(), i2 - this.f23607d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            alxVar.J(iMin);
        } else {
            alxVar.D(bArr, this.f23607d, iMin);
        }
        int i3 = this.f23607d + iMin;
        this.f23607d = i3;
        return i3 == i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xh
    public final void a(alx alxVar, int i2) {
        ajr.c(this.f23608e);
        int i3 = -1;
        int i4 = 2;
        if ((i2 & 1) != 0) {
            int i5 = this.f23606c;
            if (i5 != 0 && i5 != 1) {
                if (i5 != 2) {
                    int i6 = this.f23613j;
                    if (i6 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i6);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f23604a.c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i7 = i2;
        while (alxVar.a() > 0) {
            int i8 = this.f23606c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != i4) {
                        int iA = alxVar.a();
                        int i9 = this.f23613j;
                        int i10 = i9 != i3 ? iA - i9 : 0;
                        if (i10 > 0) {
                            iA -= i10;
                            alxVar.H(alxVar.c() + iA);
                        }
                        this.f23604a.a(alxVar);
                        int i11 = this.f23613j;
                        if (i11 != i3) {
                            int i12 = i11 - iA;
                            this.f23613j = i12;
                            if (i12 == 0) {
                                this.f23604a.c();
                                d(1);
                            }
                        }
                    } else {
                        if (e(alxVar, this.f23605b.f20082a, Math.min(10, this.f23612i)) && e(alxVar, null, this.f23612i)) {
                            this.f23605b.g(0);
                            long jB = -9223372036854775807L;
                            this.f23615l = -9223372036854775807L;
                            if (this.f23609f) {
                                this.f23605b.i(4);
                                int iC = this.f23605b.c(3);
                                this.f23605b.i(1);
                                int iC2 = this.f23605b.c(15);
                                this.f23605b.i(1);
                                long jC = ((long) (iC2 << 15)) | (((long) iC) << 30) | ((long) this.f23605b.c(15));
                                this.f23605b.i(1);
                                if (!this.f23611h && this.f23610g) {
                                    this.f23605b.i(4);
                                    int iC3 = this.f23605b.c(3);
                                    this.f23605b.i(1);
                                    int iC4 = this.f23605b.c(15);
                                    this.f23605b.i(1);
                                    int iC5 = this.f23605b.c(15);
                                    this.f23605b.i(1);
                                    this.f23608e.b((((long) iC3) << 30) | ((long) (iC4 << 15)) | ((long) iC5));
                                    this.f23611h = true;
                                }
                                jB = this.f23608e.b(jC);
                                this.f23615l = jB;
                            }
                            i7 |= true != this.f23614k ? 0 : 4;
                            this.f23604a.d(jB, i7);
                            d(3);
                            i3 = -1;
                        }
                    }
                } else if (e(alxVar, this.f23605b.f20082a, 9)) {
                    int i13 = 0;
                    this.f23605b.g(0);
                    int iC6 = this.f23605b.c(24);
                    if (iC6 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(iC6);
                        Log.w("PesReader", sb2.toString());
                        i3 = -1;
                        this.f23613j = -1;
                    } else {
                        this.f23605b.i(8);
                        int iC7 = this.f23605b.c(16);
                        this.f23605b.i(5);
                        this.f23614k = this.f23605b.k();
                        this.f23605b.i(2);
                        this.f23609f = this.f23605b.k();
                        this.f23610g = this.f23605b.k();
                        this.f23605b.i(6);
                        int iC8 = this.f23605b.c(8);
                        this.f23612i = iC8;
                        if (iC7 == 0) {
                            this.f23613j = -1;
                        } else {
                            int i14 = (iC7 - 3) - iC8;
                            this.f23613j = i14;
                            if (i14 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i14);
                                Log.w("PesReader", sb3.toString());
                                i3 = -1;
                                this.f23613j = -1;
                            }
                            i13 = 2;
                        }
                        i3 = -1;
                        i13 = 2;
                    }
                    d(i13);
                } else {
                    i3 = -1;
                }
            } else {
                alxVar.J(alxVar.a());
            }
            i4 = 2;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xh
    public final void b(aml amlVar, rm rmVar, xg xgVar) {
        this.f23608e = amlVar;
        this.f23604a.b(rmVar, xgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.xh
    public final void c() {
        this.f23606c = 0;
        this.f23607d = 0;
        this.f23611h = false;
        this.f23604a.e();
    }
}
