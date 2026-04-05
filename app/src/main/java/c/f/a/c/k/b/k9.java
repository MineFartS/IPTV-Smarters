package c.f.a.c.k.b;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class k9 extends f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f14035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j9 f14036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9 f14037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f9 f14038f;

    public k9(c5 c5Var) {
        super(c5Var);
        this.f14036d = new j9(this);
        this.f14037e = new h9(this);
        this.f14038f = new f9(this);
    }

    public static /* synthetic */ void o(k9 k9Var, long j2) {
        k9Var.g();
        k9Var.s();
        k9Var.f14413a.c().w().b("Activity resumed, time", Long.valueOf(j2));
        f fVarZ = k9Var.f14413a.z();
        l3<Boolean> l3Var = m3.v0;
        if (fVarZ.w(null, l3Var)) {
            if (k9Var.f14413a.z().C() || k9Var.f14413a.A().w.a()) {
                k9Var.f14037e.a(j2);
            }
            k9Var.f14038f.a();
        } else {
            k9Var.f14038f.a();
            if (k9Var.f14413a.z().C()) {
                k9Var.f14037e.a(j2);
            }
        }
        j9 j9Var = k9Var.f14036d;
        j9Var.f14013a.g();
        if (j9Var.f14013a.f14413a.k()) {
            if (!j9Var.f14013a.f14413a.z().w(null, l3Var)) {
                j9Var.f14013a.f14413a.A().w.b(false);
            }
            j9Var.b(j9Var.f14013a.f14413a.a().a(), false);
        }
    }

    public static /* synthetic */ void p(k9 k9Var, long j2) {
        k9Var.g();
        k9Var.s();
        k9Var.f14413a.c().w().b("Activity paused, time", Long.valueOf(j2));
        k9Var.f14038f.b(j2);
        if (k9Var.f14413a.z().C()) {
            k9Var.f14037e.b(j2);
        }
        j9 j9Var = k9Var.f14036d;
        if (j9Var.f14013a.f14413a.z().w(null, m3.v0)) {
            return;
        }
        j9Var.f14013a.f14413a.A().w.b(true);
    }

    @Override // c.f.a.c.k.b.f4
    public final boolean l() {
        return false;
    }

    public final void s() {
        g();
        if (this.f14035c == null) {
            this.f14035c = new c.f.a.c.j.h.u9(Looper.getMainLooper());
        }
    }
}
