package c.f.a.c.k.b;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class i5 implements Callable<List<ca>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v5 f13967d;

    public i5(v5 v5Var, String str, String str2, String str3) {
        this.f13967d = v5Var;
        this.f13964a = str;
        this.f13965b = str2;
        this.f13966c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<ca> call() {
        this.f13967d.f14388b.p();
        return this.f13967d.f14388b.Z().U(this.f13964a, this.f13965b, this.f13966c);
    }
}
