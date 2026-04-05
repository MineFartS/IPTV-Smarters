package androidx.lifecycle;

import a.p.e;
import a.p.f;
import a.p.i;
import a.p.k;
import a.p.o;

/* JADX INFO: loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e[] f4613b;

    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.f4613b = eVarArr;
    }

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        o oVar = new o();
        for (e eVar : this.f4613b) {
            eVar.a(kVar, bVar, false, oVar);
        }
        for (e eVar2 : this.f4613b) {
            eVar2.a(kVar, bVar, true, oVar);
        }
    }
}
