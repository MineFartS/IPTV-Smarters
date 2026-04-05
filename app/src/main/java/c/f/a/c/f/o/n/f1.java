package c.f.a.c.f.o.n;

import android.os.DeadObjectException;
import android.util.Log;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.n.d;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class f1<A extends d<? extends c.f.a.c.f.o.j, a.b>> extends j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f12395b;

    public f1(int i2, A a2) {
        super(i2);
        this.f12395b = (A) c.f.a.c.f.q.o.j(a2, "Null methods are not runnable.");
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void a(Status status) {
        try {
            this.f12395b.s(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f12395b.s(new Status(10, sb.toString()));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void c(t tVar, boolean z) {
        tVar.a(this.f12395b, z);
    }

    @Override // c.f.a.c.f.o.n.j1
    public final void d(d0<?> d0Var) throws DeadObjectException {
        try {
            this.f12395b.q(d0Var.s());
        } catch (RuntimeException e2) {
            b(e2);
        }
    }
}
