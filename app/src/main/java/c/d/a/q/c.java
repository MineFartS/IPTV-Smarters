package c.d.a.q;

import c.d.a.t.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5892a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<g, b<?, ?>> f5893b = new HashMap();

    public <T, Z> b<T, Z> a(Class<T> cls, Class<Z> cls2) {
        b<T, Z> bVar;
        g gVar = f5892a;
        synchronized (gVar) {
            gVar.a(cls, cls2);
            bVar = (b) this.f5893b.get(gVar);
        }
        return bVar == null ? d.d() : bVar;
    }

    public <T, Z> void b(Class<T> cls, Class<Z> cls2, b<T, Z> bVar) {
        this.f5893b.put(new g(cls, cls2), bVar);
    }
}
