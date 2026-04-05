package c.f.a.c.f.o.n;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r<A extends a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.c.f.d[] f12488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12490c;

    public static class a<A extends a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p<A, c.f.a.c.o.j<ResultT>> f12491a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.a.c.f.d[] f12493c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12492b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f12494d = 0;

        public /* synthetic */ a(a1 a1Var) {
        }

        @RecentlyNonNull
        public r<A, ResultT> a() {
            c.f.a.c.f.q.o.b(this.f12491a != null, "execute parameter required");
            return new b1(this, this.f12493c, this.f12492b, this.f12494d);
        }

        @RecentlyNonNull
        public a<A, ResultT> b(@RecentlyNonNull p<A, c.f.a.c.o.j<ResultT>> pVar) {
            this.f12491a = pVar;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> c(boolean z) {
            this.f12492b = z;
            return this;
        }

        @RecentlyNonNull
        public a<A, ResultT> d(@RecentlyNonNull c.f.a.c.f.d... dVarArr) {
            this.f12493c = dVarArr;
            return this;
        }
    }

    public r(c.f.a.c.f.d[] dVarArr, boolean z, int i2) {
        this.f12488a = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        this.f12489b = z2;
        this.f12490c = i2;
    }

    @RecentlyNonNull
    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    public abstract void b(@RecentlyNonNull A a2, @RecentlyNonNull c.f.a.c.o.j<ResultT> jVar);

    public boolean c() {
        return this.f12489b;
    }

    @RecentlyNullable
    public final c.f.a.c.f.d[] d() {
        return this.f12488a;
    }

    public final int e() {
        return this.f12490c;
    }
}
