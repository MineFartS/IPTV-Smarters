package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class o7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f14191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n7 f14192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n7 f14193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u7 f14195f;

    public o7(u7 u7Var, Bundle bundle, n7 n7Var, n7 n7Var2, long j2) {
        this.f14195f = u7Var;
        this.f14191b = bundle;
        this.f14192c = n7Var;
        this.f14193d = n7Var2;
        this.f14194e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u7.E(this.f14195f, this.f14191b, this.f14192c, this.f14193d, this.f14194e);
    }
}
