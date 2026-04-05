package c.c.a.a;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f5155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f5156c;

    public m(d dVar, String str, h hVar) {
        this.f5156c = dVar;
        this.f5154a = str;
        this.f5155b = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() {
        Purchase.a aVarY = d.y(this.f5156c, this.f5154a);
        if (aVarY.b() != null) {
            this.f5155b.a(aVarY.a(), aVarY.b());
            return null;
        }
        this.f5155b.a(aVarY.a(), c.f.a.c.j.i.p.i());
        return null;
    }
}
