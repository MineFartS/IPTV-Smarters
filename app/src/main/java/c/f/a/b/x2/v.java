package c.f.a.b.x2;

import android.net.Uri;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.x;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import c.f.a.b.x2.u;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10440a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1.e f10441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f10442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0.b f10443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10444e;

    @Override // c.f.a.b.x2.e0
    public c0 a(p1 p1Var) {
        c0 c0Var;
        c.f.a.b.j3.g.e(p1Var.f9643d);
        p1.e eVar = p1Var.f9643d.f9687c;
        if (eVar == null || x0.f9296a < 18) {
            return c0.f10329a;
        }
        synchronized (this.f10440a) {
            if (!x0.b(eVar, this.f10441b)) {
                this.f10441b = eVar;
                this.f10442c = b(eVar);
            }
            c0Var = (c0) c.f.a.b.j3.g.e(this.f10442c);
        }
        return c0Var;
    }

    public final c0 b(p1.e eVar) {
        c0.b bVarC = this.f10443d;
        if (bVarC == null) {
            bVarC = new x.b().c(this.f10444e);
        }
        Uri uri = eVar.f9671b;
        l0 l0Var = new l0(uri == null ? null : uri.toString(), eVar.f9675f, bVarC);
        for (Map.Entry<String, String> entry : eVar.f9672c.entrySet()) {
            l0Var.e(entry.getKey(), entry.getValue());
        }
        u uVarA = new u.b().f(eVar.f9670a, k0.f10357a).c(eVar.f9673d).d(eVar.f9674e).e(c.f.b.f.c.j(eVar.f9676g)).a(l0Var);
        uVarA.C(0, eVar.a());
        return uVarA;
    }
}
