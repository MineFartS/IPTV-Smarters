package c.f.a.c.f.o.n;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c.f.a.c.f.o.a;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class h1<ResultT> extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<a.b, ResultT> f12419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.c.o.j<ResultT> f12420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f12421d;

    public h1(int i2, r<a.b, ResultT> rVar, c.f.a.c.o.j<ResultT> jVar, q qVar) {
        super(i2);
        this.f12420c = jVar;
        this.f12419b = rVar;
        this.f12421d = qVar;
        if (i2 == 2 && rVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void a(Status status) {
        this.f12420c.d(this.f12421d.a(status));
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void b(Exception exc) {
        this.f12420c.d(exc);
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void c(t tVar, boolean z) {
        tVar.b(this.f12420c, z);
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void d(d0<?> d0Var) throws DeadObjectException {
        try {
            this.f12419b.b(d0Var.s(), this.f12420c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(j1.e(e3));
        } catch (RuntimeException e4) {
            this.f12420c.d(e4);
        }
    }

    @Override // c.f.a.c.f.o.n.o0
    public final c.f.a.c.f.d[] f(d0<?> d0Var) {
        return this.f12419b.d();
    }

    @Override // c.f.a.c.f.o.n.o0
    public final boolean g(d0<?> d0Var) {
        return this.f12419b.c();
    }
}
