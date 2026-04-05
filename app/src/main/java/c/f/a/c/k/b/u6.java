package c.f.a.c.k.b;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class u6 implements da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f7 f14350a;

    public u6(f7 f7Var) {
        this.f14350a = f7Var;
    }

    @Override // c.f.a.c.k.b.da
    public final void g(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f14350a.X("auto", "_err", bundle);
            return;
        }
        f7 f7Var = this.f14350a;
        c5.u();
        f7Var.b0("auto", "_err", f7Var.f14413a.a().a(), bundle, false, true, false, str);
    }
}
