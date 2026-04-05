package c.f.a.c.k.b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class k5 implements Callable<List<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f14027d;

    public k5(v5 v5Var, String str, String str2, String str3) {
        this.f14027d = v5Var;
        this.f14024a = str;
        this.f14025b = str2;
        this.f14026c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<b> call() {
        this.f14027d.f14388b.p();
        return this.f14027d.f14388b.Z().Y(this.f14024a, this.f14025b, this.f14026c);
    }
}
