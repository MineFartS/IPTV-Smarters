package c.f.a.a.j.y;

import c.f.a.a.j.y.j.s;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c.f.a.a.j.v.a.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Executor> f6245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.u.e> f6246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<s> f6247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.k.c> f6248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.z.b> f6249e;

    public d(g.a.a<Executor> aVar, g.a.a<c.f.a.a.j.u.e> aVar2, g.a.a<s> aVar3, g.a.a<c.f.a.a.j.y.k.c> aVar4, g.a.a<c.f.a.a.j.z.b> aVar5) {
        this.f6245a = aVar;
        this.f6246b = aVar2;
        this.f6247c = aVar3;
        this.f6248d = aVar4;
        this.f6249e = aVar5;
    }

    public static d a(g.a.a<Executor> aVar, g.a.a<c.f.a.a.j.u.e> aVar2, g.a.a<s> aVar3, g.a.a<c.f.a.a.j.y.k.c> aVar4, g.a.a<c.f.a.a.j.z.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, c.f.a.a.j.u.e eVar, s sVar, c.f.a.a.j.y.k.c cVar, c.f.a.a.j.z.b bVar) {
        return new c(executor, eVar, sVar, cVar, bVar);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f6245a.get(), this.f6246b.get(), this.f6247c.get(), this.f6248d.get(), this.f6249e.get());
    }
}
