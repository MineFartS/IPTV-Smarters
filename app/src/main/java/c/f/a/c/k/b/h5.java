package c.f.a.c.k.b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class h5 implements Callable<List<ca>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la f13937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f13940d;

    public h5(v5 v5Var, la laVar, String str, String str2) {
        this.f13940d = v5Var;
        this.f13937a = laVar;
        this.f13938b = str;
        this.f13939c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<ca> call() {
        this.f13940d.f14388b.p();
        return this.f13940d.f14388b.Z().U(this.f13937a.f14070b, this.f13938b, this.f13939c);
    }
}
