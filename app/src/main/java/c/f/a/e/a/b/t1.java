package c.f.a.e.a.b;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class t1 implements c.f.a.e.a.e.c0<s1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.e.a.e.c0 f15619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15620g = 0;

    public t1(c.f.a.e.a.e.c0<v> c0Var, c.f.a.e.a.e.c0<s2> c0Var2, c.f.a.e.a.e.c0<a1> c0Var3, c.f.a.e.a.e.c0<Executor> c0Var4, c.f.a.e.a.e.c0<o0> c0Var5, c.f.a.e.a.e.c0<c.f.a.e.a.c.b> c0Var6) {
        this.f15614a = c0Var;
        this.f15615b = c0Var2;
        this.f15616c = c0Var3;
        this.f15617d = c0Var4;
        this.f15618e = c0Var5;
        this.f15619f = c0Var6;
    }

    public t1(c.f.a.e.a.e.c0<String> c0Var, c.f.a.e.a.e.c0<s> c0Var2, c.f.a.e.a.e.c0<o0> c0Var3, c.f.a.e.a.e.c0<Context> c0Var4, c.f.a.e.a.e.c0<u1> c0Var5, c.f.a.e.a.e.c0<Executor> c0Var6, byte[] bArr) {
        this.f15619f = c0Var;
        this.f15615b = c0Var2;
        this.f15618e = c0Var3;
        this.f15617d = c0Var4;
        this.f15616c = c0Var5;
        this.f15614a = c0Var6;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [c.f.a.e.a.b.i1, c.f.a.e.a.b.s1] */
    @Override // c.f.a.e.a.e.c0
    public final /* bridge */ /* synthetic */ s1 a() {
        if (this.f15620g == 0) {
            Object objA = this.f15614a.a();
            c.f.a.e.a.e.z zVarC = c.f.a.e.a.e.b0.c(this.f15615b);
            Object objA2 = this.f15616c.a();
            return new s1((v) objA, zVarC, (a1) objA2, c.f.a.e.a.e.b0.c(this.f15617d), (o0) this.f15618e.a(), (c.f.a.e.a.c.b) this.f15619f.a());
        }
        String str = (String) this.f15619f.a();
        Object objA3 = this.f15615b.a();
        Object objA4 = this.f15618e.a();
        Context contextA = ((o2) this.f15617d).a();
        Object objA5 = this.f15616c.a();
        return new i1(str != null ? new File(contextA.getExternalFilesDir(null), str) : contextA.getExternalFilesDir(null), (s) objA3, (o0) objA4, contextA, (u1) objA5, c.f.a.e.a.e.b0.c(this.f15614a));
    }
}
