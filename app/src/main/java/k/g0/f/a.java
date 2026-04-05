package k.g0.f;

import k.a0;
import k.c0;
import k.u;
import k.x;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f30592a;

    public a(x xVar) {
        this.f30592a = xVar;
    }

    @Override // k.u
    public c0 a(u.a aVar) {
        k.g0.g.g gVar = (k.g0.g.g) aVar;
        a0 a0VarRequest = gVar.request();
        g gVarE = gVar.e();
        return gVar.d(a0VarRequest, gVarE, gVarE.i(this.f30592a, !a0VarRequest.f().equals("GET")), gVarE.d());
    }
}
