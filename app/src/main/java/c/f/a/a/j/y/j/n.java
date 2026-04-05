package c.f.a.a.j.y.j;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n implements c.f.a.a.j.v.a.b<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Context> f6298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.u.e> f6299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.k.c> f6300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a.a<s> f6301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g.a.a<Executor> f6302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.z.b> f6303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6304g;

    public n(g.a.a<Context> aVar, g.a.a<c.f.a.a.j.u.e> aVar2, g.a.a<c.f.a.a.j.y.k.c> aVar3, g.a.a<s> aVar4, g.a.a<Executor> aVar5, g.a.a<c.f.a.a.j.z.b> aVar6, g.a.a<c.f.a.a.j.a0.a> aVar7) {
        this.f6298a = aVar;
        this.f6299b = aVar2;
        this.f6300c = aVar3;
        this.f6301d = aVar4;
        this.f6302e = aVar5;
        this.f6303f = aVar6;
        this.f6304g = aVar7;
    }

    public static n a(g.a.a<Context> aVar, g.a.a<c.f.a.a.j.u.e> aVar2, g.a.a<c.f.a.a.j.y.k.c> aVar3, g.a.a<s> aVar4, g.a.a<Executor> aVar5, g.a.a<c.f.a.a.j.z.b> aVar6, g.a.a<c.f.a.a.j.a0.a> aVar7) {
        return new n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static m c(Context context, c.f.a.a.j.u.e eVar, c.f.a.a.j.y.k.c cVar, s sVar, Executor executor, c.f.a.a.j.z.b bVar, c.f.a.a.j.a0.a aVar) {
        return new m(context, eVar, cVar, sVar, executor, bVar, aVar);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f6298a.get(), this.f6299b.get(), this.f6300c.get(), this.f6301d.get(), this.f6302e.get(), this.f6303f.get(), this.f6304g.get());
    }
}
