package c.f.a.a.j;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile s f6194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.a.j.a0.a f6196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.j.y.e f6197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.j.y.j.m f6198e;

    public r(c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2, c.f.a.a.j.y.e eVar, c.f.a.a.j.y.j.m mVar, c.f.a.a.j.y.j.q qVar) {
        this.f6195b = aVar;
        this.f6196c = aVar2;
        this.f6197d = eVar;
        this.f6198e = mVar;
        qVar.a();
    }

    public static r c() {
        s sVar = f6194a;
        if (sVar != null) {
            return sVar.i();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<c.f.a.a.b> d(e eVar) {
        return eVar instanceof f ? Collections.unmodifiableSet(((f) eVar).a()) : Collections.singleton(c.f.a.a.b.b("proto"));
    }

    public static void f(Context context) {
        if (f6194a == null) {
            synchronized (r.class) {
                if (f6194a == null) {
                    f6194a = d.l().a(context).build();
                }
            }
        }
    }

    @Override // c.f.a.a.j.q
    public void a(l lVar, c.f.a.a.h hVar) {
        this.f6197d.a(lVar.f().e(lVar.c().c()), b(lVar), hVar);
    }

    public final h b(l lVar) {
        return h.a().i(this.f6195b.a()).k(this.f6196c.a()).j(lVar.g()).h(new g(lVar.b(), lVar.d())).g(lVar.c().a()).d();
    }

    public c.f.a.a.j.y.j.m e() {
        return this.f6198e;
    }

    public c.f.a.a.g g(e eVar) {
        return new n(d(eVar), m.a().b(eVar.getName()).c(eVar.getExtras()).a(), this);
    }
}
