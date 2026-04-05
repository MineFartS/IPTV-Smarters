package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ve implements rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23310a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rm f23311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private vl f23312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23313d;

    static {
        vd vdVar = new rp() { // from class: com.google.ads.interactivemedia.v3.internal.vd
            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final rj[] a() {
                int i2 = ve.f23310a;
                return new rj[]{new ve()};
            }

            @Override // com.google.ads.interactivemedia.v3.internal.rp
            public final /* synthetic */ rj[] b(Uri uri, Map map) {
                return ro.a(this);
            }
        };
    }

    private final boolean e(rk rkVar) {
        vl viVar;
        vg vgVar = new vg();
        if (vgVar.b(rkVar, true) && (vgVar.f23320b & 2) == 2) {
            int iMin = Math.min(vgVar.f23324f, 8);
            alx alxVar = new alx(iMin);
            rkVar.g(alxVar.K(), 0, iMin);
            g(alxVar);
            if (alxVar.a() >= 5 && alxVar.k() == 127 && alxVar.s() == 1179402563) {
                viVar = new vc();
            } else {
                g(alxVar);
                if (us.f(1, alxVar, true)) {
                    viVar = new vn();
                } else {
                    g(alxVar);
                    if (vi.d(alxVar)) {
                        viVar = new vi();
                    }
                }
            }
            this.f23312c = viVar;
            return true;
        }
        return false;
    }

    private static void g(alx alxVar) {
        alxVar.I(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final int a(rk rkVar, rz rzVar) throws lb {
        ajr.c(this.f23311b);
        if (this.f23312c == null) {
            if (!e(rkVar)) {
                throw new lb("Failed to determine bitstream type");
            }
            rkVar.i();
        }
        if (!this.f23313d) {
            sf sfVarAZ = this.f23311b.aZ(0, 1);
            this.f23311b.ba();
            this.f23312c.h(this.f23311b, sfVarAZ);
            this.f23313d = true;
        }
        return this.f23312c.e(rkVar, rzVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void b(rm rmVar) {
        this.f23311b = rmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final void d(long j2, long j3) {
        vl vlVar = this.f23312c;
        if (vlVar != null) {
            vlVar.j(j2, j3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rj
    public final boolean f(rk rkVar) {
        try {
            return e(rkVar);
        } catch (lb unused) {
            return false;
        }
    }
}
