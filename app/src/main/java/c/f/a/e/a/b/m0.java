package c.f.a.e.a.b;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements c.f.a.e.a.e.c0<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15538i = 0;

    public m0(c.f.a.e.a.e.c0<a1> c0Var, c.f.a.e.a.e.c0<s2> c0Var2, c.f.a.e.a.e.c0<j0> c0Var3, c.f.a.e.a.e.c0<c2> c0Var4, c.f.a.e.a.e.c0<n1> c0Var5, c.f.a.e.a.e.c0<s1> c0Var6, c.f.a.e.a.e.c0<w1> c0Var7, c.f.a.e.a.e.c0<d1> c0Var8) {
        this.f15530a = c0Var;
        this.f15531b = c0Var2;
        this.f15532c = c0Var3;
        this.f15533d = c0Var4;
        this.f15534e = c0Var5;
        this.f15535f = c0Var6;
        this.f15536g = c0Var7;
        this.f15537h = c0Var8;
    }

    public m0(c.f.a.e.a.e.c0<Context> c0Var, c.f.a.e.a.e.c0<a1> c0Var2, c.f.a.e.a.e.c0<l0> c0Var3, c.f.a.e.a.e.c0<s2> c0Var4, c.f.a.e.a.e.c0<o0> c0Var5, c.f.a.e.a.e.c0<e0> c0Var6, c.f.a.e.a.e.c0<Executor> c0Var7, c.f.a.e.a.e.c0<Executor> c0Var8, byte[] bArr) {
        this.f15530a = c0Var;
        this.f15536g = c0Var2;
        this.f15537h = c0Var3;
        this.f15531b = c0Var4;
        this.f15534e = c0Var5;
        this.f15535f = c0Var6;
        this.f15532c = c0Var7;
        this.f15533d = c0Var8;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [c.f.a.e.a.b.l0, c.f.a.e.a.b.s] */
    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ l0 a() {
        if (this.f15538i == 0) {
            Object objA = this.f15530a.a();
            return new l0((a1) objA, c.f.a.e.a.e.b0.c(this.f15531b), (j0) this.f15532c.a(), (c2) this.f15533d.a(), (n1) this.f15534e.a(), (s1) this.f15535f.a(), (w1) this.f15536g.a(), (d1) this.f15537h.a());
        }
        Context contextA = ((o2) this.f15530a).a();
        Object objA2 = this.f15536g.a();
        Object objA3 = this.f15537h.a();
        c.f.a.e.a.e.z zVarC = c.f.a.e.a.e.b0.c(this.f15531b);
        Object objA4 = this.f15534e.a();
        Object objA5 = this.f15535f.a();
        return new s(contextA, (a1) objA2, (l0) objA3, zVarC, (o0) objA4, (e0) objA5, c.f.a.e.a.e.b0.c(this.f15532c), c.f.a.e.a.e.b0.c(this.f15533d));
    }
}
