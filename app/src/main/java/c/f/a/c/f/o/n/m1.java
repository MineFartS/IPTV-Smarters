package c.f.a.c.f.o.n;

import android.app.Dialog;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f12459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f12460b;

    public m1(n1 n1Var, Dialog dialog) {
        this.f12460b = n1Var;
        this.f12459a = dialog;
    }

    @Override // c.f.a.c.f.o.n.i0
    public final void a() {
        this.f12460b.f12468c.l();
        if (this.f12459a.isShowing()) {
            this.f12459a.dismiss();
        }
    }
}
