package c.f.a.c.f.o.n;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f12479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<l1> f12480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f12481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.c.f.e f12482f;

    public o1(i iVar, c.f.a.c.f.e eVar) {
        super(iVar);
        this.f12480d = new AtomicReference<>(null);
        this.f12481e = new c.f.a.c.j.b.e(Looper.getMainLooper());
        this.f12482f = eVar;
    }

    public static final int n(l1 l1Var) {
        if (l1Var == null) {
            return -1;
        }
        return l1Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i2, int i3, Intent intent) {
        l1 l1Var = this.f12480d.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int iG = this.f12482f.g(b());
                if (iG == 0) {
                    l();
                    return;
                } else {
                    if (l1Var == null) {
                        return;
                    }
                    if (l1Var.b().I() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i3 == -1) {
            l();
            return;
        } else if (i3 == 0) {
            if (l1Var == null) {
                return;
            }
            m(new c.f.a.c.f.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, l1Var.b().toString()), n(l1Var));
            return;
        }
        if (l1Var != null) {
            m(l1Var.b(), l1Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f12480d.set(bundle.getBoolean("resolving_error", false) ? new l1(new c.f.a.c.f.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        l1 l1Var = this.f12480d.get();
        if (l1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", l1Var.a());
        bundle.putInt("failed_status", l1Var.b().I());
        bundle.putParcelable("failed_resolution", l1Var.b().K());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f12479c = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f12479c = false;
    }

    public final void l() {
        this.f12480d.set(null);
        p();
    }

    public final void m(c.f.a.c.f.b bVar, int i2) {
        this.f12480d.set(null);
        o(bVar, i2);
    }

    public abstract void o(c.f.a.c.f.b bVar, int i2);

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m(new c.f.a.c.f.b(13, null), n(this.f12480d.get()));
    }

    public abstract void p();

    public final void q(c.f.a.c.f.b bVar, int i2) {
        l1 l1Var = new l1(bVar, i2);
        if (this.f12480d.compareAndSet(null, l1Var)) {
            this.f12481e.post(new n1(this, l1Var));
        }
    }
}
