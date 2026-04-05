package c.f.a.a.j;

import android.content.Context;
import c.f.a.a.j.s;
import c.f.a.a.j.y.k.b0;
import c.f.a.a.j.y.k.c0;
import c.f.a.a.j.y.k.i0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g.a.a<Executor> f6167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g.a.a<Context> f6168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.a.a f6169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g.a.a f6170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.a.a f6171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g.a.a<b0> f6172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g.a.a<c.f.a.a.j.y.j.g> f6173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g.a.a<c.f.a.a.j.y.j.s> f6174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g.a.a<c.f.a.a.j.y.c> f6175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g.a.a<c.f.a.a.j.y.j.m> f6176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g.a.a<c.f.a.a.j.y.j.q> f6177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g.a.a<r> f6178m;

    public static final class b implements s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f6179a;

        public b() {
        }

        @Override // c.f.a.a.j.s.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f6179a = (Context) c.f.a.a.j.v.a.d.b(context);
            return this;
        }

        @Override // c.f.a.a.j.s.a
        public s build() {
            c.f.a.a.j.v.a.d.a(this.f6179a, Context.class);
            return new d(this.f6179a);
        }
    }

    public d(Context context) {
        m(context);
    }

    public static s.a l() {
        return new b();
    }

    @Override // c.f.a.a.j.s
    public c.f.a.a.j.y.k.c d() {
        return this.f6172g.get();
    }

    @Override // c.f.a.a.j.s
    public r i() {
        return this.f6178m.get();
    }

    public final void m(Context context) {
        this.f6167b = c.f.a.a.j.v.a.a.a(j.a());
        c.f.a.a.j.v.a.b bVarA = c.f.a.a.j.v.a.c.a(context);
        this.f6168c = bVarA;
        c.f.a.a.j.u.j jVarA = c.f.a.a.j.u.j.a(bVarA, c.f.a.a.j.a0.c.a(), c.f.a.a.j.a0.d.a());
        this.f6169d = jVarA;
        this.f6170e = c.f.a.a.j.v.a.a.a(c.f.a.a.j.u.l.a(this.f6168c, jVarA));
        this.f6171f = i0.a(this.f6168c, c.f.a.a.j.y.k.f.a(), c.f.a.a.j.y.k.g.a());
        this.f6172g = c.f.a.a.j.v.a.a.a(c0.a(c.f.a.a.j.a0.c.a(), c.f.a.a.j.a0.d.a(), c.f.a.a.j.y.k.h.a(), this.f6171f));
        c.f.a.a.j.y.g gVarB = c.f.a.a.j.y.g.b(c.f.a.a.j.a0.c.a());
        this.f6173h = gVarB;
        c.f.a.a.j.y.i iVarA = c.f.a.a.j.y.i.a(this.f6168c, this.f6172g, gVarB, c.f.a.a.j.a0.d.a());
        this.f6174i = iVarA;
        g.a.a<Executor> aVar = this.f6167b;
        g.a.a aVar2 = this.f6170e;
        g.a.a<b0> aVar3 = this.f6172g;
        this.f6175j = c.f.a.a.j.y.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        g.a.a<Context> aVar4 = this.f6168c;
        g.a.a aVar5 = this.f6170e;
        g.a.a<b0> aVar6 = this.f6172g;
        this.f6176k = c.f.a.a.j.y.j.n.a(aVar4, aVar5, aVar6, this.f6174i, this.f6167b, aVar6, c.f.a.a.j.a0.c.a());
        g.a.a<Executor> aVar7 = this.f6167b;
        g.a.a<b0> aVar8 = this.f6172g;
        this.f6177l = c.f.a.a.j.y.j.r.a(aVar7, aVar8, this.f6174i, aVar8);
        this.f6178m = c.f.a.a.j.v.a.a.a(t.a(c.f.a.a.j.a0.c.a(), c.f.a.a.j.a0.d.a(), this.f6175j, this.f6176k, this.f6177l));
    }
}
