package c.f.a.e.a.b;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 implements c.f.a.e.a.e.c0<d1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15410d = 0;

    public e1(c.f.a.e.a.e.c0<a1> c0Var, c.f.a.e.a.e.c0<v> c0Var2, c.f.a.e.a.e.c0<c0> c0Var3) {
        this.f15407a = c0Var;
        this.f15408b = c0Var2;
        this.f15409c = c0Var3;
    }

    public e1(c.f.a.e.a.e.c0<Context> c0Var, c.f.a.e.a.e.c0<o> c0Var2, c.f.a.e.a.e.c0<i1> c0Var3, byte[] bArr) {
        this.f15409c = c0Var;
        this.f15408b = c0Var2;
        this.f15407a = c0Var3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [c.f.a.e.a.b.d1, c.f.a.e.a.b.s2, java.lang.Object] */
    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ d1 a() {
        if (this.f15410d == 0) {
            return new d1((a1) this.f15407a.a(), (v) this.f15408b.a(), (c0) this.f15409c.a());
        }
        ?? r0 = (s2) (k2.b(((o2) this.f15409c).a()) == null ? c.f.a.e.a.e.b0.c(this.f15408b).a() : c.f.a.e.a.e.b0.c(this.f15407a).a());
        c.f.a.e.a.e.n.d(r0);
        return r0;
    }
}
