package c.d.a.n.k.j;

import c.d.a.t.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5853a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<g, c<?, ?>> f5854b = new HashMap();

    public <Z, R> c<Z, R> a(Class<Z> cls, Class<R> cls2) {
        c<Z, R> cVar;
        if (cls.equals(cls2)) {
            return e.b();
        }
        g gVar = f5853a;
        synchronized (gVar) {
            gVar.a(cls, cls2);
            cVar = (c) this.f5854b.get(gVar);
        }
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    public <Z, R> void b(Class<Z> cls, Class<R> cls2, c<Z, R> cVar) {
        this.f5854b.put(new g(cls, cls2), cVar);
    }
}
