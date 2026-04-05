package c.f.a.c.k.b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class j5 implements Callable<List<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la f13998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f14001d;

    public j5(v5 v5Var, la laVar, String str, String str2) {
        this.f14001d = v5Var;
        this.f13998a = laVar;
        this.f13999b = str;
        this.f14000c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<b> call() {
        this.f14001d.f14388b.p();
        return this.f14001d.f14388b.Z().Y(this.f13998a.f14070b, this.f13999b, this.f14000c);
    }
}
