package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ke> f23704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sf[] f23705b;

    public xi(List<ke> list) {
        this.f23704a = list;
        this.f23705b = new sf[list.size()];
    }

    public final void a(long j2, alx alxVar) {
        if (alxVar.a() < 9) {
            return;
        }
        int iE = alxVar.e();
        int iE2 = alxVar.e();
        int iK = alxVar.k();
        if (iE == 434 && iE2 == 1195456820 && iK == 3) {
            us.r(j2, alxVar, this.f23705b);
        }
    }

    public final void b(rm rmVar, xg xgVar) {
        for (int i2 = 0; i2 < this.f23705b.length; i2++) {
            xgVar.c();
            sf sfVarAZ = rmVar.aZ(xgVar.a(), 3);
            ke keVar = this.f23704a.get(i2);
            String str = keVar.f22156l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String strValueOf = String.valueOf(str);
            ajr.e(z, strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "));
            kd kdVar = new kd();
            kdVar.S(xgVar.b());
            kdVar.ae(str);
            kdVar.ag(keVar.f22148d);
            kdVar.V(keVar.f22147c);
            kdVar.F(keVar.D);
            kdVar.T(keVar.f22158n);
            sfVarAZ.b(kdVar.s());
            this.f23705b[i2] = sfVarAZ;
        }
    }
}
