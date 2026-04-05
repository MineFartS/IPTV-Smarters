package c.f.a.a.j.y.j;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements c.f.a.a.j.v.a.b<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Executor> f6311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.k.c> f6312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<s> f6313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.z.b> f6314d;

    public r(g.a.a<Executor> aVar, g.a.a<c.f.a.a.j.y.k.c> aVar2, g.a.a<s> aVar3, g.a.a<c.f.a.a.j.z.b> aVar4) {
        this.f6311a = aVar;
        this.f6312b = aVar2;
        this.f6313c = aVar3;
        this.f6314d = aVar4;
    }

    public static r a(g.a.a<Executor> aVar, g.a.a<c.f.a.a.j.y.k.c> aVar2, g.a.a<s> aVar3, g.a.a<c.f.a.a.j.z.b> aVar4) {
        return new r(aVar, aVar2, aVar3, aVar4);
    }

    public static q c(Executor executor, c.f.a.a.j.y.k.c cVar, s sVar, c.f.a.a.j.z.b bVar) {
        return new q(executor, cVar, sVar, bVar);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f6311a.get(), this.f6312b.get(), this.f6313c.get(), this.f6314d.get());
    }
}
