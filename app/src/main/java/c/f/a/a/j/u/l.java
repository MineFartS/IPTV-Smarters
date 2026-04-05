package c.f.a.a.j.u;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements c.f.a.a.j.v.a.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Context> f6225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<i> f6226b;

    public l(g.a.a<Context> aVar, g.a.a<i> aVar2) {
        this.f6225a = aVar;
        this.f6226b = aVar2;
    }

    public static l a(g.a.a<Context> aVar, g.a.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f6225a.get(), this.f6226b.get());
    }
}
