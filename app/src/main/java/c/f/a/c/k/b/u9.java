package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class u9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f14371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9 f14372d;

    public u9(v9 v9Var, String str, Bundle bundle) {
        this.f14372d = v9Var;
        this.f14370b = str;
        this.f14371c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14372d.f14402a.o0(this.f14372d.f14402a.h0().J(this.f14370b, "_err", this.f14371c, "auto", this.f14372d.f14402a.a().a(), false, false, false), this.f14370b);
    }
}
