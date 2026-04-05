package c.f.a.e.a.b;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements c.f.a.e.a.e.c0<n1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15569b = 0;

    public o1(c.f.a.e.a.e.c0<v> c0Var) {
        this.f15568a = c0Var;
    }

    public o1(c.f.a.e.a.e.c0<s2> c0Var, byte[] bArr) {
        this.f15568a = c0Var;
    }

    public o1(c.f.a.e.a.e.c0<Context> c0Var, char[] cArr) {
        this.f15568a = c0Var;
    }

    public o1(c.f.a.e.a.e.c0<v> c0Var, short[] sArr) {
        this.f15568a = c0Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [c.f.a.e.a.b.c0, c.f.a.e.a.b.n1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [c.f.a.e.a.b.n1, c.f.a.e.a.b.u1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c.f.a.e.a.b.c2, c.f.a.e.a.b.n1] */
    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ n1 a() {
        int i2 = this.f15569b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new c2((v) this.f15568a.a()) : new u1(((o2) this.f15568a).a()) : new c0(c.f.a.e.a.e.b0.c(this.f15568a)) : new n1((v) this.f15568a.a());
    }
}
