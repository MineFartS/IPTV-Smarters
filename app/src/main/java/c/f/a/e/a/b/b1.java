package c.f.a.e.a.b;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 implements c.f.a.e.a.e.c0<a1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15375e = 0;

    public b1(c.f.a.e.a.e.c0<v> c0Var, c.f.a.e.a.e.c0<s2> c0Var2, c.f.a.e.a.e.c0<o0> c0Var3, c.f.a.e.a.e.c0<Executor> c0Var4) {
        this.f15371a = c0Var;
        this.f15372b = c0Var2;
        this.f15373c = c0Var3;
        this.f15374d = c0Var4;
    }

    public b1(c.f.a.e.a.e.c0<v> c0Var, c.f.a.e.a.e.c0<s2> c0Var2, c.f.a.e.a.e.c0<s> c0Var3, c.f.a.e.a.e.c0<o0> c0Var4, byte[] bArr) {
        this.f15371a = c0Var;
        this.f15372b = c0Var2;
        this.f15373c = c0Var3;
        this.f15374d = c0Var4;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [c.f.a.e.a.b.a1, c.f.a.e.a.b.j0] */
    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ a1 a() {
        if (this.f15375e != 0) {
            return new j0((v) this.f15371a.a(), c.f.a.e.a.e.b0.c(this.f15372b), c.f.a.e.a.e.b0.c(this.f15373c), (o0) this.f15374d.a());
        }
        Object objA = this.f15371a.a();
        return new a1((v) objA, c.f.a.e.a.e.b0.c(this.f15372b), (o0) this.f15373c.a(), c.f.a.e.a.e.b0.c(this.f15374d));
    }
}
