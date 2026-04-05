package c.f.a.c.d.v;

import android.os.Handler;
import c.f.a.c.j.c.w0;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<f0> f12153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f12154c;

    public h0(f0 f0Var) {
        this.f12153b = new AtomicReference<>(f0Var);
        this.f12154c = new w0(f0Var.getLooper());
    }

    @Override // c.f.a.c.d.v.j
    public final void C(d dVar) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0.f12135a.a("onApplicationStatusChanged", new Object[0]);
        this.f12154c.post(new m0(this, f0Var, dVar));
    }

    @Override // c.f.a.c.d.v.j
    public final void H1(int i2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.s(i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void V1(String str, String str2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0.f12135a.a("Receive (type=text, ns=%s) %s", str, str2);
        this.f12154c.post(new l0(this, f0Var, str, str2));
    }

    @Override // c.f.a.c.d.v.j
    public final void b2(p0 p0Var) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0.f12135a.a("onDeviceStatusChanged", new Object[0]);
        this.f12154c.post(new j0(this, f0Var, p0Var));
    }

    public final f0 c1() {
        f0 andSet = this.f12153b.getAndSet(null);
        if (andSet == null) {
            return null;
        }
        andSet.u();
        return andSet;
    }

    @Override // c.f.a.c.d.v.j
    public final void g0(int i2) {
        f0 f0VarC1 = c1();
        if (f0VarC1 == null) {
            return;
        }
        f0.f12135a.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i2));
        if (i2 != 0) {
            f0VarC1.triggerConnectionSuspended(2);
        }
    }

    @Override // c.f.a.c.d.v.j
    public final void i(c.f.a.c.d.d dVar, String str, String str2, boolean z) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.f12138d = dVar;
        f0Var.u = dVar.I();
        f0Var.v = str2;
        f0Var.f12145k = str;
        synchronized (f0.f12136b) {
            if (f0Var.z != null) {
                f0Var.z.a(new i0(new Status(0), dVar, str, str2, z));
                f0.d(f0Var, null);
            }
        }
    }

    @Override // c.f.a.c.d.v.j
    public final void m(int i2) {
    }

    @Override // c.f.a.c.d.v.j
    public final void m0(String str, long j2, int i2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.f(j2, i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void m1(int i2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.s(i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void p(int i2) {
    }

    @Override // c.f.a.c.d.v.j
    public final void q(int i2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.m(i2);
    }

    @Override // c.f.a.c.d.v.j
    public final void q1(String str, byte[] bArr) {
        if (this.f12153b.get() == null) {
            return;
        }
        f0.f12135a.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // c.f.a.c.d.v.j
    public final void s2(int i2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.u = null;
        f0Var.v = null;
        f0Var.s(i2);
        if (f0Var.f12140f != null) {
            this.f12154c.post(new k0(this, f0Var, i2));
        }
    }

    @Override // c.f.a.c.d.v.j
    public final void y(String str, double d2, boolean z) {
        f0.f12135a.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // c.f.a.c.d.v.j
    public final void z2(String str, long j2) {
        f0 f0Var = this.f12153b.get();
        if (f0Var == null) {
            return;
        }
        f0Var.f(j2, 0);
    }
}
