package c.f.a.c.f.o.n;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1<T> extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.o.j<T> f12392b;

    public e1(int i2, c.f.a.c.o.j<T> jVar) {
        super(i2);
        this.f12392b = jVar;
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void a(Status status) {
        this.f12392b.d(new c.f.a.c.f.o.b(status));
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void b(Exception exc) {
        this.f12392b.d(exc);
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void d(d0<?> d0Var) throws DeadObjectException {
        try {
            h(d0Var);
        } catch (DeadObjectException e2) {
            a(j1.e(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(j1.e(e3));
        } catch (RuntimeException e4) {
            this.f12392b.d(e4);
        }
    }

    public abstract void h(d0<?> d0Var);
}
