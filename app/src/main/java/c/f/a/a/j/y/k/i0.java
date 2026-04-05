package c.f.a.a.j.y.k;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements c.f.a.a.j.v.a.b<h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<Context> f6357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<String> f6358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<Integer> f6359c;

    public i0(g.a.a<Context> aVar, g.a.a<String> aVar2, g.a.a<Integer> aVar3) {
        this.f6357a = aVar;
        this.f6358b = aVar2;
        this.f6359c = aVar3;
    }

    public static i0 a(g.a.a<Context> aVar, g.a.a<String> aVar2, g.a.a<Integer> aVar3) {
        return new i0(aVar, aVar2, aVar3);
    }

    public static h0 c(Context context, String str, int i2) {
        return new h0(context, str, i2);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h0 get() {
        return c(this.f6357a.get(), this.f6358b.get(), this.f6359c.get().intValue());
    }
}
