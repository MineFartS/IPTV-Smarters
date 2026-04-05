package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ga extends da<oa.c> {
    @Override // c.f.a.c.j.c.da
    public final int a(Map.Entry<?, ?> entry) {
        throw new NoSuchMethodError();
    }

    @Override // c.f.a.c.j.c.da
    public final void b(ce ceVar, Map.Entry<?, ?> entry) {
        throw new NoSuchMethodError();
    }

    @Override // c.f.a.c.j.c.da
    public final ia<oa.c> c(Object obj) {
        return ((oa.d) obj).zzbre;
    }

    @Override // c.f.a.c.j.c.da
    public final boolean d(bc bcVar) {
        return bcVar instanceof oa.d;
    }

    @Override // c.f.a.c.j.c.da
    public final ia<oa.c> e(Object obj) {
        oa.d dVar = (oa.d) obj;
        if (dVar.zzbre.b()) {
            dVar.zzbre = (ia) dVar.zzbre.clone();
        }
        return dVar.zzbre;
    }

    @Override // c.f.a.c.j.c.da
    public final void f(Object obj) {
        c(obj).p();
    }
}
