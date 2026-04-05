package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class e9 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f9 f13849d;

    public e9(f9 f9Var, long j2, long j3) {
        this.f13849d = f9Var;
        this.f13847b = j2;
        this.f13848c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13849d.f13892b.f14413a.d().r(new Runnable(this) { // from class: c.f.a.c.k.b.d9

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final e9 f13834b;

            {
                this.f13834b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e9 e9Var = this.f13834b;
                f9 f9Var = e9Var.f13849d;
                long j2 = e9Var.f13847b;
                long j3 = e9Var.f13848c;
                f9Var.f13892b.g();
                f9Var.f13892b.f14413a.c().v().a("Application going to the background");
                boolean z = true;
                if (f9Var.f13892b.f14413a.z().w(null, m3.v0)) {
                    f9Var.f13892b.f14413a.A().w.b(true);
                }
                Bundle bundle = new Bundle();
                if (!f9Var.f13892b.f14413a.z().C()) {
                    f9Var.f13892b.f14037e.b(j3);
                    if (f9Var.f13892b.f14413a.z().w(null, m3.m0)) {
                        h9 h9Var = f9Var.f13892b.f14037e;
                        long j4 = h9Var.f13953b;
                        h9Var.f13953b = j3;
                        bundle.putLong("_et", j3 - j4);
                        u7.x(f9Var.f13892b.f14413a.Q().s(true), bundle, true);
                    } else {
                        z = false;
                    }
                    f9Var.f13892b.f14037e.d(false, z, j3);
                }
                f9Var.f13892b.f14413a.F().Y("auto", "_ab", j2, bundle);
            }
        });
    }
}
