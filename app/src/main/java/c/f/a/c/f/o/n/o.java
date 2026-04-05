package c.f.a.c.f.o.n;

import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.b;
import c.f.a.c.f.o.n.j;

/* JADX INFO: loaded from: classes2.dex */
public class o<A extends a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    public final n<A, L> f12469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public final s<A, L> f12470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public final Runnable f12471c;

    public static class a<A extends a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p<A, c.f.a.c.o.j<Void>> f12472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p<A, c.f.a.c.o.j<Boolean>> f12473b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j<L> f12475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.c.f.d[] f12476e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f12478g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f12474c = t0.f12505b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f12477f = true;

        public /* synthetic */ a(s0 s0Var) {
        }

        @RecentlyNonNull
        public o<A, L> a() {
            c.f.a.c.f.q.o.b(this.f12472a != null, "Must set register function");
            c.f.a.c.f.q.o.b(this.f12473b != null, "Must set unregister function");
            c.f.a.c.f.q.o.b(this.f12475d != null, "Must set holder");
            return new o<>(new u0(this, this.f12475d, this.f12476e, this.f12477f, this.f12478g), new v0(this, (j.a) c.f.a.c.f.q.o.j(this.f12475d.b(), "Key must not be null")), this.f12474c, null);
        }

        @RecentlyNonNull
        public a<A, L> b(@RecentlyNonNull p<A, c.f.a.c.o.j<Void>> pVar) {
            this.f12472a = pVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> c(@RecentlyNonNull c.f.a.c.f.d... dVarArr) {
            this.f12476e = dVarArr;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> d(@RecentlyNonNull p<A, c.f.a.c.o.j<Boolean>> pVar) {
            this.f12473b = pVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, L> e(@RecentlyNonNull j<L> jVar) {
            this.f12475d = jVar;
            return this;
        }
    }

    public /* synthetic */ o(n nVar, s sVar, Runnable runnable, s0 s0Var) {
        this.f12469a = nVar;
        this.f12470b = sVar;
        this.f12471c = runnable;
    }

    @RecentlyNonNull
    public static <A extends a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
