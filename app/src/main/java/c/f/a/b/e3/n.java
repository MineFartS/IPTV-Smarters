package c.f.a.b.e3;

import android.os.Handler;
import android.os.Looper;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.j0;
import c.f.a.b.p2;
import c.f.a.b.x2.a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<i0.b> f7861b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet<i0.b> f7862c = new HashSet<>(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.a f7863d = new j0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.a f7864e = new a0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Looper f7865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p2 f7866g;

    public final boolean A() {
        return !this.f7862c.isEmpty();
    }

    public abstract void B(c.f.a.b.i3.n0 n0Var);

    public final void C(p2 p2Var) {
        this.f7866g = p2Var;
        Iterator<i0.b> it = this.f7861b.iterator();
        while (it.hasNext()) {
            it.next().a(this, p2Var);
        }
    }

    public abstract void D();

    @Override // c.f.a.b.e3.i0
    public final void b(i0.b bVar) {
        this.f7861b.remove(bVar);
        if (!this.f7861b.isEmpty()) {
            f(bVar);
            return;
        }
        this.f7865f = null;
        this.f7866g = null;
        this.f7862c.clear();
        D();
    }

    @Override // c.f.a.b.e3.i0
    public final void d(Handler handler, j0 j0Var) {
        c.f.a.b.j3.g.e(handler);
        c.f.a.b.j3.g.e(j0Var);
        this.f7863d.a(handler, j0Var);
    }

    @Override // c.f.a.b.e3.i0
    public final void e(j0 j0Var) {
        this.f7863d.C(j0Var);
    }

    @Override // c.f.a.b.e3.i0
    public final void f(i0.b bVar) {
        boolean z = !this.f7862c.isEmpty();
        this.f7862c.remove(bVar);
        if (z && this.f7862c.isEmpty()) {
            y();
        }
    }

    @Override // c.f.a.b.e3.i0
    public final void i(Handler handler, c.f.a.b.x2.a0 a0Var) {
        c.f.a.b.j3.g.e(handler);
        c.f.a.b.j3.g.e(a0Var);
        this.f7864e.a(handler, a0Var);
    }

    @Override // c.f.a.b.e3.i0
    public final void j(c.f.a.b.x2.a0 a0Var) {
        this.f7864e.t(a0Var);
    }

    @Override // c.f.a.b.e3.i0
    public /* synthetic */ boolean n() {
        return h0.b(this);
    }

    @Override // c.f.a.b.e3.i0
    public /* synthetic */ p2 p() {
        return h0.a(this);
    }

    @Override // c.f.a.b.e3.i0
    public final void q(i0.b bVar, c.f.a.b.i3.n0 n0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f7865f;
        c.f.a.b.j3.g.a(looper == null || looper == looperMyLooper);
        p2 p2Var = this.f7866g;
        this.f7861b.add(bVar);
        if (this.f7865f == null) {
            this.f7865f = looperMyLooper;
            this.f7862c.add(bVar);
            B(n0Var);
        } else if (p2Var != null) {
            r(bVar);
            bVar.a(this, p2Var);
        }
    }

    @Override // c.f.a.b.e3.i0
    public final void r(i0.b bVar) {
        c.f.a.b.j3.g.e(this.f7865f);
        boolean zIsEmpty = this.f7862c.isEmpty();
        this.f7862c.add(bVar);
        if (zIsEmpty) {
            z();
        }
    }

    public final a0.a s(int i2, i0.a aVar) {
        return this.f7864e.u(i2, aVar);
    }

    public final a0.a t(i0.a aVar) {
        return this.f7864e.u(0, aVar);
    }

    public final j0.a v(int i2, i0.a aVar, long j2) {
        return this.f7863d.F(i2, aVar, j2);
    }

    public final j0.a w(i0.a aVar) {
        return this.f7863d.F(0, aVar, 0L);
    }

    public final j0.a x(i0.a aVar, long j2) {
        c.f.a.b.j3.g.e(aVar);
        return this.f7863d.F(0, aVar, j2);
    }

    public void y() {
    }

    public void z() {
    }
}
