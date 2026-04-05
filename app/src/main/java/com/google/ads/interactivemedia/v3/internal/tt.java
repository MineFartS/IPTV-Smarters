package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tt implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23108a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pl f23111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rw f23112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rx f23113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sf f23114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private rm f23115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sf f23116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private sf f23117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ys f23119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23122o;
    private int p;
    private tu q;
    private boolean r;
    private long s;

    static {
        ts tsVar = new rp() { // from class: com.google.ads.interactivemedia.v3.internal.ts
            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final rj[] a() {
                int i2 = tt.f23108a;
                return new rj[]{new tt()};
            }

            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final /* synthetic */ rj[] b(Uri uri, Map map) {
                return ro.a(this);
            }
        };
    }

    public tt() {
        this((byte[]) null);
    }

    public tt(long j2) {
        this.f23109b = j2;
        this.f23110c = new alx(10);
        this.f23111d = new pl();
        this.f23112e = new rw();
        this.f23120m = -9223372036854775807L;
        this.f23113f = new rx();
        ri riVar = new ri();
        this.f23114g = riVar;
        this.f23117j = riVar;
    }

    public tt(byte[] bArr) {
        this(-9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int g(com.google.ads.interactivemedia.v3.internal.rk r20) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tt.g(com.google.ads.interactivemedia.v3.internal.rk):int");
    }

    private final long h(long j2) {
        return this.f23120m + ((j2 * 1000000) / ((long) this.f23111d.f22725d));
    }

    private final tu i(rk rkVar) {
        rkVar.g(this.f23110c.K(), 0, 4);
        this.f23110c.I(0);
        this.f23111d.a(this.f23110c.e());
        return new tp(rkVar.c(), rkVar.e(), this.f23111d);
    }

    private static boolean j(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    private final boolean k(rk rkVar) {
        tu tuVar = this.q;
        if (tuVar != null) {
            long jA = tuVar.a();
            if (jA != -1 && rkVar.d() > jA - 4) {
                return true;
            }
        }
        try {
            return !rkVar.l(this.f23110c.K(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean l(rk rkVar, boolean z) throws lb, EOFException {
        int i2;
        int iD;
        int iB;
        int i3 = true != z ? 131072 : 32768;
        rkVar.i();
        if (rkVar.e() == 0) {
            ys ysVarA = this.f23113f.a(rkVar, null);
            this.f23119l = ysVarA;
            if (ysVarA != null) {
                this.f23112e.b(ysVarA);
            }
            iD = (int) rkVar.d();
            if (!z) {
                rkVar.j(iD);
            }
            i2 = 0;
        } else {
            i2 = 0;
            iD = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!k(rkVar)) {
                this.f23110c.I(0);
                int iE = this.f23110c.e();
                if ((i2 == 0 || j(iE, i2)) && (iB = pm.b(iE)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f23111d.a(iE);
                        i2 = iE;
                    }
                    rkVar.f(iB - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        throw new lb("Searched too many bytes.");
                    }
                    if (z) {
                        rkVar.i();
                        rkVar.f(iD + i6);
                    } else {
                        rkVar.j(1);
                    }
                    i5 = i6;
                    i2 = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            rkVar.j(iD + i5);
        } else {
            rkVar.i();
        }
        this.f23118k = i2;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) throws lb {
        ajr.c(this.f23116i);
        int i2 = amn.f20135a;
        int iG = g(rkVar);
        if (iG == -1 && (this.q instanceof tq)) {
            if (this.q.e() != h(this.f23121n)) {
                throw null;
            }
        }
        return iG;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23115h = rmVar;
        sf sfVarAZ = rmVar.aZ(0, 1);
        this.f23116i = sfVarAZ;
        this.f23117j = sfVarAZ;
        this.f23115h.ba();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        this.f23118k = 0;
        this.f23120m = -9223372036854775807L;
        this.f23121n = 0L;
        this.p = 0;
        this.s = j3;
        tu tuVar = this.q;
        if (tuVar instanceof tq) {
            throw null;
        }
    }

    public final void e() {
        this.r = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        return l(rkVar, true);
    }
}
