package c.f.a.c.f.o.n;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.b;
import c.f.a.c.f.o.n.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n<A extends a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<L> f12461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.f.d[] f12462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12464d;

    public n(@RecentlyNonNull j<L> jVar, c.f.a.c.f.d[] dVarArr, boolean z, int i2) {
        this.f12461a = jVar;
        this.f12462b = dVarArr;
        this.f12463c = z;
        this.f12464d = i2;
    }

    public void a() {
        this.f12461a.a();
    }

    @RecentlyNullable
    public j.a<L> b() {
        return this.f12461a.b();
    }

    @RecentlyNullable
    public c.f.a.c.f.d[] c() {
        return this.f12462b;
    }

    public abstract void d(@RecentlyNonNull A a2, @RecentlyNonNull c.f.a.c.o.j<Void> jVar);

    public final boolean e() {
        return this.f12463c;
    }

    public final int f() {
        return this.f12464d;
    }
}
