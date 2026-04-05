package c.f.a.a.j.u;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c.f.a.a.j.v.a.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Context> f6217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6219c;

    public j(g.a.a<Context> aVar, g.a.a<c.f.a.a.j.a0.a> aVar2, g.a.a<c.f.a.a.j.a0.a> aVar3) {
        this.f6217a = aVar;
        this.f6218b = aVar2;
        this.f6219c = aVar3;
    }

    public static j a(g.a.a<Context> aVar, g.a.a<c.f.a.a.j.a0.a> aVar2, g.a.a<c.f.a.a.j.a0.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f6217a.get(), this.f6218b.get(), this.f6219c.get());
    }
}
