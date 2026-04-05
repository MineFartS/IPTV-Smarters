package c.f.a.b.c3;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    public interface a {
        String a(a0 a0Var);
    }

    public static void a(a0 a0Var, p pVar, boolean z, long j2) throws c.f.a.b.u2.a {
        r rVar;
        r rVarE = pVar.e(a0Var.f6663b);
        if (rVarE != null) {
            rVar = x.m(rVarE, a0Var, rVarE.f6771f, j2);
        } else {
            rVar = new r(a0Var, z ? 3 : 0, j2, j2, -1L, 0, 0);
        }
        pVar.f(rVar);
    }

    public static void b(File file, a aVar, p pVar, boolean z, boolean z2) {
        n nVar = new n(file);
        if (nVar.b()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (a0 a0VarB : nVar.e()) {
                    if (aVar != null) {
                        a0VarB = a0VarB.b(aVar.a(a0VarB));
                    }
                    a(a0VarB, pVar, z2, jCurrentTimeMillis);
                }
                nVar.a();
            } catch (Throwable th) {
                if (z) {
                    nVar.a();
                }
                throw th;
            }
        }
    }
}
