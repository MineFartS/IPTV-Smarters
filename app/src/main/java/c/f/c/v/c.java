package c.f.c.v;

import c.f.c.k.q;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16434b;

    public c(Set<f> set, d dVar) {
        this.f16433a = d(set);
        this.f16434b = dVar;
    }

    public static c.f.c.k.d<i> b() {
        return c.f.c.k.d.a(i.class).b(q.j(f.class)).f(b.b()).d();
    }

    public static /* synthetic */ i c(c.f.c.k.e eVar) {
        return new c(eVar.d(f.class), d.a());
    }

    public static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // c.f.c.v.i
    public String a() {
        if (this.f16434b.b().isEmpty()) {
            return this.f16433a;
        }
        return this.f16433a + ' ' + d(this.f16434b.b());
    }
}
