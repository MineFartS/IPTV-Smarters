package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ke> f23652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf[] f23653b;

    public ww(List<ke> list) {
        this.f23652a = list;
        this.f23653b = new sf[list.size()];
    }

    public final void a(long j2, alx alxVar) {
        us.q(j2, alxVar, this.f23653b);
    }

    public final void b(rm rmVar, xg xgVar) {
        for (int i2 = 0; i2 < this.f23653b.length; i2++) {
            xgVar.c();
            sf sfVarAZ = rmVar.aZ(xgVar.a(), 3);
            ke keVar = this.f23652a.get(i2);
            String str = keVar.f22156l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String strValueOf = String.valueOf(str);
            ajr.e(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            String strB = keVar.f22145a;
            if (strB == null) {
                strB = xgVar.b();
            }
            kd kdVar = new kd();
            kdVar.S(strB);
            kdVar.ae(str);
            kdVar.ag(keVar.f22148d);
            kdVar.V(keVar.f22147c);
            kdVar.F(keVar.D);
            kdVar.T(keVar.f22158n);
            sfVarAZ.b(kdVar.s());
            this.f23653b[i2] = sfVarAZ;
        }
    }
}
