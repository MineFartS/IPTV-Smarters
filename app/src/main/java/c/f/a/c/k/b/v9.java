package c.f.a.c.k.b;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class v9 implements da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x9 f14402a;

    public v9(x9 x9Var) {
        this.f14402a = x9Var;
    }

    @Override // c.f.a.c.k.b.da
    public final void g(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f14402a.f14456k.c().o().a("AppId not known when logging error event");
        } else {
            this.f14402a.d().r(new u9(this, str, bundle));
        }
    }
}
