package c.f.a.c.f.o.n;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class l0<T> implements c.f.a.c.o.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<?> f12451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12452d;

    public l0(g gVar, int i2, b<?> bVar, long j2, String str, String str2) {
        this.f12449a = gVar;
        this.f12450b = i2;
        this.f12451c = bVar;
        this.f12452d = j2;
    }

    public static <T> l0<T> b(g gVar, int i2, b<?> bVar) {
        boolean zL;
        if (!gVar.w()) {
            return null;
        }
        c.f.a.c.f.q.q qVarA = c.f.a.c.f.q.p.b().a();
        if (qVarA == null) {
            zL = true;
        } else {
            if (!qVarA.K()) {
                return null;
            }
            zL = qVarA.L();
            d0 d0VarR = gVar.r(bVar);
            if (d0VarR != null) {
                if (!(d0VarR.s() instanceof c.f.a.c.f.q.c)) {
                    return null;
                }
                c.f.a.c.f.q.c cVar = (c.f.a.c.f.q.c) d0VarR.s();
                if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                    c.f.a.c.f.q.e eVarC = c(d0VarR, cVar, i2);
                    if (eVarC == null) {
                        return null;
                    }
                    d0VarR.F();
                    zL = eVarC.M();
                }
            }
        }
        return new l0<>(gVar, i2, bVar, zL ? System.currentTimeMillis() : 0L, null, null);
    }

    public static c.f.a.c.f.q.e c(d0<?> d0Var, c.f.a.c.f.q.c<?> cVar, int i2) {
        int[] iArrJ;
        int[] iArrK;
        c.f.a.c.f.q.e telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.L() || ((iArrJ = telemetryConfiguration.J()) != null ? !c.f.a.c.f.t.b.b(iArrJ, i2) : !((iArrK = telemetryConfiguration.K()) == null || !c.f.a.c.f.t.b.b(iArrK, i2))) || d0Var.E() >= telemetryConfiguration.I()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // c.f.a.c.o.d
    public final void a(c.f.a.c.o.i<T> iVar) {
        d0 d0VarR;
        int iM;
        int i2;
        int i3;
        int i4;
        int I;
        long j2;
        long jCurrentTimeMillis;
        if (this.f12449a.w()) {
            c.f.a.c.f.q.q qVarA = c.f.a.c.f.q.p.b().a();
            if ((qVarA == null || qVarA.K()) && (d0VarR = this.f12449a.r(this.f12451c)) != null && (d0VarR.s() instanceof c.f.a.c.f.q.c)) {
                c.f.a.c.f.q.c cVar = (c.f.a.c.f.q.c) d0VarR.s();
                boolean zL = this.f12452d > 0;
                int gCoreServiceId = cVar.getGCoreServiceId();
                if (qVarA != null) {
                    zL &= qVarA.L();
                    int I2 = qVarA.I();
                    int iJ = qVarA.J();
                    iM = qVarA.M();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        c.f.a.c.f.q.e eVarC = c(d0VarR, cVar, this.f12450b);
                        if (eVarC == null) {
                            return;
                        }
                        boolean z = eVarC.M() && this.f12452d > 0;
                        iJ = eVarC.I();
                        zL = z;
                    }
                    i2 = I2;
                    i3 = iJ;
                } else {
                    iM = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                g gVar = this.f12449a;
                if (iVar.o()) {
                    i4 = 0;
                    I = 0;
                } else {
                    if (iVar.m()) {
                        i4 = 100;
                    } else {
                        Exception excJ = iVar.j();
                        if (excJ instanceof c.f.a.c.f.o.b) {
                            Status statusA = ((c.f.a.c.f.o.b) excJ).a();
                            int iJ2 = statusA.J();
                            c.f.a.c.f.b bVarI = statusA.I();
                            I = bVarI == null ? -1 : bVarI.I();
                            i4 = iJ2;
                        } else {
                            i4 = 101;
                        }
                    }
                    I = -1;
                }
                if (zL) {
                    long j3 = this.f12452d;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    j2 = j3;
                } else {
                    j2 = 0;
                    jCurrentTimeMillis = 0;
                }
                gVar.B(new c.f.a.c.f.q.m(this.f12450b, i4, I, j2, jCurrentTimeMillis, null, null, gCoreServiceId), iM, i2, i3);
            }
        }
    }
}
