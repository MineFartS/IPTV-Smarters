package c.f.a.a.j.y;

import android.content.Context;
import c.f.a.a.j.y.j.s;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c.f.a.a.j.v.a.b<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Context> f6251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.k.c> f6252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.j.g> f6253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6254d;

    public i(g.a.a<Context> aVar, g.a.a<c.f.a.a.j.y.k.c> aVar2, g.a.a<c.f.a.a.j.y.j.g> aVar3, g.a.a<c.f.a.a.j.a0.a> aVar4) {
        this.f6251a = aVar;
        this.f6252b = aVar2;
        this.f6253c = aVar3;
        this.f6254d = aVar4;
    }

    public static i a(g.a.a<Context> aVar, g.a.a<c.f.a.a.j.y.k.c> aVar2, g.a.a<c.f.a.a.j.y.j.g> aVar3, g.a.a<c.f.a.a.j.a0.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static s c(Context context, c.f.a.a.j.y.k.c cVar, c.f.a.a.j.y.j.g gVar, c.f.a.a.j.a0.a aVar) {
        return (s) c.f.a.a.j.v.a.d.c(h.a(context, cVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s get() {
        return c(this.f6251a.get(), this.f6252b.get(), this.f6253c.get(), this.f6254d.get());
    }
}
