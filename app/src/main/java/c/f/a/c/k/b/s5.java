package c.f.a.c.k.b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class s5 implements Callable<List<ca>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la f14293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v5 f14294b;

    public s5(v5 v5Var, la laVar) {
        this.f14294b = v5Var;
        this.f14293a = laVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<ca> call() {
        this.f14294b.f14388b.p();
        return this.f14294b.f14388b.Z().T(this.f14293a.f14070b);
    }
}
