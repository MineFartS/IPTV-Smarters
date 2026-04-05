package c.f.a.c.f.o.n;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f12467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f12468c;

    public n1(o1 o1Var, l1 l1Var) {
        this.f12468c = o1Var;
        this.f12467b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12468c.f12479c) {
            c.f.a.c.f.b bVarB = this.f12467b.b();
            if (bVarB.L()) {
                o1 o1Var = this.f12468c;
                o1Var.f24257b.startActivityForResult(GoogleApiActivity.a(o1Var.b(), (PendingIntent) c.f.a.c.f.q.o.i(bVarB.K()), this.f12467b.a(), false), 1);
                return;
            }
            o1 o1Var2 = this.f12468c;
            if (o1Var2.f12482f.b(o1Var2.b(), bVarB.I(), null) != null) {
                o1 o1Var3 = this.f12468c;
                o1Var3.f12482f.q(o1Var3.b(), this.f12468c.f24257b, bVarB.I(), 2, this.f12468c);
            } else {
                if (bVarB.I() != 18) {
                    this.f12468c.m(bVarB, this.f12467b.a());
                    return;
                }
                o1 o1Var4 = this.f12468c;
                Dialog dialogT = o1Var4.f12482f.t(o1Var4.b(), this.f12468c);
                o1 o1Var5 = this.f12468c;
                o1Var5.f12482f.u(o1Var5.b().getApplicationContext(), new m1(this, dialogT));
            }
        }
    }
}
