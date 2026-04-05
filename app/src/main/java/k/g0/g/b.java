package k.g0.g;

import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.Headers;
import java.net.ProtocolException;
import k.a0;
import k.c0;
import k.u;
import l.m;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30635a;

    public b(boolean z) {
        this.f30635a = z;
    }

    @Override // k.u
    public c0 a(u.a aVar) throws ProtocolException {
        g gVar = (g) aVar;
        c cVarC = gVar.c();
        k.g0.f.g gVarE = gVar.e();
        k.g0.f.c cVar = (k.g0.f.c) gVar.b();
        a0 a0VarRequest = gVar.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cVarC.c(a0VarRequest);
        c0.a aVarE = null;
        if (f.b(a0VarRequest.f()) && a0VarRequest.a() != null) {
            if ("100-continue".equalsIgnoreCase(a0VarRequest.c(HttpHeader.EXPECT))) {
                cVarC.a();
                aVarE = cVarC.e(true);
            }
            if (aVarE == null) {
                l.d dVarB = m.b(cVarC.f(a0VarRequest, a0VarRequest.a().a()));
                a0VarRequest.a().h(dVarB);
                dVarB.close();
            } else if (!cVar.o()) {
                gVarE.j();
            }
        }
        cVarC.b();
        if (aVarE == null) {
            aVarE = cVarC.e(false);
        }
        c0 c0VarC = aVarE.o(a0VarRequest).h(gVarE.d().l()).p(jCurrentTimeMillis).n(System.currentTimeMillis()).c();
        int iL = c0VarC.l();
        c0 c0VarC2 = ((this.f30635a && iL == 101) ? c0VarC.r().b(k.g0.c.f30557c) : c0VarC.r().b(cVarC.d(c0VarC))).c();
        if ("close".equalsIgnoreCase(c0VarC2.t().c(Headers.CONNECTION)) || "close".equalsIgnoreCase(c0VarC2.n(Headers.CONNECTION))) {
            gVarE.j();
        }
        if ((iL != 204 && iL != 205) || c0VarC2.d().l() <= 0) {
            return c0VarC2;
        }
        throw new ProtocolException("HTTP " + iL + " had non-zero Content-Length: " + c0VarC2.d().l());
    }
}
